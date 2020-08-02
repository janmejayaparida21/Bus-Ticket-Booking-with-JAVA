import java.util.*;
import java.io.*;

class choose 
{
	public void ABDRJT() throws IOException
	{
		System.out.print("Your route is from Ahmedabad to Rajkot\nYour Ticket charge is 399\n");
		
		System.out.print("Welcome to OOP Tures&Travels\n");
		System.out.println("Your Fare is From Ahmedabad to Rajkot");

		Scanner s1 = new Scanner(System.in);
		
		System.out.println("For new Booking press 1, existing booking press 2");
		int LogSign;
		LogSign = s1.nextInt();		

			Scanner s2 = new Scanner(System.in);
			System.out.println("Enter the UserName");
			String UserName = s2.nextLine();
			File f1 = new File("D:/5_Sem_3/Java_Project/ABDRJT/"+UserName+".txt");	
						
			String pass=UserName+"_pwd";
			File f2 = new File("D:/5_Sem_3/Java_Project/ABDRJT/"+pass+".txt");
			
		
		switch(LogSign)
		{
			case 1:
			{
				Scanner ss = new Scanner(System.in);
				System.out.println("How many seat you want to book, maximum limit is 3\n");
				int tk;
				tk = ss.nextInt();
				if(tk==0&&tk>=4)
				{
					break;
				}
				for(int i=0;i<tk;i++)
				{	
					if(f1.exists()==false)
					{
						f1.createNewFile();
	
						System.out.println("set password : ");
						String Password=s2.nextLine();
						
						FileWriter fp = new FileWriter("D:/5_Sem_3/Java_Project/ABDRJT/"+pass+".txt");
						BufferedWriter fpass = new BufferedWriter(fp);
						
						fpass.write(Password);
						fpass.close();
						
					}
						int Gender = 0;
						String Gen;
						while(Gender<1||Gender>3)
						{
							try
							{
								System.out.print("Enter the Gender:\n1) Male\n2) Female\n3) Other  ");
								Gender = s2.nextInt();
							}
							catch(InputMismatchException e)
							{
									s2.nextInt();
							}
						}
								if(Gender == 1)
								{
									Gen="MALE";
								}
								else if(Gender == 2)
								{
									Gen="FEMALE";
								}
								else
								{
									Gen="OTHER";
								}

						System.out.println("ENter the Age: ");
						int Age1 = 0;
						while(Age1<12||Age1>80)
						{
							try
							{
								Age1 = s2.nextInt();
							}
							catch(InputMismatchException e)
							{
									s2.nextInt();
							}
						}
						int Age=Age1;
						
					
						System.out.println("ENter the Phone Number: ");
						int PHNumber = 0;
						
						while(PHNumber<1000000||PHNumber>9999999)
						{
							try
							{
								PHNumber = s2.nextInt();
							}
							catch(InputMismatchException e)
							{
									s2.nextInt();
							}
						}
						
						FileWriter fw = new FileWriter("D:/5_Sem_3/Java_Project/ABDRJT/"+UserName+".txt",true);
						BufferedWriter bf = new BufferedWriter(fw);
						
						bf.write("I'd :         "+UserName);
						bf.newLine();
						bf.write("Gender :      "+Gen);
						bf.newLine();
						bf.write("Age :         "+Age);
						bf.newLine();
						bf.write("PhoneNumber : "+PHNumber);
						bf.newLine();
						
						bf.close();
						
						String d;
						FileReader fr=new FileReader("D:/5_Sem_3/Java_Project/ABDRJT/"+UserName+".txt");
						BufferedReader bf1 = new BufferedReader(fr);
						while((d=bf1.readLine())!=null)
							{
								System.out.println(d);
							}
						bf1.close();
						
						int p=0;
						while(p==0)
						{
							Scanner SN = new Scanner(System.in);
							System.out.println("Enter the seat number you want to book");
							String Seatnumber = SN.nextLine();
							
							File f3 = new File("D:/5_Sem_3/Java_Project/ABDRJT/"+Seatnumber+".txt");
							
							if(f3.exists()==true)
							{
								System.out.println("Choose another Seat");
								p=0;							
							}
							else
							{
								p=1;
								f3.createNewFile();
								
								FileWriter SN1 = new FileWriter("D:/5_Sem_3/Java_Project/ABDRJT/"+Seatnumber+".txt");
								BufferedWriter SN2 = new BufferedWriter(SN1);
								
								SN2.write(Seatnumber);
								SN2.close();	
				
								String e;
								FileReader SN3=new FileReader("D:/5_Sem_3/Java_Project/ABDRJT/"+Seatnumber+".txt");
								BufferedReader SN4 = new BufferedReader(SN3);	
								System.out.print("Ticket Booked sucessfully and seatnumber is : ");
								while((e=SN4.readLine())!=null)
								{
									System.out.println(e);
								}
								SN4.close();
							}
							
														
						}
						
						
				}
			break;
			}
			
			
			case 2:
			{
				boolean k;
				Scanner s3 = new Scanner(System.in);
			
				
				if(f1.exists()==false)
				{
					System.out.println("User doesn't exists");
					break;
				}
				System.out.println("enter the password : ");
				String upass=s3.nextLine();
				
				
				FileReader op=new FileReader("D:/5_Sem_3/Java_Project/ABDRJT/"+pass+".txt");
				BufferedReader bf2 = new BufferedReader(op);
				String rf=bf2.readLine();
				if((k=rf.equals(upass))==true)
				{
					System.out.println("Do you Want to cencel the ticket press 1 or,\n If you want to know the your details press 2");
					int choice;
					choice = s3.nextInt();
					
					switch(choice)
					{
						case 1:
						{
							f1.delete();
							System.out.println("Sucessfully cancelled\n");
							break;
						}
						
						case 2:
						{
							String d;
							FileReader fr=new FileReader("D:/5_Sem_3/Java_Project/ABDRJT/"+UserName+".txt");
							BufferedReader bf1 = new BufferedReader(fr);
							while((d=bf1.readLine())!=null)
							{
								System.out.println(d);
							}
							bf1.close();
							break;
						}
					}
				}
				break;
			}
		}
		
	}

