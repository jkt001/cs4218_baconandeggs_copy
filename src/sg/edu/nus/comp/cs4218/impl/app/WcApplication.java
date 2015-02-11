package sg.edu.nus.comp.cs4218.impl.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.exception.WcException;

public class WcApplication implements Application {

	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout)
			throws WcException {
		
		if (args == null){
			throw new WcException("Null arguments");
		}

		String filePath = "";
		boolean printChar = false;
		boolean printWord = false;
		boolean printLine = false;
		boolean isOptionSet = false;
		for(int i=0;i<args.length;i++){
			if(args[i].equals("m")){
				printChar = true;
				isOptionSet = true;
			}else if (args[i].equals("w")){
				printWord = true;
				isOptionSet = true;
			}else if (args[i].equals("l")){
				printLine = true;
				isOptionSet = true;
			}else{
				filePath = args[i];
			}
		}

		if(!isOptionSet){
			printChar = true;
			printWord = true;
			printLine = true;
		}
		
		InputStream myInputStream;
		if(!filePath.equals("")){
			File file = new File(filePath);
			try {
				myInputStream = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				throw new WcException("File Not Found.");
			}
		}else{
			myInputStream = stdin;
		}

		int count[] = wordCount(myInputStream);
		String outputStr = "";
		try{
			if(printChar){
				outputStr += count[0];
			}
			if(printWord){
				if(outputStr.length()>0){
					outputStr += "\t";
				}
				outputStr += count[1];
			}
			if(printLine){
				if(outputStr.length()>0){
					outputStr += "\t";
				}
				outputStr += count[2];
			}
			stdout.write(outputStr.getBytes());
		}catch(Exception ec){

		}
	}

	public int[] wordCount(InputStream stdin){
		String fileLine;
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(stdin));
		try {
			while((fileLine = br.readLine())!= null){
				for(int i=0;i<fileLine.length();i++){
					charCount++;
					if(Character.isWhitespace(fileLine.charAt(i)) && i!=fileLine.length() && Character.isLetter(fileLine.charAt(i+1))){
						wordCount++;
					}
				}
				if(!fileLine.equals("")){
					wordCount++;//last word
				}
				charCount++;//line character
				lineCount++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int count[] = {charCount, wordCount, lineCount};
		return count;
	}

}
