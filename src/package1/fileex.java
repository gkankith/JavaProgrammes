package package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class fileex {

	public static void main(String[] args) throws IOException {
		File f=new File("E:\\filehadling\\file creation\\W.text");
		System.out.println(f.exists());
		PrintWriter p=new PrintWriter(f);
		p.print("hello");
		p.print("file");
		p.print(100);
		p.println("welcome");
		
		p.close();
		
		//reading
		FileReader ob=new FileReader(f);
		BufferedReader bf=new BufferedReader(ob);
		String data =bf.readLine();
		
		while(data!=null)
		{
			
		}
		
		
		
		System.out.println(f.canExecute());
		System.out.println();

	}

}
