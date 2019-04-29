
public class DeckUtil {
	
	
	static Node front=null,rear=null;
	//Shuffling cards
	public static String[] shuffleCards(String[] cards)
	{
		for(int i=0;i<cards.length;i++)
		{
			int index=(int)Math.random()*(cards.length);
			for(int j=0;j<cards.length;j++)
			{
				cards[i]=cards[j];
				cards[j]=cards[index];
				cards[index]=cards[i];
			}
		}
		return cards;
	}
	
	//Inserting in 2D Array
	public static String[][] Input2d(String[] cards)
	{
		
		int no_of_player=4;
		int no_of_cards=9;
		String players_cards[][]=new String[no_of_player][no_of_cards];
		int count=0;
		
		
		for(int i=0;i<no_of_player;i++)
		{
			for(int j=0;j<no_of_cards;j++)
			{
				players_cards[i][j]=cards[count];
				count++;
			}
		}
		return players_cards;
		
	}
	
	
	//Printing 2d Array
	public static void print2d(String[][] players_cards)
	{	
		int no_of_player=4;
		int no_of_cards=9;
		int player=1;
		for(int i=0;i<no_of_player;i++)
		{
			System.out.print("Player:  "+player+" ");
			for(int j=0;j<no_of_cards;j++)
			{
				System.out.print("  "+players_cards[i][j]);
			}
			System.out.println();
			player++;
		}
	}
	
	
	//Storing in Array
	public static String[] RankArrayInsert(String[][] player_cards,int row)
	{
		int no_of_cards=9;
		String Array[]=new String[no_of_cards];
		
			int count=0;
			for(int j=0;j<no_of_cards;j++)
			{
				Array[count]=player_cards[row][j];
				count++;
				
			}
		
	return Array;
	}
	
	
	//Inserting in Queue Using Linked List
	
	public static void InsertQueue(String arr[])
	{
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			Node newNode=new Node();
			if(front==null&&rear==null)
			{
				newNode.data=arr[i];
				newNode.next=null;
				front=rear=newNode;
			}
			else {
			
				
				newNode.data=arr[i];
				newNode.next=null;
				rear.next=newNode;
				rear=newNode;
			}
		}
		
		showQueue();
	}
	
	
	//Show Method
	public static void showQueue()
	{
		if(front==null&&rear==null)
		{
			System.out.println("Is Empty");
		}
		else {
			Node current=front;
			while(current!=rear)
			{
				System.out.print(current.data);
				current=current.next;
			}
			System.out.print(current.data);
		}
	}

}
