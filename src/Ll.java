import sun.awt.image.ImageWatched;

import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Administrator on 2015/11/3.
 */
public class Ll {
    public static void main(String[] args) {
        CircularLinkedList Llist = new CircularLinkedList<>();
        int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 100, 1010, 2, 3, 4, 18, 5};


        for (int i = 0; i < arrayInt.length; i++) {
            Llist.add(arrayInt[i]);
        }
        Llist.setCircuit(10);
        System.out.println(Llist.checkCircuit());
    }
}


