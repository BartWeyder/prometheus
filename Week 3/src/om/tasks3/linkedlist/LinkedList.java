package om.tasks3.linkedlist;

/**
 * Created by Женя Кізім on 07.03.2017.
 */
public class LinkedList {
    //our fields:
    private Integer element_value;
    private LinkedList element_next;

    public LinkedList() {
        //PUT YOUR CODE HERE
        this.element_value = null;
        this.element_next = null;
        //PUT YOUR CODE HERE
    }

    public void add(Integer data) {
        //PUT YOUR CODE HERE
        LinkedList current_element;
        current_element = this.getLastElement();
        if (current_element.element_value == null)
            current_element.element_value = data;
        else {
            current_element.element_next = new LinkedList();
            current_element = current_element.element_next;
            current_element.element_value = data;
        }
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
        if (index<0)
            return false;

        LinkedList current_element = this;
        LinkedList next_element;

        if (index == 0) {
            if (current_element.element_next == null) {
                current_element.element_value = null;
            }
            else {
                next_element = current_element.element_next;
                current_element.element_value = next_element.element_value;
                current_element.element_next = next_element.element_next;
            }
            return true;
        }

        for (int i=0; i<index-1; i++) {
            if (current_element.element_next == null)
                return false;
            current_element = current_element.element_next;
        }
        next_element = current_element.element_next;
        if (next_element.element_next == null) {
            next_element = null;
            current_element.element_next = null;
        }
        else {
            //next_element = next_element.element_next;
            current_element.element_next = next_element.element_next;
        }
        return true;
        //PUT YOUR CODE HERE
    }

    public int size() {
        //PUT YOUR CODE HERE
        LinkedList current_element = this;
        int size_counter = 0;
        while (current_element != null) {
            if (current_element.element_value == null)
                return size_counter;
            else {
                current_element = current_element.element_next;
                size_counter++;
            }
        }
        return size_counter;
        //PUT YOUR CODE HERE
    }
    private LinkedList getLastElement() {
        LinkedList current_element = this;
        //while ((current_element.element_value != null)&&(current_element.element_next != null)) {
        while (current_element.element_next != null)
            current_element = current_element.element_next;
        return current_element;
    }
}
