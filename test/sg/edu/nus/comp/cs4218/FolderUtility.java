package sg.edu.nus.comp.cs4218;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import org.junit.Test;

/**
 * The FolderUtility class makes it easy to generate and delete folders for
 * testing purposes.
 * 
 * <p>
 * When testing, there is sometimes the need to generate a reasonably complex
 * folder structure to test the behavior of the application. However, manually
 * creating folders, then subfolders, and their contents, can be very
 * long-winded in Java. This class aims to simplify such tasks.
 * </p>
 * 
 * <p>
 * For example, to generate a folder structure like the following:
 * 
 * <pre>
 * +--F1
 * |  +--a.txt
 * |  \--b.txt
 * +--F2
 * |  +--F2a
 *    |  \--c.txt
 * |  +--d.txt
 * |  \--e.txt
 * \--F3
 * </pre>
 * 
 * can be easily done with the following code:
 * 
 * <pre>
 * FolderUtility.generate("testFolder", 
 *     new TestFolder("F1",
 *         new TestFile("a.txt", "dataA"),
 *         new TestFile("b.txt", "dataB"),
 *     ),
 *     new TestFolder("F2",
 *         new TestFolder("F2a",
 *             new TestFile("c.txt", "dataC")
 *         ),
 *         new TestFile("d.txt", "dataD"),
 *         new TestFile("e.txt", "dataE"),
 *     ),
 *     new TestFolder("F3")
 * );
 * </pre>
 */
public final class FolderUtility {
	
	private FolderUtility(){
		// Don't need to have constructor for this utility class
	}
	
	public interface TestEntry {
		public String getName(); 
	};

	/**
	 * The TestFolder class represents a folder for the generation method.
	 */
	public static class TestFolder implements TestEntry {
		String name;
		TestEntry[] contents;
		
		/**
		 *  Creates a new TestFolder.
		 * 
		 * @param name
		 *            The name of the folder.
		 * @param contents
		 *            One or more TestFolder(s) or TestFile(s) to be placed in
		 *            this folder.
		 */
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
	
	/**
	 * The TestFile class represents a folder for the generation method.
	 */
	public static class TestFile implements TestEntry {
		
		String name;
		String data;
		
		/**
		 * Creates a new TestFile.
		 * 
		 * @param name
		 *            The name of the file.
		 * @param data
		 *            The string that will be written into the file.
		 */
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
	
	/**
	 * Generates a folder structure based on the contents provided.
	 * 
	 * @param	path
	 * 			A path whereby the folder structure will be generated in.
	 * @param	contents
	 * 			One or more TestFile(s) or TestFolder(s) that will be generated.
	 * 
	 * @throws	IOException
	 * 			If an I/O exception occurs when generating the folder structure.
	 */
	public static void generate(String path, TestEntry... contents) throws IOException{
		for (int i = 0; i < contents.length; i++) {
			TestEntry entry = contents[i];
			if (entry instanceof TestFolder){
				TestFolder folder = (TestFolder) entry;
				Path newFolderPath = Paths.get(path, folder.getName()).toAbsolutePath();
				Files.createDirectories(newFolderPath);
				// System.out.println(newFolderPath.toString());
				generate(newFolderPath.toString(), folder.getContents());				
			}else if (entry instanceof TestFile){
				TestFile file = (TestFile) entry;
				Path newFilePath = Paths.get(path, file.getName()).toAbsolutePath();
				// System.out.println(newFilePath.toString());
				Files.write(newFilePath, file.getData().getBytes());
			}
		}
	}
	
	/**
	 * Deletes a folder and all its contents.
	 * 
	 * @param	path
	 * 			The path to the folder to delete.
	 * @throws	IOException
	 * 			If an I/O exception occurs when deleting the folder.
	 */
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

}
