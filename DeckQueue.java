import java.util.Arrays;

public class DeckQueue {

	public static void main(String[] args) {
		int no_of_player=4;
		int no_of_cards=9;
		
		String type[]= {"Clubs","Diamonds","Hearts","Spades"};
		String[] deck= {"2","3","4","5","6","7","8","9","10","jack","queen","King","Ace"};
		String[] cards=new String[52];
		String[][] players_cards=new String[4][9];
		
		String Rank1[]=new String[9];
		String Rank2[]=new String[9];
		String Rank3[]=new String[9];
		String Rank4[]=new String[9];
		
		for(int i=0;i<cards.length;i++)
		{
			cards[i]=type[i/13]+" "+deck[i%13];
			
		}
		
		cards=DeckUtil.shuffleCards(cards);
		players_cards=DeckUtil.Input2d(cards);
			DeckUtil.print2d(players_cards);
			
		Rank1=DeckUtil.RankArrayInsert(players_cards,0);
		
		
		System.out.println("Rank1: "+Arrays.toString(Rank1));
		
		Rank2=DeckUtil.RankArrayInsert(players_cards, 1);
		System.out.println("Rank2 :"+Arrays.toString(Rank2));
		
		Rank3=DeckUtil.RankArrayInsert(players_cards, 2);
		System.out.println("Rank3 :"+Arrays.toString(Rank3));
		
		Rank4=DeckUtil.RankArrayInsert(players_cards, 3);
		System.out.println("Rank4 :"+Arrays.toString(Rank4));
			
		
		//Inserting Rank1 in Queue And Display
		System.out.println("\n Displaying Rank1 Queue:");
		 DeckUtil.InsertQueue(Rank1);
		 System.out.println("\n Displaying Rank2  After Adding to Queue");
		 DeckUtil.InsertQueue(Rank2);
		 System.out.println("\n Displaying Rank3  After Adding to Queue");
		 DeckUtil.InsertQueue(Rank3);
		 System.out.println("\n Displaying Rank4  After Adding to Queue");
		 DeckUtil.InsertQueue(Rank4);
		
	}

}
