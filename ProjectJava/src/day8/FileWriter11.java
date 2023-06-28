package day8;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter11 {

	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("C:\\Users\\w\\Desktop\\out.txt", true);
		for(int i = 11; i < 16; i++) {
			String data = "Line #" + i + "\n";
			fw.write(data);
		}
		fw.close();

	}

}
