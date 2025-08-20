import java.util.*;

class MyArrayIndexOutOfBoundException extends RuntimeException
{

	public MyArrayIndexOutOfBoundException(String desc)
	{
		super(desc);
	}

}


class MyArrayList<E>
{

	E[] arr;
	public int indx ;
	public static final int DEFAULT_CAPACITY = 10;

	public MyArrayList(){
		this(DEFAULT_CAPACITY);


	}

	public MyArrayList(int capacity){
  arr=(E[]) new Object[capacity];
	}


	public MyArrayList(MyArrayList coll){
		arr = (E[]) new Object[coll.size()];
		for(int i =0;i<coll.size();i++){
			arr[i] =(E)coll.get(i);
		}
	}

	@Override 
	public String toString(){
		if(size()==0)
			return "[]";

		String data ="[";
		for(int i =0;i<size()-1;i++)
		{
			data +=arr[i]+",";
		}

		data += arr[indx-1]+"]";
		return data;
	}

	public int size(){
		return indx;
	}

	public boolean add(E element){

		if(arr.length==size()){
			E[] newArr=(E[]) new Object[getCapacity(arr.length)];
			for(int i =0;i<=size();i++){
				newArr[i] = arr[i];
			}

			arr=newArr;
		}

		arr[indx++] =element;
		return true;

	}

	public void add(int indx,E ele){
		if(indx<0 || indx>=size()){
			throw new MyArrayIndexOutOfBoundException
			("Index"+indx+"out of bound for length" +size());
		}

		if(arr.length==size()){

			E[] newArr=(E[]) new Object[getCapacity(arr.length)];
			for(int i =0;i<=size();i++){
				newArr[i] = arr[i];
			}

			arr=newArr;

		}

		for(int i= size()-1;i>=indx;i--){
			arr[i+1]=arr[i];
		}

		arr[indx]=ele;
		this.indx++;
	}

	public boolean addAll (MyArrayList coll){
		boolean flag = false;
		for(int i =0;i<coll.size();i++){
			if(add((E) coll.get(i))){
				flag = true;
			}

        }
                return flag;

            }

            private int getCapacity(int oldCap)
            {
            	return (int)(oldCap*1.5);
            }

            public boolean isEmpty(){
            	return (size()!=0)?false:true;
            }

            public E get (int indx){

            	if(indx<0 || indx>=size()){
            		throw new MyArrayIndexOutOfBoundException
            		("Index" + indx +"out of bound for length" + size());

            	}

            	return arr[indx];
            }

            public E set(int indx,E element){
            	if(indx<0 || indx>=size()){
            		throw new MyArrayIndexOutOfBoundException("Index" + indx +"out of bound for length" + size());


            	}

            	E temp = arr[indx];
            	arr[indx] = element;
            	return temp;
            }

            public void clear(){
            	arr =(E[]) new Object[arr.length];
            	indx=0;
            }

            public boolean contains(E element){
            	for (int i =0;i<size();i++){
            		if(arr[i].equals(element)) return true;
            	}

            	return false;
            }

          public boolean containsAll(MyArrayList coll){
          	for(int i =0;i<coll.size();i++){

          		if(contains((E)coll.get(i))){
          			return true;
          		}
          	}

          	return false;
          }

          public boolean remove(int indx){
          	if(indx<0 || indx>=size()){
          		throw new MyArrayIndexOutOfBoundException("Index" + indx +"out of bound for length" + size());

          	}


          	for(int i =indx;i<size();i++){
          		arr[i]=arr[i+1];
          	}
          	this.indx--;
          	return true;
          }

          public int indexOf(E element)
          {
          	for(int i=0;i<size();i++){
          		if(arr[i].equals(element)) return i;
          	}
          	return -1;
          }

          public int lastIndexOf(E element){
          	for(int i =size()-1;i>=0;i--){
          		if(arr[i].equals(element)) return i;
          	}

          	return -1;
          }

          public boolean removeAll(MyArrayList coll){
          	boolean flag = false;

          	for(int i =0;i<coll.size();i++){
          		int eleIndx = indexOf((E) coll.get(i));
          		if(remove(eleIndx)) flag = true;
          	}

          	return flag;
          }

  }


class MyDriverListExample{
	public static void main(String[] args) {
		
		MyArrayList<Integer> list2 = new MyArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		list2.add(70);

      MyArrayList<Integer> list3 = new MyArrayList<>();
		list3.add(10);
		list3.add(20);
		list3.add(90);
		
		System.out.println("list 3"+list3);
		System.out.println("list2"+list2);
		System.out.println(list2.removeAll(list3));
		System.out.println(list2);
		System.out.println(list2.size());

	}
}