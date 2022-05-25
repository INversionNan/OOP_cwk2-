package comp1721.cwk2;

import java.util.Collections;

public class Deck extends CardCollection{

    public Deck(){
        for (Card.Rank rank: Card.Rank.values()){
            for(Card.Suit suit: Card.Suit.values()){
                Card card = new Card(rank, suit);
                super.add(card);
            }
        }
    }

    @Override
    public int size(){
        return super.size();
    }

    @Override
    public boolean isEmpty(){
        return super.isEmpty();
    }

    @Override
    public boolean contains(Card card){
        return super.contains(card);
    }

    @Override
    public void discard() {
        super.discard();
    }

    public void shuffle(){
        Collections.shuffle(super.cards);
    }
}
// Implement Deck class here
