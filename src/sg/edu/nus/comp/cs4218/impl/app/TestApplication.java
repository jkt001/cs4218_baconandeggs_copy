package sg.edu.nus.comp.cs4218.impl.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;

import sg.edu.nus.comp.cs4218.Application;
import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;

public class TestApplication implements Application {

	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout)
			throws AbstractApplicationException {
		BufferedReader in;
		

		if(stdin != null){
			 in = new BufferedReader( new InputStreamReader(stdin) );
				 
			String str;
			
			try {
				while ((str = in.readLine()) != null && str.length() != 0)
				     System.out.println("in.readLine: "+str);
				//get string from input stream
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		String result = "result";
		try {
			stdout.write(result.getBytes(Charset.forName("UTF-8")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
