import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: marshall_gj
 * Date: 20/08/2013
 * Time: 21:19
 */

public class HandImpl implements IHand {

    List<CardImpl> contents = new ArrayList<CardImpl>();

    @Override
    public List<CardImpl> getContents() {
        return contents;
    }

    @Override
    public void emptyHand() {
            contents.clear();
    }

    @Override
    public void addCard(CardImpl card) {
        contents.add(card);
    }

    @Override
    public void removeCard(int location) {
        contents.remove(location);
    }
}
