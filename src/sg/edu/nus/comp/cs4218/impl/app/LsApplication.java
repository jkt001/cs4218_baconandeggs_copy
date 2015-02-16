package sg.edu.nus.comp.cs4218.impl.app;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.LsException;

public class LsApplication implements Application{

	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout)
			throws LsException {
		if (args == null){
			throw new LsException("Null arguments");
		}
		if (stdout == null) {
			throw new LsException("OutputStream not provided");
		}
		
		if(args.length == 0){
	        String str[] = getListOfFileFromDirectory(Environment.currentDirectory);
			writeStringToOutputStream(str, stdout);
		}else if(args.length == 1){
			String str[] = getListOfFileFromDirectory(args[0]);
			writeStringToOutputStream(str, stdout);
		}else{
			for(int i=0 ; i<args.length ; i++){
				String str[] = {args[i]+File.separator+":"};
				writeStringToOutputStream(str, stdout);
		        str = getListOfFileFromDirectory(args[i]);
				writeStringToOutputStream(str, stdout);
				if(i<args.length-1){
					str = new String[1];
					str[0] = "";
					writeStringToOutputStream(str, stdout);
				}
			}
		}
	}
	
	protected String[] getListOfFileFromDirectory(String directory) throws LsException{
		File theDir = new File(directory);
		
		if(!theDir.isDirectory()){
			throw new LsException("Directory does not exist");
		}
		
        return theDir.list();
	}
	
	protected void writeStringToOutputStream(String[] str, OutputStream stdout){
		try {
			for(int i=0;i<str.length-1;i++){
				if(!str[i].startsWith(".")){
					stdout.write(str[i].getBytes());
					stdout.write("\t".getBytes());
				}			
			}
			stdout.write(str[str.length-1].getBytes());
			stdout.write("\n".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}