import java.util.ArrayList;
import java.util.Arrays;

public class java11_String_function {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        // To create a srting array using  dynamic list 
        String[] arr  =  list.toArray(size -> new String[size]);
        System.out.println(Arrays.toString(arr));

        // To   create an array using method references
        String[] arrRef  =  list.toArray(String[]::new);
        System.out.println(Arrays.toString(arrRef));
    }


}
