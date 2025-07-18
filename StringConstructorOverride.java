
import java.util.*;

class MyStringIndexOutOfBoundException extends RuntimeException {
    MyStringIndexOutOfBoundException(String message) {
        super(message);
    }
}

final class MyString {
    char[] arr;

    // Empty constructor
    MyString() {
        arr = new char[0];
    }

    // From String
    MyString(String str) {
        arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
            arr[i] = str.charAt(i);
    }

    // From StringBuffer
    MyString(StringBuffer sb) {
        this(sb.toString());
    }

    // From StringBuilder
    MyString(StringBuilder sb) {
        this(sb.toString());
    }

    // From char[]
    MyString(char[] arr) {
        this.arr = new char[arr.length];
        for (int i = 0; i < arr.length; i++)
            this.arr[i] = arr[i];
    }

    // From char[] with start and count
    MyString(char[] arr, int start, int count) {
        if ((start + count) > arr.length)
            throw new MyStringIndexOutOfBoundException("INVALID [" + start + "," + (start + count) + "] out of bound for length " + arr.length);
        this.arr = new char[count];
        for (int i = 0; i < count; i++) {
            this.arr[i] = arr[start + i];
        }
    }

    // From byte[]
    MyString(byte[] byteArr) {
        this.arr = new char[byteArr.length];
        for (int i = 0; i < byteArr.length; i++) {
            this.arr[i] = (char) byteArr[i];
        }
    }

    // From byte[] with start and count
    MyString(byte[] byteArr, int start, int count) {
        if ((start + count) > byteArr.length)
            throw new MyStringIndexOutOfBoundException("INVALID [" + start + "," + (start + count) + "] out of bound for length " + byteArr.length);
        this.arr = new char[count];
        for (int i = 0; i < count; i++) {
            this.arr[i] = (char) byteArr[start + i];
        }
    }

    //  From int[]
    MyString(int[] intArr) {
        this.arr = new char[intArr.length];
        for (int i = 0; i < intArr.length; i++) {
            this.arr[i] = (char) intArr[i];
        }
    }

    //  From int[] with start and count
    MyString(int[] intArr, int start, int count) {
        if ((start + count) > intArr.length)
            throw new MyStringIndexOutOfBoundException("INVALID [" + start + "," + (start + count) + "] out of bound for length " + intArr.length);
        this.arr = new char[count];
        for (int i = 0; i < count; i++) {
            this.arr[i] = (char) intArr[start + i];
        }
    }

    // toString method
    @Override
    public String toString() {
        return new String(arr);
    }
}

public class StringConstructorOverride {
    public static void main(String[] args) {
        char[] charArr = new char[26];
        for (char ch = 'a'; ch <= 'z'; ch++) {
            charArr[ch - 'a'] = ch;
        }

        byte[] byteArr = new byte[20];
        for (byte i = 97, j = 0; j < byteArr.length; i++) {
            byteArr[j++] = i;
        }

        int[] intArr = new int[26];
        for (int i = 0; i < 26; i++) {
            intArr[i] = 65 + i; // A to Z
        }

        // MyString objects
        MyString s1 = new MyString(charArr);
        MyString s2 = new MyString(charArr, 0, 5);
        MyString s3 = new MyString("Hello World!");
        MyString s4 = new MyString(new StringBuffer("Buffer"));
        MyString s5 = new MyString(new StringBuilder("Builder"));
        MyString s6 = new MyString(byteArr);
        MyString s7 = new MyString(byteArr, 5, 10);
        MyString s8 = new MyString(intArr);
        MyString s9 = new MyString(intArr, 10, 5);

        // Display
        System.out.println("Full Char[]   : " + s1);
        System.out.println("Subset Char[] : " + s2);
        System.out.println("From String   : " + s3);
        System.out.println("From Buffer   : " + s4);
        System.out.println("From Builder  : " + s5);
        System.out.println("From Byte[]   : " + s6);
        System.out.println("Byte Subset   : " + s7);
        System.out.println("From Int[]    : " + s8);
        System.out.println("Int Subset    : " + s9);
    }
}
