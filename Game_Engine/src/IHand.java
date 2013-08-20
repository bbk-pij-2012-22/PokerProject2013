import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: marshall_gj
 * Date: 20/08/2013
 * Time: 21:00
 */


public interface IHand {
    //returns a list containing the hand's cards.
    List<CardImpl> getContents();

    //Empty's the hand of cards.
    void emptyHand();

    //Adds a card to the hand
    void addCard(CardImpl card);

    //Removes a card from the hand - e.g. 0,1,2,3 etc.
    void removeCard(int location);
}
