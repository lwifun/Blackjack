package blackjack_github;

public class Blackjack {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.createDeck();
		deck.shuffle();
		
		Deck playerDeck = new Deck();
		Deck dealerDeck = new Deck();
		
		double money = 100.00;
		
		System.out.println(deck);
	}
	
}
