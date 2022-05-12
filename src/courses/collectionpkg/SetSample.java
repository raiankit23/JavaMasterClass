package courses.collectionpkg;

import java.util.TreeSet;

public class SetSample {
    public static void main(String[] args) {
        TreeSet<String> mySet = new TreeSet<>();
        mySet.add("Apple");
        mySet.add("Orange");
        mySet.add("Grape");
        mySet.add("Orange");
        mySet.add("Grape");
        for(String fruit: mySet){
            System.out.println(fruit);
    }
    }
}
