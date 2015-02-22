package sg.edu.nus.comp.cs4218.impl.app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.exception.EchoException;

public class EchoApplication implements Application{

	public void run(String[] args, InputStream stdin, OutputStream stdout) throws EchoException{
		if(args == null){
			throw new EchoException("Null arguments");
		}
		if(stdout == null){
			throw new EchoException("OutputStream not provided");
		}
		try {
			if(args.length==0){
				stdout.write("\n".getBytes());
			}else{
				for(int i=0 ; i<args.length-1 ; i++){
					stdout.write(args[i].getBytes());
					stdout.write(" ".getBytes());
				}
				stdout.write(args[args.length-1].getBytes());
				stdout.write("\n".getBytes());
			}
		} catch (IOException e) {
			throw new EchoException("IOException");
		}
	}

}
