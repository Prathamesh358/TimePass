package javapractices;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {

		File fileClass = new File("C:\\Users\\Prathamesh\\OneDrive\\Desktop\\My Workspace\\Testing.txt");
//		fileClass.createNewFile();

//		fileClass.delete();

		System.out.println(fileClass.length());

		FileWriter fileWriter = new FileWriter(fileClass);

		fileWriter.write("Welcome to Prathamesh Stack");

		fileWriter.close();

		FileReader fileReader = new FileReader(fileClass);

		int i;
		while ((i = fileReader.read()) != -1) {
			System.out.print((char) i);
		}
		
		fileReader.close();
		
	}

}
