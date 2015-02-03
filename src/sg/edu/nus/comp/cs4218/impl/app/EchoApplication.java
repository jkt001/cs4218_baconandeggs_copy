package sg.edu.nus.comp.cs4218.impl.app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

import sg.edu.nus.comp.cs4218.exception.EchoException;

public class EchoApplication {
	public void run(String[] args, InputStream stdin, OutputStream stdout) throws EchoException{
		if(args == null){
			throw new EchoException("Null arguments");
		}
		try {
			for(int i=0 ; i<args.length-1 ; i++){
				stdout.write(args[i].getBytes(Charset.forName("UTF-8")));
				stdout.write(" ".getBytes(Charset.forName("UTF-8")));
			}
			stdout.write(args[args.length-1].getBytes(Charset.forName("UTF-8")));
			stdout.write("\n".getBytes(Charset.forName("UTF-8")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
