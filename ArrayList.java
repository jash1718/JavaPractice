import java.util.Arrays; // Added import statement

public class ArrayList {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 1, 2, 3, 4 };
        java.util.ArrayList<Integer> all = new java.util.ArrayList<>(Arrays.asList(arr));
        all.add(5);
        all.remove(1);
        all.add(0, null);
        System.out.println(all.get(0));

        System.out.println(all.size());
        System.out.println(all.set(4, null));
        System.out.println(all);
        for (Integer integer : all) {
            System.err.println(integer);

        }
        for (int i = 0; i < all.size(); i++)

        {
            System.out.println(all.get(i));
        }
    }
}
