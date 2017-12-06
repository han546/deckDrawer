import java.util.*;

public class deckOfCards{

	//Card object
	public static class Card{
		String suit;
		String value;

		public Card(String a, String b){
			this.suit = a;
			this.value = b;
		}

		public String getSuit(){
			return this.suit;
		}

		public String getValue(){
			return this.value;
		}
	}

	//Creates a new deck with 52 cards
	public List<Card> createDeck(){
		String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
		String[] value = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		List<Card> deck = new ArrayList<>();
		
		for (int i = 0; i < suits.length; i++){
			for (int j = 0; j < value.length; j++){
				Card temp = new Card(suits[i], value[j]);
				deck.add(temp);
			}
		}
		return deck;
	}

	public void drawCard(List<Card> deck){

		if (deck.size() == 0){
			System.out.println("Deck is Empty!");
			return;
		}
		//select random card based on deck size
		Random rand = new Random();
		int randCard = rand.nextInt(deck.size());
		System.out.println(deck.get(randCard).getValue() + " of " + deck.get(randCard).getSuit());
		deck.remove(randCard); //remove card after drawing
		return;
	}

	public static void main(String[] args){

		deckOfCards deckofcards = new deckOfCards();
		Scanner in = new Scanner(System.in);
		System.out.print("How many cards do you want to draw? ");
		int num = in.nextInt();
		List<Card> deck = new ArrayList<>();
		deck = deckofcards.createDeck();
		for (int i = 0; i < num; i++)
			deckofcards.drawCard(deck);
		return;
	}
}

















