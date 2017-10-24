package test;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test1 {
public static void main(String[] args) {

	Path path = Paths.get("src/fileIO/"); 
	try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
	    for (Path file: stream) {
	        System.out.println(file.getFileName());
			FileWriter writer = new FileWriter(file.toFile(), true);
			writer.write("//Copyright Rabby Sunders");
//			System.out.println(message);
			writer.close();
	    }
	} catch (IOException | DirectoryIteratorException x) {
	    // IOException can never be thrown by the iteration.
	    // In this snippet, it can only be thrown by newDirectoryStream.
	    System.err.println(x);
	}
}
}
//Copyright Rabby Sunders