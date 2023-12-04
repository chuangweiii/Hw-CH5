package pb;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class P35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileWriter fw = new FileWriter("test1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello!");
			pw.println("GoodBye!");
			
			pw.close();
			
			System.out.println("資料已經寫入檔案了");
		}
		
		catch(IOException e)
		{
			System.out.println("輸出入有誤");
		}
	}

}
