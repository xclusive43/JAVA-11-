public class localVariableSyntax { // implements demoInterface{ //traditional approach to implement
    // @Override
    // public int add(int a, int b) {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'add'");
    // }

    public static void main(String[] args) {
        // Local Variable Syntax for Lambda Parameters
        var id = 0123; // local variable [int id = 0123] = instead for using data type of local
                       // variable we can use var for local variable

        /*** Lambda syntax to implement the interface class demoInterface */
        demoInterface object1 = (int a, int b) -> a+b; //traditional data type declaration for local variable

        demoInterface object2 = (var a, var b) -> a+b; // Local Variable Syntax for Lambda Parameters

        // demoInterface object2 = (var a, int b) -> a+b; // invalid expression

       System.out.println("from Object 1 "+ object1.add(12, 31));
       System.out.println("from Object 2 "+ object2.add(10, 31));
    }

}

interface demoInterface {
    int add(int a, int b);
}
