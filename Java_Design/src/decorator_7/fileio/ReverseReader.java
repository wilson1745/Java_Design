package decorator_7.fileio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class ReverseReader extends BufferedReader {

	public ReverseReader(Reader in) {
		super(in);
	}

	public String reverseLine() throws IOException {
		String line = super.readLine();
		// String line = readLine();

		if (null == line) {
			return null;
		}

		return reverse(line);
	}

	private String reverse(String source) {
		String result = "";

		for (int i = 0; i < source.length(); i++) {
			result = source.charAt(i) + result;
		}

		return result;
	}
}
