import java.io.File;
import java.util.ArrayList;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class StockReport {

	public static void main(String[] args) {
		
		File f1=new File("/home/user/Nitish/OopsPrograms/stockfile1.json");
		File f2=new File("/home/user/Nitish/OopsPrograms/stockfile2.json");
		
		ArrayList stock=new ArrayList();
		
		ObjectMapper mapper=new ObjectMapper();
		
		try {
		JsonNode node=mapper.readTree(f1);
		JsonNode n=node.findPath("stock");
		
		for(JsonNode k:node)
		{
			String stock_name=n.findPath("stock_name").asText();
			stock.add(stock_name);
			System.out.println(stock_name);
			int no_of_share=n.findPath("no_of_stock").asInt();
			stock.add(no_of_share);
			System.out.println(no_of_share);		
			int share_price=n.findPath("share_price").asInt();
			stock.add(share_price);
			System.out.println(share_price);
			
			System.out.println("Stock Name:"+stock_name);
			System.out.println("Stock Name:"+no_of_share);
			System.out.println("Stock Name:"+share_price);
			
			double total_value=no_of_share*share_price;
			System.out.println("total Value"+total_value);
			
			mapper.writeValue(f2,stock);
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(stock);
	}

}
