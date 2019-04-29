import java.util.Arrays;
import java.util.Random;

public class DeckOfCards {

	public static void main(String[] args) {
		String type[]= {"Clubs","Diamonds","Hearts","Spades"};
		String[] deck= {"2","3","4","5","6","7","8","9","10","jack","queen","King","Ace"};
		String[] cards=new String[52];
		String[][] players_cards=new String[4][9];
		
		
		
		for(int i=0;i<cards.length;i++)
		{
			cards[i]=type[i/13]+" "+deck[i%13];
			
		}
		
		System.out.println("Before Shuffling"+Arrays.toString(cards));
		
	
		cards=DeckUtil.shuffleCards(cards);
		players_cards=DeckUtil.Input2d(cards);
		
		
		System.out.println("\nPlayers Cards");
		DeckUtil.print2d(players_cards);
		
		
		
	
	
	}

}
