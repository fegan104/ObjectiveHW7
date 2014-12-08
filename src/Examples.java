import tester.Tester;

/**
 * @author frankegan on 12/3/14.
 */

public class Examples {

    void testLCS(Tester t){
        t.checkExpect(new LCS("donkey", "over").findLCS(), "oe");
        t.checkExpect(new LCS("frank", "egan").findLCS(), "an");
        t.checkExpect(new LCS("dan", "perrault").findLCS(), "a");
        t.checkExpect(new LCS("cat", "dog").findLCS(), "");
        t.checkExpect(new LCS("foo", "goo").findLCS(), "oo");
    }
}
