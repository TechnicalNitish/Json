import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegExpression {

	public static void main(String[] args) throws IOException{
	
		String firstname;
		String fullname;
		String mobno;
		File f=new File("/home/user/Nitish/OopsPrograms/file.txt");
      Scanner in=new Scanner(f);
			String str="";
			while(in.hasNext())
				
			{
				str+=in.next();
				
			}
			System.out.println(str);
	Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Name");
			
				firstname=sc.nextLine();
				System.out.println("Enter your Full name");
			fullname=sc.nextLine();
			
			System.out.println("Enter Mobile No:");
			mobno=sc.nextLine();
				
		if(firstname.matches("[a-zA-Z]"))
		{
			Pattern p=Pattern.compile("<<name>>");
			
			Matcher m=p.matcher(str);
			
			str=m.replaceAll(firstname);
		}
		else {
			System.out.println("First name Should be A-Z a-z");
		}
		
		if(fullname.matches("[A-Za-z]"))
		{

			Pattern p1=Pattern.compile("<<fullname>>");
			Matcher m1=p1.matcher(str);
				str=m1.replaceAll(fullname);
			
		}
		else {
			System.out.println("Please Enter Full name Only in Aplhbetical format:");
		}
				
		if(mobno.matches("[5-9][0-9]{9}"))
		{
			Pattern p2=Pattern.compile("xxxxxxxxxx");
			
			Matcher m2=p2.matcher(str);
			str=m2.replaceAll(mobno);
		}else {
			System.out.println("Please Enter valid Mob no:");
		}
			
		
		System.out.println(str);
		
			
	}

}
