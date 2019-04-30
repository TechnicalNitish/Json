package Clinique;

import java.util.Scanner;

public class clinicmain {

	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("0.Exit\n1.Add Doctors\n2.Add Patient\n3.Search By Id\n4.Search By name");
		System.out.println("5.Search by Specialization\n6.Search aValability");
		
		do {
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: clinicutil.addDoctors();
						break;
			case 2:clinicutil.addpatient();
						break;
						
			
			default:System.out.println("Kripya Sahi ");
			}
		}while(choice!=0);
	}

}
