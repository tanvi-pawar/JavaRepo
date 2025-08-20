
import java.util.*;

class MyArrayList<E> {

    @SuppressWarnings("unchecked")
    E[] arr;
    private int indx;  

    public static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        arr = (E[]) new Object[DEFAULT_CAPACITY];
        indx = 0;
    }

    @Override
    public String toString() {
        if (size() == 0)
            return "[]";

        String data = "[";
        for (int i = 0; i < size(); i++) {
            data = data + arr[i];
            if (i < size() - 1) {
                data = data + ", ";
            }
        }
        data = data + "]";
        return data;
    }

    public int size() {
        return indx;
    }

    public boolean add(E element) {
        if (arr.length == size()) {
            E[] newArr = (E[]) new Object[getCapacity(arr.length)];
            for (int i = 0; i < size(); i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[indx++] = element;
        return true;
    }

    private int getCapacity(int oldCap) {
        return (int) (oldCap * 1.5);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

   
    public boolean addAll(MyArrayList<E> otherList) {
        boolean modified = false;
        for (int i = 0; i < otherList.size(); i++) {
            this.add(otherList.arr[i]);
            modified = true;
        }
        return modified;
    }
}

class Methods1 {
    public static void main(String[] args) {
        
        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println("list1 size: " + list1.size());

        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(40);
        list2.add(50);

        System.out.println("list2 before addAll: " + list2);
        System.out.println("list2 size: " + list2.size());
        System.out.println("list2 isEmpty: " + list2.isEmpty());

        System.out.println("addAll result: " + list2.addAll(list1));
        System.out.println("list2 after addAll: " + list2);
    }
}
