package general;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadExample {

	public void usingFileReaderBufferedReader() throws IOException
	{
		
		FileReader file = new FileReader("D:\\Screenshot\\file1.txt");
		BufferedReader br = new BufferedReader(file);

		String str;
		while((str=br.readLine())!= null)
		{
			System.out.println(str);
		}

	}


	public void usingFileReaderScanner() throws FileNotFoundException
	{
		FileReader file = new FileReader("D:\\Screenshot\\file2.txt");
		Scanner sc =new Scanner(file);	
		sc.useDelimiter("\\Z");
		{
			System.out.println(sc.next());
		}

	}

	public void usingFileScanner() throws FileNotFoundException 
	{
		File file =  new File("D:\\\\Screenshot\\file3.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
	}





	public static void main(String[] args) throws IOException {
		FileReadExample fileReadExample = new FileReadExample();
		fileReadExample.usingFileReaderBufferedReader();
		fileReadExample.usingFileReaderScanner();
		fileReadExample.usingFileScanner();
	}

}
