import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class RegexUtil {
	
	public static void  replace()
	{
		
	}
	
	public static boolean validation(String str)
	{
		boolean isValid =false;
		if(str.matches("[a-zA-Z]"))
		{
			isValid=true;
			return isValid;
		}
		return isValid;
	}
	
	
	public static boolean validate(String phone) {
		 
		
		Pattern p=Pattern.compile("[5-9][0-9]{9}");
		Matcher m=p.matcher(phone);
		
		return(m.find()&&m.group().equals(phone));
	
}
	

}
