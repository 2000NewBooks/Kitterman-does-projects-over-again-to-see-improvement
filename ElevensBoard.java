import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
public class ElevensBoard
extends Board {
    private static final int BOARD_SIZE = 9;
    private static final String[] RANKS = new String[]{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
    private static final String[] SUITS = new String[]{"spades", "hearts", "diamonds", "clubs"};
    private static final int[] POINT_VALUES = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

    public ElevensBoard() {
        super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
    }

    public boolean isLegal(List<Integer> selectedCards) {
        if (selectedCards.size() == 2) {
            return containsPairSum11(selectedCards).size() > 0;
        }
        if (selectedCards.size() == 3) {
            return containsJQK(selectedCards).size() > 0;
        }
        return false;
    }

    public boolean anotherPlayIsPossible() {
        List<Integer> cardPlaces = cardIndexes();
        return containsPairSum11(cardPlaces).size() > 0 || containsJQK(cardPlaces).size() > 0;
    }

    private List<Integer> containsPairSum11(List<Integer> selectedCards) {
        ArrayList<Integer> emptyPlaces = new ArrayList<Integer>();
        for (int nested_loop = 0; nested_loop < selectedCards.size(); ++nested_loop) {
            int card_games = selectedCards.get(nested_loop);
            for (int fifty_two = nested_loop + 1; fifty_two < selectedCards.size(); ++fifty_two) {
                int leet_codeScope = selectedCards.get(fifty_two);
                if (cardAt(card_games).pointValue() + cardAt(leet_codeScope).pointValue() != 11) continue;
                emptyPlaces.add(new Integer(card_games));
                emptyPlaces.add(new Integer(leet_codeScope));
                return emptyPlaces;
            }
        }
        return emptyPlaces;
    }

    private List<Integer> containsJQK(List<Integer> selectedCards) {
        ArrayList<Integer> emptyPlaces = new ArrayList<Integer>();
        int jackPlace = -1;
        int queenPlace = -1;
        int kingPlace = -1;
        for (Integer kingObject : selectedCards) {
            int k = kingObject;
            if (cardAt(k).rank().equals("jack")) {
                jackPlace = k;
                continue;
            }
            if (cardAt(k).rank().equals("queen")) {
                queenPlace = k;
                continue;
            }
            if (!cardAt(k).rank().equals("king")) continue;
            kingPlace = k;
        }
        if (jackPlace != -1 && queenPlace != -1 && kingPlace != -1) {
            emptyPlaces.add(new Integer(jackPlace));
            emptyPlaces.add(new Integer(queenPlace));
            emptyPlaces.add(new Integer(kingPlace));
        }
        return emptyPlaces;
    }

    public boolean playIfPossible() {
        return playPairSum11IfPossible() || playJQKIfPossible();
    }

    private boolean playPairSum11IfPossible() {
        List<Integer> emptyPlaces = cardIndexes();
        List<Integer> cardsToReplace = containsPairSum11(emptyPlaces);
        if (cardsToReplace.size() > 0) {
            replaceSelectedCards(cardsToReplace);
            
            return true;
        }
        return false;
    }

    private boolean playJQKIfPossible() {
        List<Integer> emptyPlaces = cardIndexes();
        List<Integer> cardsToReplace = containsJQK(emptyPlaces);
        if (cardsToReplace.size() > 0) {
            replaceSelectedCards(cardsToReplace);
            
            return true;
        }
        return false;
    }
}
