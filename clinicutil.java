package Clinique;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class clinicutil {
	
	
	static ArrayList<patient> patient_list=new ArrayList<>();
	static ArrayList<Doctor> doctor_list=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	public static void addDoctors()
	{
		Doctor doctor=new Doctor();
		
		
		System.out.println("Enter name :");
		String name=sc.nextLine();
		System.out.println("Enter id:");
		int id=sc.nextInt();
		System.out.println("Enter specilization :");
		String specialization=sc.nextLine();
		System.out.println("Enter availability:");
		String availability=sc.nextLine();
		
		doctor.setName(name);
		doctor.setId(id);;
		doctor.setSpecialization(specialization);
		doctor.setAvailability(availability);
		
				doctor_list.add(doctor);
				System.out.println("Displaying Doctor");
				showDoctor();
		
	}
	
	public static void addpatient()
	{
		patient p=new patient();
		
		
		System.out.println("Enter Patient name");
		String name=sc.nextLine();
		System.out.println("Enter patient id");
		int p_id=sc.nextInt();
		System.out.println("Enter Mobile No");
		long mob_no=sc.nextInt();
		System.out.println("Enter Age: ");
		int age=sc.nextInt();
		p.setAge(age);
		p.setMob_no(mob_no);
		p.setName(name);
		p.setP_id(p_id);
		patient_list.add(p);
		System.out.println("Displaying Patient");
		showPatient();
	}
	
	public static void showDoctor()
	{
		Iterator itr=doctor_list.iterator();
		while(itr.hasNext())
		{
			Doctor d=(Doctor)itr.next();
			System.out.println(" "+d.getName()+" "+d.getId()+" "+d.getAvailability()+" "+d.getSpecialization());
		}
	}

	
	public static void showPatient()
	{

		Iterator itr=patient_list.iterator();
		while(itr.hasNext())
		{
			patient p=(patient)itr.next();
			System.out.println(p.getP_id()+" "+p.getName()+"  "+p.getMob_no()+" "+p.getAge());
		}
		
	}
}
