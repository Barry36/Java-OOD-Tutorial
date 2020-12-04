package FunctionPass;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        MyObj myObj = new MyObj();
        myObj.counter = 1;
        myMethod(myObj);
        System.out.println(myObj.counter);

        System.out.println("bruh");
        char[] charArray = new char[] { 'A', 'Q', 'S', 'Z', 'P' };
        Arrays.sort(charArray);
        System.out.println("**Char Array After Sorting**");
        for (char ch: charArray){
            System.out.println(ch - '1');
        }

    }

    public static void myMethod(MyObj myObj){
        myObj.counter = 2;
        MyObj myobj = new MyObj();
        myobj.counter = 3;
    }
}
