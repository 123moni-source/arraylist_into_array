import java.util.*;
public class ArrayListToArray {
    public static void main(String[] args) {
        //create an array list
        ArrayList<Integer> a1=new ArrayList<Integer>();
        //add elements to the array list
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        System.out.println("Contents of a1: "+a1);
        //get the array
        Integer ia[]=new Integer[a1.size()];
        ia=a1.toArray(ia);
        int sum=0;
        //sum the array.
        for(int i:ia) sum+=1;
        System.out.println("Sum is:"+sum);
    }
}
