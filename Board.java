import java.util.ArrayList;
import java.util.List;

public abstract class Board {
    private Card[] cards;
    private Deck deck;

    public Board(int size, String[] ranks, String[] suits, int[] values) {
        cards = new Card[size];
        deck = new Deck(ranks, suits, values);
        dealMyCards();
    }

    public void newGame() {
        deck.shuffle();
        dealMyCards();
    }

    public int size() {
        return cards.length;
    }

    public boolean isEmpty() {
        for (int i = 0; i < cards.length; ++i) {
            if (cards[i] == null)continue;
            return false;
        }
        return true;
    }

    public void deal(int k) {
        cards[k] = deck.deal();
    }

    public int deckSize() {
        return deck.size();
    }

    public Card cardAt(int k) {
        return cards[k];
    }

    public void replaceSelectedCards(List<Integer> list) {
        for (Integer n : list) {
            deal(n);
        }
    }

    public List<Integer> cardIndexes() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < cards.length; ++i) {
            if (cards[i] == null) continue;
            arrayList.add(new Integer(i));
        }
        return arrayList;
    }

    public String toString() {
        String string = "";
        for (int i = 0; i < cards.length; ++i) {
            string = string + i + ": " + cards[i] + "\n";
        }
        return string;
    }

    public boolean gameIsWon() {
        if (deck.isEmpty()) {
            for (Card card : cards) {
                if (card == null) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public abstract boolean isLegal(List<Integer> selectedCards);

    public abstract boolean anotherPlayIsPossible();

    private void dealMyCards() {
        for (int i = 0; i < cards.length; ++i) {
            cards[i] = deck.deal();
        }
    }
}
