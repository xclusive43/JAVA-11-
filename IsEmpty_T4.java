import java.util.Optional;

public class IsEmpty_T4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        var string = " ";
        System.out.println("Length "+ string.length());
        Optional o = Optional.of(string); // A container object which may or may not contain a non-null 
                                          // value. If a value is present, isPresent() returns true. If 
                                          // no value is present, the object is considered empty and 
                                          // isPresent() returns false
        o.ifPresent(s -> System.out.println(s));

        System.out.println(o.isPresent()); // If a value is present, returns true, otherwise false


        Optional newObj = Optional.empty(); // Returns an empty Optional instance. No value is present for this Optional
        System.out.println(newObj.isEmpty()); // If a value is not present, returns true, otherwise false.

        //traditional approach but may cause null pointer exception
        System.out.println(string.isEmpty()); // Returns true if, and only if, length() is 0
      
    }

}
