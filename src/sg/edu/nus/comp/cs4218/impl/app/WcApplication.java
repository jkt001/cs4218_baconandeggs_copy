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
	boolean printChar = false, printWord = false, printLine = false;

	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout) throws WcException {
		if (args == null){
			throw new WcException("Null arguments");
		}
		if(stdout == null){
			throw new WcException("OutputStream not provided");	
		}

		String filePath[] = parseArgument(args);

		if(filePath.length==0){
			writeWordCountsToOutputStream(wordCount(stdin), stdout);
		}else{
			try {
				for(int i=0;i<filePath.length ; i++){
					
					File file = new File(filePath[i]);
					if(!file.exists()){
						throw new WcException("File Not Found.");
					}
					if(!file.canRead()){
						throw new WcException("Don't have read permission");	
					}
					InputStream myInputStream = new FileInputStream(file);
					if(filePath.length>1){
						stdout.write(filePath[i].getBytes());
						stdout.write("\n".getBytes());
					}
					writeWordCountsToOutputStream(wordCount(myInputStream), stdout);
					myInputStream.close();
				}
			} catch (FileNotFoundException e) {
				throw new WcException("File Not Found.");
			} catch (IOException e) {
				throw new WcException("IOException.");
			}
		}
	}

	void writeWordCountsToOutputStream(int counts[], OutputStream stdout) throws WcException{
		String outputStr = "";
		if(printChar){
			outputStr += counts[0];
		}
		if(printWord){
			if(outputStr.length()>0){
				outputStr += "\t";
			}
			outputStr += counts[1];
		}
		if(printLine){
			if(outputStr.length()>0){
				outputStr += "\t";
			}
			outputStr += counts[2];
		}
		outputStr += "\n";
		try {
			stdout.write(outputStr.getBytes());
		} catch (IOException e) {
			throw new WcException("IOException");
		}
	}

	//return array of filePath string
	String[] parseArgument(String... args) throws WcException{
		String filePath[] = new String[args.length];
		int pathCount = 0;
		boolean isOptionSet = false;
		for(int i=0;i<args.length;i++){
			if(args[i].startsWith("-")){
				String str = args[i];
				for(int j=1 ; j<str.length() ; j++){
					switch(args[i].charAt(j)){
						case 'm':
							printChar = true;
							isOptionSet = true;
							break;
						case 'w':
							printWord = true;
							isOptionSet = true;
							break;
						case 'l':
							printLine = true;
							isOptionSet = true;
							break;
						default:
							throw new WcException("Invalid flag");
					}
				}
			}else{
				filePath[pathCount++] = args[i];
			}
		}

		if(!isOptionSet){
			printChar = true;
			printWord = true;
			printLine = true;
		}

		String[] temp = new String[pathCount];
		for(int i=0;i<pathCount ; i++){
			temp[i] = filePath[i];
		}
		return temp;
	}

	int[] wordCount(InputStream stdin) throws WcException{
		String fileLine;
		int charCount = 0, wordCount = 0, lineCount = 0;
		BufferedReader myBufferedReader = new BufferedReader(new InputStreamReader(stdin));
		try {
			while((fileLine = myBufferedReader.readLine())!= null){
				for(int i=0;i<fileLine.length();i++){
					charCount++;
					if(Character.isWhitespace(fileLine.charAt(i)) && i!=fileLine.length()-1 && !Character.isWhitespace(fileLine.charAt(i+1))){
						wordCount++;
					}
				}
				if(!"".equals(fileLine)){
					wordCount++;//last word
				}
				charCount++;//line character
				lineCount++;
			}
		} catch (IOException e) {
			throw new WcException("IOException");
		}
		return new int[]{charCount, wordCount, lineCount};
	}

}
