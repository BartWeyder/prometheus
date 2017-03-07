package om.tasks3.linkedlist;

/**
 * Created by Женя Кізім on 07.03.2017.
 */
public class LinkedList {
    //our fields:
    private Integer element_value;
    private LinkedList element_next = null;

    public LinkedList() {
        //PUT YOUR CODE HERE
        this.element_value = 0;
        //PUT YOUR CODE HERE
    }

    public void add(Integer data) {
        //PUT YOUR CODE HERE
        LinkedList current_element;
        current_element = this.getLastElement();
        current_element.element_next = new LinkedList();
        current_element = current_element.element_next;
        current_element.element_value = data;
        //PUT YOUR CODE HERE
    }

    public Integer get(int index) {
        //PUT YOUR CODE HERE
        LinkedList current_element = this;
        for (int i=0; i<index; i++)
            current_element = current_element.element_next;
        return current_element.element_value;
        //PUT YOUR CODE HERE

    }

    public boolean delete(int index) {
        //PUT YOUR CODE HERE
        LinkedList current_element = this;
        LinkedList next_element;
        for (int i=0; i<index-1; i++) {
            current_element = current_element.element_next;
        }
        next_element = current_element.element_next;
        next_element = next_element.element_next;
        current_element.element_next = next_element;
        return true;
        //PUT YOUR CODE HERE
    }

    public int size() {
        //PUT YOUR CODE HERE
        LinkedList current_element = this;
        int size_counter = 1;
        while (current_element.element_next != null) {
            current_element = current_element.element_next;
            size_counter++;
        }
        return size_counter;
        //PUT YOUR CODE HERE
    }
    private LinkedList getLastElement() {
        LinkedList current_element = this;
        while (current_element.element_next != null) {
            current_element = current_element.element_next;
        }
        return current_element;
    }
}
