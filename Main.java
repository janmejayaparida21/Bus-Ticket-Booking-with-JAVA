import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Welcome to OOP Tures&Travels");
		System.out.println("Your Fare is From Ahmedabad to Rajkot");

		//VerifyUser obj1 = new ChooseSeat();

		//obj1.UserName();
		
		Scanner s1 = new Scanner(System.in);
		String UserName = s1.nextLine();
		File f1 = new File(UserName);
		Main obj = new Main();
		
		if(f1.exists()==false)
		{
			f1.createNewFile();

			System.out.println("ENter the Gender and Age");
			String Gender = s1.nextLine();
			String Age = s1.nextLine();
			String PHNumber = s1.nextLine();
			
			FileWriter fw = new FileWriter(UserName,true);
			BufferedWriter bf = new BufferedWriter(fw);
			
			bf.write(UserName);
			bf.newLine();
			bf.write(Gender);
			bf.newLine();
			bf.write(Age);
			bf.newLine();
			bf.write(PHNumber);
			bf.newLine();
			
			bf.close();
			
			String d;
			FileReader fR=new FileReader(UserName);
			BufferedReader bf1 = new BufferedReader(fR);
			while((d=bf1.readLine())!=null)
				{
					System.out.println(d);
				}
			bf1.close();
		}
			
		else
		{
			
		


	}
}