import java.util.*;

public class queue_operations {
    static void print(String n) {
        String name = n;
        try {
            for (int i = 0; i <= name.length() - 1; i++) {
                System.out.print(name.charAt(i));
                Thread.sleep(100);
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print(".............Queue Operations...............");
        print("Declaration of the Queue ");
        print(" Queue<String>airways=new LinkedList<>();");
        Queue<String>airways=new LinkedList<>();
        print("........ADDING the Values ..........");
        print("airways.offer('jet airways')");
        airways.offer("Jet airways");
        airways.offer("indian airways");
        airways.offer("Air force one airways");
        print("displaying the current queue");
        System.out.println(airways);
        print("To remove and return the first element in the queue");
        print("airways.poll()");
        System.out.println(   airways.poll());
        print("To look at the peek or the first element ");
        print("airways.peek()");
        print(airways.peek());





    }
}
