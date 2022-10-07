package p4;

import java.util.Scanner;

public class billProvider {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner (System.in);
   	 System.out.println("============ Welcome to Organic Stores =======");
		System.out.println("------------------------------------------------------");
		System.out.println("Avalible products in the store");
		System.out.println(" 1 Electronics \n 2 Bath \n 3 Kitchen \n 4 Clothes \n 5 Others");
		System.out.println("Please enter the choice?");
		System.out.println("---------------------------------------------------------");
		int choice=sc.nextInt();
		if (choice==1) {
			System.out.println("101------Washing Machine------1 is 20000");
			System.out.println("102------Table fan------1 is 2000");
			System.out.println("103------Laptop-----1 is 50000");
			System.out.println("104------Rice cooker-------1 is 1250");
			System.out.println("105------Water Hieter--------1 is 360");
			System.out.println("Enter your code: ");
			System.out.println("----------------------------------------------------------------");
			System.out.println("==================Welcome to organic store======================");
			int a = sc.nextInt();
		}
	}
			//meth1(a);
			//double amt=0,b=0;
			//Scanner sc=new Scanner (System.in);
			 public void meth1(int a) 
			 {
				 double amt=0,b=0;
				 Scanner sc=new Scanner (System.in);
			 
				 if(a==101) {
					
				 }
				 if(a==102) 
				 {
					 System.out.println("table fan is a good choice...");
						System.out.println("Enter   no of Items's: ");
						 int B = sc.nextInt();
						 System.out.println("-----------------------------");
						 int m=B*2000;
						 amt=amt+m;
						 System.out.println(amt);
				 }
				 if(a==103)
				 {
						 System.out.println("Laptop is a good choice...");
							System.out.println("Enter  no of items's: ");
							 int S = sc.nextInt();
							 System.out.println("-----------------------------");
							 int m=S*50000;
					 		 amt=amt+m;
							 System.out.println(amt);
				 }
				 if(a==104) 
				 {
					 System.out.println("Rice-Cooker is a good choice...");
						System.out.println("Enter   no of items's: ");
						 int R = sc.nextInt();
						 System.out.println("-----------------------------");
						 int m=R*1250;
						 amt=amt+m;
						 System.out.println(amt);
				 }
				 if(a==105) 
				 {
					 System.out.println("Water Hieter is a good choice...");
						System.out.println("Enter  no of Items's: ");
						 int w = sc.nextInt();
						 System.out.println("-----------------------------");
						 int m=w*60;
						 amt=amt+m;
						 System.out.println(amt);
				 }

			 		System.out.println("if you want shopping press 1");
					System.out.println("if you dont  want shopping press 2");
					int b1=sc.nextInt();
					if (b==1)
						//display();
					if (b==2)
					{
						
						System.out.println(" total bill "+amt);
						}
				 

	}

}
