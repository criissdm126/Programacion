package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
    public static void main(String[] args) {
    	
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}

