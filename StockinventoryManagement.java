import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

public class StockinventoryManagement {

	public static void main(String[] args) {
			
		ObjectMapper mapper=new ObjectMapper();
			File f1=new File("/home/user/Nitish/OopsPrograms/inventryinput.json");
			ArrayList al1=new ArrayList();
			ArrayList al2=new ArrayList();
			ArrayList al3=new ArrayList();
			File f2=new File("/home/user/Nitish/OopsPrograms/inventryoutput.json");
			
			try {
				JsonNode node=mapper.readTree(f1);
				System.out.println("Displaying Rice");
				JsonNode inventory=node.findPath("Rice");
					for(JsonNode n:inventory)
					{
						String name=n.findPath("name").asText();
							al1.add(name);
						int weight=n.findPath("weight").asInt();
							al1.add(weight);
						int price=n.findPath("price").asInt();
						al1.add(price);
			System.out.println(" "+name+" "+weight+" "+price);
					
						
					}
					
					mapper.writeValue(f2,al1);

					JsonNode inventory2=node.findPath("Pulses");
					System.out.println("Displaying Pulses");
						for(JsonNode n:inventory2)
						{
							String name=n.findPath("name").asText();
							al2.add(name);
							int weight=n.findPath("weight").asInt();
							al2.add(weight);
							int price=n.findPath("price").asInt();
							al2.add(price);
							System.out.println("\t"+name+"\t"+weight+"\t"+price);
						
							
						}
						mapper.writeValue(f2,al2);
						System.out.println("Displaying Wheat");
						JsonNode inventory3=node.findPath("Wheat");
							for(JsonNode n:inventory3)
							{
								
								String name=n.findPath("name").asText();
								al3.add(name);
								int weight=n.findPath("weight").asInt();
								al3.add(weight);
								int price=n.findPath("price").asInt();
								al3.add(price);
					System.out.println("\t"+name+"\t"+weight+"\t"+price);
								
								
							}
							
						//	mapper.writeValue(f2,al3);
				
							
				
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		
			
			
	}

}