	public void ABDVDDR() throws IOException
	{
		System.out.print("Your route is from Ahmedabad to Vadodara\nYour Ticket charge is 199\n");
		
		System.out.print("Welcome to OOP Tures&Travels\n");
		System.out.println("Your Fare is From Ahmedabad to Vadodara");

		Scanner s1 = new Scanner(System.in);
		
		System.out.println("For new Booking press 1, existing booking press 2");
		int LogSign;
		LogSign = s1.nextInt();		

			Scanner s2 = new Scanner(System.in);
			System.out.println("Enter the UserName");
			String UserName = s2.nextLine();
			File f1 = new File("D:/5_Sem_3/Java_Project/ABDVDDR/"+UserName+".txt");	

						
			String pass=UserName+"_pwd";
			File f2 = new File("D:/5_Sem_3/Java_Project/ABDVDDR/"+pass+".txt");

			
		
		switch(LogSign)
		{
			case 1:
			{
				Scanner ss = new Scanner(System.in);
				System.out.println("How many seat you want to book, maximum limit is 3\n");
				int tk;
				tk = ss.nextInt();
				if(tk==0&&tk>=4)
				{
					break;
				}
				for(int i=0;i<tk;i++)
				{	
					if(f1.exists()==false)
					{
						f1.createNewFile();
						System.out.println("set password : ");
						String Password=s2.nextLine();
						
						FileWriter fp = new FileWriter("D:/5_Sem_3/Java_Project/ABDVDDR/"+pass+".txt");
						BufferedWriter fpass = new BufferedWriter(fp);
						
						fpass.write(Password);
						fpass.close();
						
					}
						int Gender = 0;
						String Gen;
						while(Gender<1||Gender>3)
						{
							try
							{
								System.out.print("Enter the Gender:\n1) Male\n2) Female\n3) Other  ");
								Gender = s2.nextInt();
							}
							catch(InputMismatchException e)
							{
									s2.nextInt();
							}
						}
								if(Gender == 1)
								{
									Gen="MALE";
								}
								else if(Gender == 2)
								{
									Gen="FEMALE";
								}
								else
								{
									Gen="OTHER";
								}

						System.out.println("ENter the Age: ");
						int Age1 = 0;
						while(Age1<12||Age1>80)
						{
							try
							{
								Age1 = s2.nextInt();
							}
							catch(InputMismatchException e)
							{
									s2.nextInt();
							}
						}
						int Age=Age1;
						
			
						System.out.println("ENter the Phone Number: ");
						int PHNumber = 0;
						
						while(PHNumber<1000000||PHNumber>9999999)
						{
							try
							{
								PHNumber = s2.nextInt();
							}
							catch(InputMismatchException e)
							{
									s2.nextInt();
							}
						}
						
						FileWriter fw = new FileWriter("D:/5_Sem_3/Java_Project/ABDVDDR/"+UserName+".txt",true);
						BufferedWriter bf = new BufferedWriter(fw);
						
						bf.write("I'd :         "+UserName);
						bf.newLine();
						bf.write("Gender :      "+Gen);
						bf.newLine();
						bf.write("Age :         "+Age);
						bf.newLine();
						bf.write("PhoneNumber : "+PHNumber);
						bf.newLine();
						
						bf.close();
						
						String d;
						FileReader fr=new FileReader("D:/5_Sem_3/Java_Project/ABDVDDR/"+UserName+".txt");
						BufferedReader bf1 = new BufferedReader(fr);
						while((d=bf1.readLine())!=null)
							{
								System.out.println(d);
							}
						bf1.close();

						
						int p=0;
						while(p==0)
						{
							Scanner SN = new Scanner(System.in);
							System.out.println("Enter the seat number you want to book");
							String Seatnumber = SN.nextLine();
							
							File f3 = new File("D:/5_Sem_3/Java_Project/ABDVDDR/"+Seatnumber+".txt");
							
							if(f3.exists()==true)
							{
								System.out.println("Choose another Seat");
								p=0;							
							}
							else
							{
								p=1;
								f3.createNewFile();
								
								FileWriter SN1 = new FileWriter("D:/5_Sem_3/Java_Project/ABDVDDR/"+Seatnumber+".txt");
								BufferedWriter SN2 = new BufferedWriter(SN1);
								
								SN2.write(Seatnumber);
								SN2.close();	
				
								String e;
								FileReader SN3=new FileReader("D:/5_Sem_3/Java_Project/ABDVDDR/"+Seatnumber+".txt");
								BufferedReader SN4 = new BufferedReader(SN3);	
								System.out.print("Ticket Booked sucessfully and seatnumber is : ");
								while((e=SN4.readLine())!=null)
								{
									System.out.println(e);
								}
								SN4.close();
							}
							
														
						}
						
						
				}
			break;
			}
			
			
			case 2:
			{
				boolean k;
				Scanner s3 = new Scanner(System.in);
		
				
				
				if(f1.exists()==false)
				{
					System.out.println("User doesn't exists");
					break;
				}
				System.out.println("enter the password : ");
				String upass=s3.nextLine();
				
				FileReader op=new FileReader("D:/5_Sem_3/Java_Project/ABDVDDR/"+pass+".txt");
				BufferedReader bf2 = new BufferedReader(op);
				String rf=bf2.readLine();
				if((k=rf.equals(upass))==true)
				{
					System.out.println("Do you Want to cencel the ticket press 1 or,\n If you want to know the your details press 2");
					int choice;
					choice = s3.nextInt();
					
					switch(choice)
					{
						case 1:
						{
							f1.delete();
							System.out.println("Sucessfully cancelled\n");
							break;
						}
						
						case 2:
						{
							String d;
							FileReader fr=new FileReader("D:/5_Sem_3/Java_Project/ABDVDDR/"+UserName+".txt");
							BufferedReader bf1 = new BufferedReader(fr);
							while((d=bf1.readLine())!=null)
							{
								System.out.println(d);
							}
							bf1.close();
							break;
						}
					}
				}
				break;
			}
		}
	}

