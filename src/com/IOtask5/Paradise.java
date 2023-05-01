package com.IOtask5;

import java.io.Serializable;
import java.util.Scanner;

public class Paradise implements Resturent, Serializable
{
	public void rest()
	{
		Integer a;
		do
		{
		Integer res, qty;
		Scanner sc=new Scanner(System.in);
		System.out.println("****WELCOME TO PARADISE****");
		System.out.println("1.Non-Veg Items");
		System.out.println("2.Veg Items");
		res=sc.nextInt();

			switch (res) 
			{
				case 1: 
					{
						Integer nonv;
						System.out.println("Welcome to Paradise");
						System.out.println("Non-Veg Items Menu");
						System.out.println("1.Chicken Biryani");
						System.out.println("2.Mutton Biryani");
						System.out.println("3.Prawns Biryani");
						System.out.println("4.Fish Biryani");
						nonv=sc.nextInt();
						switch (nonv) 
							{
							case 1: 
								{
								System.out.println("Chicken Biryani");
								Float rate=180.0f ;
								System.out.println("Enter Quantity Required");
								qty=sc.nextInt();
								Float subt=rate*qty;
								Float GST5=rate*0.05f;
								Float amo=subt + GST5;
								System.out.println("Chicken Biryani"+"\n"+"Quantity:	"+qty+"\n"+"Sub Total:	"+subt+"\n"+"GST 5%:	"+GST5+"\n"+"Total Amount:	"+amo);
								break;
								}
							case 2: 
								{
								System.out.println("Mutton Biryani");
								Float rate=220.0f ;
								System.out.println("Enter Quantity Required");
								qty=sc.nextInt();
								Float subt=rate*qty;
								Float GST5=rate*0.05f;
								Float amo=subt + GST5;
								System.out.println("Mutton Biryani"+"\n"+"Quantity:	"+qty+"\n"+"Sub Total:	"+subt+"\n"+"GST 5%:	"+GST5+"\n"+"Total Amount:	"+amo);
								break;
								}				
							case 3: 
								{
								System.out.println("Prawns Biryani");
								Float rate=200.0f ;
								System.out.println("Enter Quantity Required");
								qty=sc.nextInt();
								Float subt=rate*qty;
								Float GST5=rate*0.05f;
								Float amo=subt + GST5;
								System.out.println("Prawns Biryani"+"\n"+"Quantity:	"+qty+"\n"+"Sub Total:	"+subt+"\n"+"GST 5%:	"+GST5+"\n"+"Total Amount:	"+amo);
								break;
								}
							case 4: 
								{
								System.out.println("Fish Biryani");
								Float rate=190.0f ;
								System.out.println("Enter Quantity Required");
								qty=sc.nextInt();
								Float subt=rate*qty;
								Float GST5=rate*0.05f;
								Float amo=subt + GST5;
								System.out.println("Fish Biryani"+"\n"+"Quantity:	"+qty+"\n"+"Sub Total:	"+subt+"\n"+"GST 5%:	"+GST5+"\n"+"Total Amount:	"+amo);
								break;
								}
							default:
								{
								System.out.println("Selected Item is Not Availabel Please Check and Enter Available Item");
								break;
								}
							}
						break;
					}
				case 2: 
					{
						Integer veg;
						System.out.println("Welcome to Bawarchi");
						System.out.println("Veg Items Menu");
						System.out.println("1.Paneer Fried Biryani");
						System.out.println("2.Veg Poulav");
						System.out.println("3.Veg Biryani");
						System.out.println("4.Thali");
						veg=sc.nextInt();
						switch (veg) 
							{
							case 1: 
								{	
								System.out.println("Paneer Fried Biryani");
								Float rate=180.0f ;
								System.out.println("Enter Quantity Required");
								qty=sc.nextInt();
								Float subt=rate*qty;
								Float GST5=rate*0.05f;
								Float amo=subt + GST5;
								System.out.println("Paneer Fried Biryani"+"\n"+"Quantity:	"+qty+"\n"+"Sub Total:	"+subt+"\n"+"GST 5%:	"+GST5+"\n"+"Total Amount:	"+amo);
								break;
								}
							case 2: 
								{
								System.out.println("Veg Poulav");
								Float rate=150.0f ;
								System.out.println("Enter Quantity Required");
								qty=sc.nextInt();
								Float subt=rate*qty;
								Float GST5=rate*0.05f;
								Float amo=subt + GST5;
								System.out.println("Veg Poulav"+"\n"+"Quantity:	"+qty+"\n"+"Sub Total:	"+subt+"\n"+"GST 5%:	"+GST5+"\n"+"Total Amount:	"+amo);
								break;
								}				
							case 3: 
								{
								System.out.println("Veg Biryani");
								Float rate=140.0f ;
								System.out.println("Enter Quantity Required");
								qty=sc.nextInt();
								Float subt=rate*qty;
								Float GST5=rate*0.05f;
								Float amo=subt + GST5;
								System.out.println("Veg Biryani"+"\n"+"Quantity:	"+qty+"\n"+"Sub Total:	"+subt+"\n"+"GST 5%:	"+GST5+"\n"+"Total Amount:	"+amo);
								break;
								}
							case 4: 
								{
								System.out.println("Thali");
								Float rate=160.0f ;
								System.out.println("Enter Quantity Required");
								qty=sc.nextInt();
								Float subt=rate*qty;
								Float GST5=rate*0.05f;
								Float amo=subt + GST5;
								System.out.println("Thali"+"\n"+"Quantity:	"+qty+"\n"+"Sub Total:	"+subt+"\n"+"GST 5%:		"+GST5+"\n"+"Total Amount:	"+amo);
								break;
								}	
							default:
								{
								System.out.println("Selected Item is Not Availabel Please Check and Enter Available Item");	
								break;
								}	
							}
						break;
					}
				default:
					{	
					System.out.println("Please check and Enter Veg or Non-Veg Item");
					break;
					}	
			}
		System.out.println("Enter 1 to go Menu");
		a=sc.nextInt();
		}while(a==1);
	}

}
