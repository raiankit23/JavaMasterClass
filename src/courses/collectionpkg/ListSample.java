package courses.collectionpkg;

import java.util.LinkedList;

public class ListSample {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("c");
        myList.add("z");
        myList.addFirst("i");
        myList.add("a");
        for (String s : myList){
            System.out.println(s);
        }
        System.out.println(myList.getFirst());
    }
}
