import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

public class CompanyShareLL {
	public static void main(String[] args) throws FileNotFoundException {
		
		File f=new File("/home/user/Nitish/OopsPrograms/companyshare.json");
	
		ObjectMapper mapper=new ObjectMapper();
		try {
			JsonNode node =mapper.readTree(f);
			
			JsonNode node1=node.findPath("company");
			
			for(JsonNode n:node1)
			{
					String symbol=n.findPath("symbol").asText();
				
					companyshareutil.Add(symbol);
					
			}
			System.out.println("Displaying after Adding ");
			companyshareutil.show();
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		companyshareutil.remove();
		System.out.println("Displaying after removin ");
			companyshareutil.show();
		
	}

	

}
