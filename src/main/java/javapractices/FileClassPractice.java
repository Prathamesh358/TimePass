package javapractices;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClassPractice {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Prathamesh\\OneDrive\\Desktop\\My Workspace\\testing.txt");
//		file.createNewFile();

//		file.delete();
//		System.out.println(file.length());

		FileWriter fileWriter = new FileWriter(file);

		fileWriter.write("Welcome to Akash Patil Constructions");
		fileWriter.close();

//		System.out.println(file.length());

		FileReader fileReader = new FileReader(file);

		int i;
		while ((i = fileReader.read()) != -1) {
			System.out.print((char) i);
		}

	}

}