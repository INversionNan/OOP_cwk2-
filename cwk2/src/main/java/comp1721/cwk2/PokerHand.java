package comp1721.cwk2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;

public class PokerHand extends CardCollection{
    List<Character> cardList = new ArrayList<>();
    HashSet<Character> hashSet = new HashSet<>(cardList);
    List<Character> list = new ArrayList<>(hashSet);

    public PokerHand(){

    }
    public PokerHand(String name){
        if (name.length() <= 0 || name.length() > 5){
            throw new CardException("These card numbers are wrong.");
        }
        for (String RankSuit: name.split(" ")){
            Card card = new Card(RankSuit);
            super.add(card);
        }
    }
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public void discard() {
        super.discard();
    }

    public void discardTo(Deck deck){
        for (Card card: super.cards){
            deck.add(card);
        }
        super.discard();
    }
    @Override
    public String toString() {
        String name = "";
        for(Card card :super.cards){
            name.concat(card.toString());
        }
        return name;
//        return super.cards.removeAll("(.{2})"," ").substring(1);
    }
//
//    Predicate predicate = new Predicate() {
//        @Override
//        public boolean test(Object o) {
//            return false;
//        }
//    }

    public boolean isPair(){
        cardList.removeAll(cardList);
        hashSet.removeAll(hashSet);
        list.removeAll(list);
        for(Card card:super.cards){
            cardList.add(card.getRank().getSymbol());
        }
        return list.size() == 4;
    }

    public boolean isTwoPairs(){
        cardList.removeAll(cardList);
        hashSet.removeAll(hashSet);
        list.removeAll(list);
        for(Card card:super.cards){
            cardList.add(card.getRank().getSymbol());
        }
        if(list.size() == 3){

        }
    }
    public boolean isThreeOfAKind(){

    }
    public boolean isFourOfAKind(){

    }
    public boolean isFullHouse(){

    }
    public boolean isFlush(){

    }
    public boolean isStraight(){

    }
}
// Implement PokerHand class here
