import java.util.Stack;

class Stackexample {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("white"); // to push the elements into the stack
        books.push("red");
        books.push("black");
        System.out.println(books.peek());// to quick look on the stack
        System.out.println(books.search("red"));// to search the value positions
        System.out.println(books.pop());// to delete the elements
        System.out.println(books);
        System.out.println(books.isEmpty());
        /*
         * ouputs==>
         * black
         * 2
         * black
         * [white, red]
         * false
         * PS D:\Collections\JavaPractice>
         */

    }
}
