package om.tasks3.linkedlist;

/**
 * Created by Женя Кізім on 07.03.2017.
 */
public class ListTest {
    public static void main (String args[]) {
        //some text to test this shit
        LinkedList test_list = new LinkedList();
        test_list.add(2);
        test_list.add(5);
        //System.out.println(test_list.get(2));
        test_list.delete(2);

        for (int i = 0; i<test_list.size(); i++) {
            System.out.println(test_list.get(i));
        }
    }
}
