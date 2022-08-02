package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BusinessOperations {

	// File listing function
	public static void listCurrentFiles() {

		int fileCount = 0;
		ArrayList<String> filenames = new ArrayList<String>();

		File directoryPath = new File(System.getProperty("user.dir"));
		File[] listOfFiles = directoryPath.listFiles();
		fileCount = listOfFiles.length;

		System.out.println("List of Files available: ");
		for (int i = 0; i < fileCount; i++) {
			if (listOfFiles[i].isFile()) {
				filenames.add(listOfFiles[i].getName());
			}
		}
		Collections.sort(filenames);

		for (String currentFile : filenames) {
			System.out.println(currentFile);
		}
		System.out.println("Your files are sorted and displayed!");

	}

	// File delete function
	public static void deleteFile(String fileToBeDeleted) {

		File file = new File((System.getProperty("user.dir")) + "\\" + fileToBeDeleted);

		if (file.exists()) {
			if (file.delete()) {
				System.out.println("Hoorah! File deleted successfully!");
			}
		} else {
			System.out.println("Sorry, File wasn't deleted (File Not Found)");
		}
	}

	// File search function
	public static void searchFile(String fileToBeSearched) {

		File file = new File((System.getProperty("user.dir")) + "\\" + fileToBeSearched);
		if (file.exists()) {
			System.out.println("Yep! File found!");
		} else {
			System.out.println("Sorry,File is Not Found");
		}
		PrintWriter pw;
		try {
			pw = new PrintWriter(fileToBeSearched); // may throw exception
			pw.println("saved");
		}
		// providing the checked exception handler
		catch (FileNotFoundException e) {

			System.out.println(e);
		}
	}

	// File creation function
	public static void createFile(String fileToBeCreated) {
		File file = new File((System.getProperty("user.dir")) + "\\" + fileToBeCreated);

		try {
			if (file.createNewFile()) {
				System.out.println("File Created!");
				System.out.println("Do you want something to add in a file,\nChoose any one option");
				System.out.println("1.Yes 2.No");
				Scanner sc = new Scanner(System.in);
				InputStreamReader ir = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(ir);
				int input = sc.nextInt();
		
				switch (input) {
				case 1:
					FileWriter writer = new FileWriter(file);
					System.out.println("write ant text to enter");
					String a = br.readLine();
					writer.write(a);
					writer.flush();
					System.out.println("Text is wrriten to the file successfully");
					break;
				case 2:
					break;
				default:
					System.out.println("Invalid Input Tryagain!");
					break;
				}
				
			} else {
				System.out.println("File already exists :(");
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
