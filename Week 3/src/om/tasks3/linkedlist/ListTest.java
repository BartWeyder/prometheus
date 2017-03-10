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
        test_list.add(10);
        test_list.add(12);
        test_list.add(4);
        test_list.add(3);

        //System.out.println(test_list.get(1));
        test_list.delete(1);
        test_list.delete(1);
        test_list.delete(1);
        test_list.delete(1);
        test_list.delete(1);
        test_list.delete(0);

        System.out.println(test_list.size());

        for (int i = 0; i<test_list.size(); i++) {
            System.out.println(test_list.get(i));
        }
    }
}
