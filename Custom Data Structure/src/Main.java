import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        DataStructure list = new DataStructure();
        list.append(10);
        list.append(20);
        list.append(30);
//        list.prepend(5);
//        list.size();
//        list.head();
//        list.tail();
//        list.at(2);
//        list.pop();
//        list.contains(21);
        list.find(20);

        list.printList();
    }



}
