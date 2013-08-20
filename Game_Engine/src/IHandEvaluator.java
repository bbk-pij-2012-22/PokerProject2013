
/**
 * Created with IntelliJ IDEA.
 * User: marshall_gj
 * Date: 20/08/2013
 * Time: 20:56
 */


public interface IHandEvaluator {

    // Takes a hand and returns a hand with the hand strength assigned.
    HandImpl getHandStrength(HandImpl hand);
}
