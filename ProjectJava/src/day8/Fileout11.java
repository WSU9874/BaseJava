package day8;

import java.io.*;

public class Fileout11 {

	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("C:\\Users\\w\\Desktop\\out.txt");
		
		for(int i = 1; i < 11; i++) {
			String data = "Line #" + i + "\n";
				output.write(data.getBytes());
		}
		output.close();
		
		

	}
}
