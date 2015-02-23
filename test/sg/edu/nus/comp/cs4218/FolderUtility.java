package sg.edu.nus.comp.cs4218;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public final class FolderUtility {
	
	private FolderUtility(){
		// Don't need to have constructor for this utility class
	}
	
	public interface TestEntry {
		public String getName(); 
	};
	
	public static class TestFolder implements TestEntry {
		String name;
		TestEntry[] contents;
		
		public TestFolder(String name, TestEntry... contents) {
			super();
			this.name = name;
			this.contents = contents;
		}
		
		@Override
		public String getName() {
			return name;
		}

		public TestEntry[] getContents() {
			return contents;
		}
		
	}
	
	public static class TestFile implements TestEntry {
		
		String name;
		String data;
		
		public TestFile(String name, String data) {
			super();
			this.name = name;
			this.data = data;
		}

		@Override
		public String getName() {
			return name;
		}
		
		public String getData() {
			return data;
		}
		
	}
	
	public static void generate(String path, TestEntry... contents) throws IOException{
		for (int i = 0; i < contents.length; i++) {
			TestEntry entry = contents[i];
			if (entry instanceof TestFolder){
				TestFolder folder = (TestFolder) entry;
				Path newFolderPath = Paths.get(path, folder.getName()).toAbsolutePath();
				Files.createDirectories(newFolderPath);
				System.out.println(newFolderPath.toString());
				generate(newFolderPath.toString(), folder.getContents());				
			}else if (entry instanceof TestFile){
				TestFile file = (TestFile) entry;
				Path newFilePath = Paths.get(path, file.getName()).toAbsolutePath();
				System.out.println(newFilePath.toString());
				Files.write(newFilePath, file.getData().getBytes());
			}
		}
	}
	
	public static void delete(String path) throws IOException{
		Path pathToDelete = Paths.get(path);
		Files.walkFileTree(pathToDelete, new SimpleFileVisitor<Path>() {
			
			@Override
			public FileVisitResult visitFile(Path file,
					BasicFileAttributes attrs) throws IOException {
				Files.delete(file);
				return FileVisitResult.CONTINUE;
			}

			@Override
			public FileVisitResult postVisitDirectory(Path dir, IOException exc)
					throws IOException {
				Files.delete(dir);
				return FileVisitResult.CONTINUE;
			}

		});
	}
	
	/*
	public static void main(String args[]) throws IOException{
		
		FolderUtility.generate("testFolder", 
			new TestFolder("F1",
					new TestFile("a.txt", "hello world A"),
					new TestFile("b.txt", "hello world B"),
					new TestFile("c.txt", "hello world C")
			),
			new TestFolder("F2",
					new TestFile("d.txt", "hello world D"),
					new TestFile("e.txt", "hello world E"),
					new TestFile("f.txt", "hello world F"),
					new TestFolder("F3",
							new TestFile("g.txt", "hello world G"),
							new TestFile("h.txt", "hello world H"),
							new TestFile("i.txt", "hello world I")
					)
			),
			new TestFile("Data.txt", "data")
		);
	}
	*/

}
