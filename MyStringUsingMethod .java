final class MyString {
    char[] arr;

    // === Constructors ===
    MyString() {
        arr = new char[0];
    }

    MyString(String str) {
        arr = str.toCharArray();
    }

    MyString(char[] arr) {
        this.arr = new char[arr.length];
        System.arraycopy(arr, 0, this.arr, 0, arr.length);
    }

    // === String Methods Implementation ===

    public int length() {
        return arr.length;
    }

    public boolean isEmpty() {
        return arr.length == 0;
    }

    public char charAt(int index) {
        if (index < 0 || index >= arr.length)
            throw new MyStringIndexOutOfBoundException("Index " + index + " out of bounds");
        return arr[index];
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MyString)) return false;
        MyString other = (MyString) obj;
        if (this.length() != other.length()) return false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != other.arr[i]) return false;
        }
        return true;
    }

    public boolean equalsIgnoreCase(MyString other) {
        if (this.length() != other.length()) return false;
        for (int i = 0; i < arr.length; i++) {
            if (Character.toLowerCase(arr[i]) != Character.toLowerCase(other.arr[i]))
                return false;
        }
        return true;
    }

    public boolean startsWith(String prefix) {
        if (prefix.length() > arr.length) return false;
        for (int i = 0; i < prefix.length(); i++) {
            if (arr[i] != prefix.charAt(i)) return false;
        }
        return true;
    }

    public boolean endsWith(String suffix) {
        if (suffix.length() > arr.length) return false;
        int offset = arr.length - suffix.length();
        for (int i = 0; i < suffix.length(); i++) {
            if (arr[offset + i] != suffix.charAt(i)) return false;
        }
        return true;
    }

    public int indexOf(char ch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) return i;
        }
        return -1;
    }

    public int lastIndexOf(char ch) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ch) return i;
        }
        return -1;
    }

    public MyString substring(int start) {
        return substring(start, arr.length);
    }

    public MyString substring(int start, int end) {
        if (start < 0 || end > arr.length || start > end)
            throw new MyStringIndexOutOfBoundException("Invalid substring range");
        char[] subArr = new char[end - start];
        for (int i = start; i < end; i++) {
            subArr[i - start] = arr[i];
        }
        return new MyString(subArr);
    }

    public boolean contains(String str) {
        return toString().contains(str);
    }

    public MyString concat(MyString other) {
        char[] result = new char[this.arr.length + other.arr.length];
        System.arraycopy(this.arr, 0, result, 0, this.arr.length);
        System.arraycopy(other.arr, 0, result, this.arr.length, other.arr.length);
        return new MyString(result);
    }

    public MyString replace(char oldChar, char newChar) {
        char[] newArr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = (arr[i] == oldChar) ? newChar : arr[i];
        }
        return new MyString(newArr);
    }

    public MyString replaceFirst(String regex, String replacement) {
        return new MyString(this.toString().replaceFirst(regex, replacement));
    }

    public MyString replaceAll(String regex, String replacement) {
        return new MyString(this.toString().replaceAll(regex, replacement));
    }

    @Override
    public String toString() {
        return new String(arr);
    }
}



public class MyStringUsingMethod {
    public static void main(String[] args) {
        MyString s1 = new MyString("HelloWorld");
        MyString s2 = new MyString("HELLOworld");

        System.out.println("Length: " + s1.length());
        System.out.println("Is Empty: " + s1.isEmpty());
        System.out.println("Char at 4: " + s1.charAt(4));
        System.out.println("Equals: " + s1.equals(new MyString("HelloWorld")));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));
        System.out.println("Starts With 'Hel': " + s1.startsWith("Hel"));
        System.out.println("Ends With 'ld': " + s1.endsWith("ld"));
        System.out.println("Index of 'o': " + s1.indexOf('o'));
        System.out.println("Last Index of 'l': " + s1.lastIndexOf('l'));
        System.out.println("Substring(0,5): " + s1.substring(0, 5));
        System.out.println("Contains 'World': " + s1.contains("World"));
        System.out.println("Concat: " + s1.concat(new MyString("123")));
        System.out.println("Replace l→L: " + s1.replace('l', 'L'));
        System.out.println("ReplaceFirst 'l.': " + s1.replaceFirst("l.", "--"));
        System.out.println("ReplaceAll 'l': " + s1.replaceAll("l", "*"));
    }
}
