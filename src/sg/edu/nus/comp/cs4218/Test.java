package sg.edu.nus.comp.cs4218;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(Environment.currentDirectory).resolve("test.txt");
//		FileOutputStream out = new FileOutputStream(new File(path.toString()));
		File file = path.toFile();
		file.delete();
		
		
//		String s = "Hi";
//		out.write(s.getBytes());
//		out.close();
//		System.setProperty("java.io.tmpdir", Environment.currentDirectory);
//		System.out.println(file.getAbsolutePath());
	}
}
