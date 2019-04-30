
public class companyshareutil {
	static NodeLL head=null;
	
		public static void Add(String symbol)
		{
			
			NodeLL newNode=new NodeLL();
			newNode.data=symbol;
			if(head==null)
			{
				
				newNode.next=null;
				head=newNode;
			}
			else {
				NodeLL current=head;
				while(current.next!=null)
				{
					current=current.next;
				}
			
				current.next=newNode;
				newNode.next=null;
			}
		}
		
		
		public static void show()
		{
			NodeLL current=head;
			if(head==null)
			{
				System.out.println("Linked List Is Empty:");
			}
			else {
					while(current!=null)
					{
						System.out.println(current.data);
						current=current.next;
					}
				
			}
		}
		
		
		public static void remove()
		
		{
			NodeLL current=head;
			NodeLL temp=new NodeLL();
			if(head==null)
			{
				System.out.println("Is Empty conot remove:");
			}
			else {
					while(current.next!=null)
					{
						temp=current;
						current=current.next;
						
					}
						
						temp.next=null;
					
			}
		}

}
