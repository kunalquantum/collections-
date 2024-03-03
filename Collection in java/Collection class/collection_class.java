import java.sql.ClientInfoStatus;
import java.util.*;
public class collection_class {
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
     print("The Collection Class provides some More Functionalties ");
     Scanner sc=new Scanner(System.in);
     print("Performing the Min amd Max Operation using collection class");
     List<Integer> list=new ArrayList<>();
        System.out.println("enter the no of elements you want to add ");
        int k=sc.nextInt();
        int c;
        for (int j = 0; j < k; j++) {

            c=sc.nextInt();
            list.add(c);

        }
        print("The maximum number is");
        System.out.println(Collections.max(list));
        print("The minimum number is");
        System.out.println(Collections.min(list));
        print("---------------------------------------------------------------------------");
        print("Checking the frequency of the Number or the element in the list ");
        print("what is the desired frequency");
        int f=sc.nextInt();
        System.out.println(Collections.frequency(list,f));
        print("Sorting ...ascending (default )");
        Collections.sort(list);
        System.out.println(list);
        print("sorting...decending by passing the comparator");
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);





    }
}
