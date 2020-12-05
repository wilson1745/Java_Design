package decorator_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import decorator_7.fileio.ReverseReader;

public class JavaIOTest {

	@Test
	@SuppressWarnings("resource")
	public void test() throws IOException {
		System.out.println("==== FileReader read file ====");
		FileReader reader = new FileReader("test.txt");

		int c = reader.read();
		while (c >= 0) {
			System.out.print((char) c);
			c = reader.read();
		}

		System.out.println("==== BufferedReader read file ====");
		BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));

		String line = bufferedReader.readLine();
		while (line != null) {
			System.out.println(line);
			line = bufferedReader.readLine();
		}

		// ReverseReader extends BufferedReader, so it can use readline()
		System.out.println("==== ReverseReader read file ====");
		ReverseReader reverseReader = new ReverseReader(new FileReader("test.txt"));

		String rLine = reverseReader.reverseLine();
		while (rLine != null) {
			System.out.println(rLine);
			rLine = reverseReader.reverseLine();
		}

	}
}
