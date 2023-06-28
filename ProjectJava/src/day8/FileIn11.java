package day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIn11 {

	public static void main(String[] args) throws IOException {
		byte[] content = new byte[1000];
		FileInputStream input = new FileInputStream("C:\\Users\\w\\Desktop\\out.txt");
		
		input.read(content);
		String allLine = new String(content);
		System.out.println(allLine);
		
		input.close();

	}

}