	public void ABDSRT() throws IOException
	{
		System.out.print("Your route is from Ahmedabad to Surat\nYour Ticket charge is 449\n");
		
		System.out.print("Welcome to OOP Tures&Travels\n");
		System.out.println("Your Fare is From Ahmedabad to Surat");

		Scanner s1 = new Scanner(System.in);
		
		System.out.println("For new Booking press 1, existing booking press 2");
		int LogSign;
		LogSign = s1.nextInt();		

			Scanner s2 = new Scanner(System.in);
			System.out.println("Enter the UserName");
			String UserName = s2.nextLine();
			File f1 = new File("D:/5_Sem_3/Java_Project/ABDSRT/"+UserName+".txt");	
						
			String pass=UserName+"_pwd";
			File f2 = new File("D:/5_Sem_3/Java_Project/ABDSRT/"+pass+".txt");
			
		
		switch(LogSign)
		{
			case 1:
			{
				Scanner ss = new Scanner(System.in);
				System.out.println("How many seat you want to book, maximum limit is 3\n");
				int tk;
				tk = ss.nextInt();
				if(tk==0&&tk>=4)
				{
					break;
				}
				for(int i=0;i<tk;i++)
				{	
					if(f1.exists()==false)
					{
						f1.createNewFile();
						System.out.println("set password : ");
						String Password=s2.nextLine();
						
						FileWriter fp = new FileWriter("D:/5_Sem_3/Java_Project/ABDSRT/"+pass+".txt");
						BufferedWriter fpass = new BufferedWriter(fp);
						
						fpass.write(Password);
						fpass.close();
						
					}
						int Gender = 0;
						String Gen;
						while(Gender<1||Gender>3)
						{
							try
							{
								System.out.print("Enter the Gender:\n1) Male\n2) Female\n3) Other  ");
								Gender = s2.nextInt();
							}
							catch(InputMismatchException e)
							{
									s2.nextInt();
							}
						}
								if(Gender == 1)
								{
									Gen="MALE";
								}
								else if(Gender == 2)
								{
									Gen="FEMALE";
								}
								else
								{
									Gen="OTHER";
								}

						System.out.println("ENter the Age: ");
						int Age1 = 0;
						while(Age1<12||Age1>80)
						{
							try
							{
								Age1 = s2.nextInt();
							}
							catch(InputMismatchException e)
							{
									s2.nextInt();
							}
						}
						int Age=Age1;
						
					
						System.out.println("ENter the Phone Number: ");
						int PHNumber = 0;
						
						while(PHNumber<1000000||PHNumber>9999999)
						{
							try
							{
								PHNumber = s2.nextInt();
							}
							catch(InputMismatchException e)
							{
									s2.nextInt();
							}
						}
						
						FileWriter fw = new FileWriter("D:/5_Sem_3/Java_Project/ABDSRT/"+UserName+".txt",true);
						BufferedWriter bf = new BufferedWriter(fw);
						
						bf.write("I'd :         "+UserName);
						bf.newLine();
						bf.write("Gender :      "+Gen);
						bf.newLine();
						bf.write("Age :         "+Age);
						bf.newLine();
						bf.write("PhoneNumber : "+PHNumber);
						bf.newLine();
						
						bf.close();
						
						String d;
						FileReader fr=new FileReader("D:/5_Sem_3/Java_Project/ABDSRT/"+UserName+".txt");
						BufferedReader bf1 = new BufferedReader(fr);
						while((d=bf1.readLine())!=null)
							{
								System.out.println(d);
							}
						bf1.close();
						
						int p=0;
						while(p==0)
						{
							Scanner SN = new Scanner(System.in);
							System.out.println("Enter the seat number you want to book");
							String Seatnumber = SN.nextLine();
							
							File f3 = new File("D:/5_Sem_3/Java_Project/ABDSRT/"+Seatnumber+".txt");
							
							if(f3.exists()==true)
							{
								System.out.println("Choose another Seat");
								p=0;							
							}
							else
							{
								p=1;
								f3.createNewFile();
								
								FileWriter SN1 = new FileWriter("D:/5_Sem_3/Java_Project/ABDSRT/"+Seatnumber+".txt");
								BufferedWriter SN2 = new BufferedWriter(SN1);
								
								SN2.write(Seatnumber);
								SN2.close();	
				
								String e;
								FileReader SN3=new FileReader("D:/5_Sem_3/Java_Project/ABDSRT/"+Seatnumber+".txt");
								BufferedReader SN4 = new BufferedReader(SN3);	
								System.out.print("Ticket Booked sucessfully and seatnumber is : ");
								while((e=SN4.readLine())!=null)
								{
									System.out.println(e);
								}
								SN4.close();
							}
							
														
						}
						
						
				}
			break;
			}
			
			
			case 2:
			{
				boolean k;
				Scanner s3 = new Scanner(System.in);
			
				
				if(f1.exists()==false)
				{
					System.out.println("User doesn't exists");
					break;
				}
				System.out.println("enter the password : ");
				String upass=s3.nextLine();
				
				FileReader op=new FileReader("D:/5_Sem_3/Java_Project/ABDSRT/"+pass+".txt");
				BufferedReader bf2 = new BufferedReader(op);
				String rf=bf2.readLine();
				if((k=rf.equals(upass))==true)
				{
					System.out.println("Do you Want to cencel the ticket press 1 or,\n If you want to know the your details press 2");
					int choice;
					choice = s3.nextInt();
					
					switch(choice)
					{
						case 1:
						{
							f1.delete();
							System.out.println("Sucessfully cancelled\n");
							break;
						}
						
						case 2:
						{
							String d;
							FileReader fr=new FileReader("D:/5_Sem_3/Java_Project/ABDSRT/"+UserName+".txt");
							BufferedReader bf1 = new BufferedReader(fr);
							while((d=bf1.readLine())!=null)
							{
								System.out.println(d);
							}
							bf1.close();
							break;
						}
					}
				}
				break;
			}
		}
	}
}


public class editing
{
	public static void main(String args[]) throws IOException
	{
		Scanner ss = new Scanner(System.in);
		choose obj = new choose();
		System.out.println("choose Destination\n1.Rajkot\n2.Vadodara\n3.Surat");
		
		int ch=0; 
		while(ch<1||ch>3)
		{
			try
			{
				ch = ss.nextInt();
			}
			catch(InputMismatchException e)
			{
				ss.nextInt();
			}
		}
		
		switch(ch)
		{
			case 1:
			{
				obj.ABDRJT();
				break;
			}
			
			case 2:
			{
				obj.ABDVDDR();
				break;
			}
			
			case 3:
			{
				obj.ABDSRT();
				break;
			}
		}
	}
}
