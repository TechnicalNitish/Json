import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class inventoryManagement {

	public static void main(String[] args) {
		
		
		
		
		String path="/home/user/Nitish/OopsPrograms/inventryinput.json";
		File f=new File(path);
		ObjectMapper mapper=new ObjectMapper();
//			try {
//				iv=mapper.readValue(f, inventory.class);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
		try {
			JsonNode node=mapper.readTree(f);
			System.out.println("*******Displaying Rice Details*********");
			JsonNode inventry=node.findPath("Rice");
			
			for (JsonNode node1 : inventry) {
				String name=node1.findPath("name").asText();				// accessing name value 
				int weight=node1.findPath("weight").asInt();				// accessing weight value
				int price=node1.findPath("price").asInt(); 
				System.out.println(" "+name+"  "+weight+"  "+price);
			}
			
			
			System.out.println("**********DIsplaying Pulses Details*******");
			JsonNode iv=node.findPath("Pulses");
			for(JsonNode node2:iv)
			{
				String name=node2.findPath("name").asText();				// accessing name value 
				int weight=node2.findPath("weight").asInt();				// accessing weight value
				int price=node2.findPath("price").asInt(); 
				System.out.println(name+" "+weight+"  "+price);
				
			}
			System.out.println("******Displaying Wheat Details***");
			JsonNode iv2=node.findPath("Wheat");
			
				for(JsonNode node3:iv2)
				{
					String name=node3.findPath("name").asText();
					int weight=node3.findPath("weight").asInt();
					int price=node3.findPath("price").asInt();
					
					System.out.println(name+" "+weight+" "+price);
				}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
