package blackjack_github;

import java.util.ArrayList;
import java.util.Random;

/*
 * Class deck. Creates a deck of cards for the blackjack game
 */
public class Deck {
	private ArrayList<Card> deck;
	
	public Deck() {
		this.deck = new ArrayList<Card>();
	}
	
	public void createDeck(){
        for(Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                this.deck.add(new Card(suit, rank));
            }
        }
    }
	
	public void shuffle() {
		ArrayList<Card> tmpDeck = new ArrayList<Card>();
		Random rand = new Random();
		int randCard = 0;
		int originalSize = this.deck.size();
		for(int i = 0; i < originalSize; i++) {
			randCard = rand.nextInt((this.deck.size()-1 -0) + 1);
			tmpDeck.add(this.deck.get(randCard));
			this.deck.remove(randCard);
		}
		this.deck = tmpDeck;
	}
	
	public void removeCard(int i) {
		this.deck.remove(i);
	}
	
	public Card getCard(int i) {
		return this.deck.get(i);
	}
	
	public void addCard(Card addCard) {
		this.deck.add(addCard);
	}
	
	public void drawCard(Deck deckDraw) {
		this.deck.add(deckDraw.getCard(0));
		deckDraw.removeCard(0);
	}
	
	public String toString() {
		String cardList = "";
		int i = 0;
		for(Card aCard : this.deck) {
			cardList += "\n " + aCard.toString();
		}
		return cardList;
	}
}











