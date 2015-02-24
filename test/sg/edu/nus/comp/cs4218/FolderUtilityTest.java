package sg.edu.nus.comp.cs4218;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import sg.edu.nus.comp.cs4218.FolderUtility.TestFile;
import sg.edu.nus.comp.cs4218.FolderUtility.TestFolder;

public class FolderUtilityTest {

	private static final String TEST_FOLDER = "testFolder";

	@Test
	public void test() throws IOException {
		FolderUtility.generate(TEST_FOLDER, 
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
			new TestFile("j.txt", "data")
		);
		
		// Expected files in folder
		String[] expectedOutput = {
				// test folder itself
				TEST_FOLDER,
				// the folders
				TEST_FOLDER + File.separator + "F1",
				TEST_FOLDER + File.separator + "F2",
				TEST_FOLDER + File.separator + "F2" + File.separator + "F3",
				// the files
				TEST_FOLDER + File.separator + "F1"	+ File.separator + "a.txt",
				TEST_FOLDER + File.separator + "F1"	+ File.separator + "b.txt",
				TEST_FOLDER + File.separator + "F1"	+ File.separator + "c.txt",
				TEST_FOLDER + File.separator + "F2" + File.separator + "d.txt",
				TEST_FOLDER + File.separator + "F2" + File.separator + "e.txt",
				TEST_FOLDER + File.separator + "F2" + File.separator + "f.txt",
				TEST_FOLDER + File.separator + "F2" + File.separator + "F3" + File.separator + "g.txt",
				TEST_FOLDER + File.separator + "F2" + File.separator + "F3" + File.separator + "h.txt",
				TEST_FOLDER + File.separator + "F2" + File.separator + "F3" + File.separator + "i.txt",				
				TEST_FOLDER + File.separator + "j.txt"
		};
		
		// Walk through the test folder to get the generated file list
		final List<String> actualOutput = new LinkedList<String>();
		Files.walkFileTree(Paths.get(TEST_FOLDER), new SimpleFileVisitor<Path>(){

			@Override
			public FileVisitResult visitFile(Path file,
					BasicFileAttributes attrs) throws IOException {
				actualOutput.add(file.toString());
				return FileVisitResult.CONTINUE;
			}

			@Override
			public FileVisitResult postVisitDirectory(Path dir, IOException exc)
					throws IOException {
				actualOutput.add(dir.toString());
				return FileVisitResult.CONTINUE;
			}
			
		});
		
		// Sort to make the array comparison position independent
		Arrays.sort(expectedOutput);
		Collections.sort(actualOutput);
		
		// Assert contents of generated folder matches
		assertArrayEquals(expectedOutput, actualOutput.toArray());
		
		// Delete folder to clean up
		FolderUtility.delete(TEST_FOLDER);
		
		// Assert that folder was deleted successfully
		assertTrue(Files.notExists(Paths.get(TEST_FOLDER)));
	}
	
	

}
