package IntermediateJAVA.Arrays;

import java.util.ArrayList;

public class ArrayListImplementation {
    public static void main(String[] args) {
        
        //Creating an ArrayList
        ArrayList<Integer> marks = new ArrayList<>();

        //Appending elements to ArrayList
        marks.add(99);
        marks.add(98);
        marks.add(99);
        marks.add(97);
        marks.add(100);

        //Printing ArrayList
        System.out.println("Printing ArrayList");
        System.out.println(marks);
        
        //Accessing element of ArrayList
        System.out.println("\nAccessing Element at Index 4");
        int marks1 = marks.get(4);
        System.out.println(marks1);

        //Replacing elements of ArrayList
        System.out.println("\nReplacing Element at Index 3");
        marks.set(3, 80);
        System.out.println("ArrayList after replacing 97 with 80");
        System.out.println(marks);
        
        System.out.println("Size of ArrayList before removing an element is : " + marks.size());

        //Removing element from ArrayList
        System.out.println("\nRemoving Element at Index 2");
        marks.remove(2);
        System.out.println("ArrayList after removing 99 at Index 2");
        System.out.println(marks);

        //Calculating size of ArrayList
        System.out.println("Size of ArrayList after removing an element is : " + marks.size());

    }
}
