package sg.edu.nus.comp.cs4218.impl.app;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

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
		if (args.length > 1) {
			throw new LsException("Too many parameters");
		}
		
		String directory;
		if(args.length == 0){
			directory = Environment.currentDirectory;
		}else{
			directory = args[0];
		}
		
        String str[] = getListOfFileFromDirectory(directory);
		writeStringToOutputStream(str, stdout);
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
					stdout.write(str[i].getBytes(Charset.forName("UTF-8")));
					stdout.write("\t".getBytes(Charset.forName("UTF-8")));
				}			
			}
			stdout.write(str[str.length-1].getBytes(Charset.forName("UTF-8")));
			stdout.write("\n".getBytes(Charset.forName("UTF-8")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}