import java.util.ArrayList;
import java.util.Arrays;

public class java11_String_function {
    public static void main(String[] args) {
        var list =  new ArrayList<>(); // ArrayList<String>
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        // To create a srting array using  dynamic list 
            //Returns an array containing all of the elements in this collection, using the provided generator function to allocate the returned array.
            // If this collection makes any guarantees as to what order its elements are returned by its iterator, this method must return the elements in the same order.
            // Type Parameters:
            // the component type of the array to contain the collection
            // Parameters:
            // generator a function which produces a new array of the desired type and the provided length
            // Returns:
            // an array containing all of the elements in this collection
            
        var arr  =  list.toArray(size -> new String[size]); // String[]
        System.out.println(Arrays.toString(arr));

        // To   create an array using method references
        var arrRef  =  list.toArray(String[]::new); // String[]
        System.out.println(Arrays.toString(arrRef));
    }


}
