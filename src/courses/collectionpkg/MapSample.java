package courses.collectionpkg;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("CN", "China");
        myMap.put("IN", "India");
        myMap.put("US", "United States");
        myMap.put(null, "United Kingdom");
        myMap.remove("CN");
        System.out.println(myMap.size());
//        System.out.println(myMap.get("CN"));
        for (Map.Entry<String, String> map : myMap.entrySet()){
            System.out.println(map.getKey()+":"+map.getValue());
        }
    }
}
