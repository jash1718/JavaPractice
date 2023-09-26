import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        java.util.Vector<String> v1 = new java.util.Vector<>();
        v1.add("jash");
        v1.add("bhanuu");
        v1.add("pilla");
        v1.add(0, "vimal");
        System.out.println(v1.size());// to know the size of the array..
        System.out.println(v1.capacity());// to know the capacity of the size....
        System.out.println(v1);
        java.util.Vector<String> v2 = new java.util.Vector<>();
        v2.add("hari");
        v2.add("vinay");
        System.out.println(v1.addAll(v2));// it adds elements to the end of the vector..
        System.out.println(v1.addAll(0, v2));// it adds the elements to the starting of an array..
        System.out.println(v1.get(3));// to get the data
        v1.remove(1);// to remove the data...
        System.out.println(v1.contains("hari"));// to verify the elements..
        System.out.println(v1.set(2, "jaswanth"));// to update the element..
        System.out.println(v1.firstElement());// to find first element..
        System.out.println(v1.lastElement());// to find last element
        System.out.println(v1);
    }
}
