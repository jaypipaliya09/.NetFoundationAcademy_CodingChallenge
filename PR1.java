import java.util.LinkedList;
import java.util.Scanner;

public class PR1 {
    static LinkedList<Integer> ll;

    public static void main(String[] args) {
        ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int value = sc.nextInt();
        System.out.println("Enter the index");
        int index = sc.nextInt();

        ll.add(1);
        ll.add(5);
        ll.add(10);
        ll.add(3);
        ll.add(6);
        insert(value, index);
        System.out.println(ll);
    }

    public static void insert(int value, int index) {
        ll.add(index - 1, value);
    }
}
