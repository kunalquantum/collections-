import java.util.*;

public class Dequeue {
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
        Scanner sc=new Scanner(System.in);
        ArrayDeque<Integer> dek=new ArrayDeque<>();
    print("Double ended Queue Implementation");
    print("declaration of Double ended Queue");
    print("ArrayDeque<Integer> dek=new ArrayDeque<>();");
    print("Enter the how you like to enter the elements \n1.Front side \n2.Back side ");
    sc.nextLine();
    int c=sc.nextInt();
    if (c==1){
        print("Enter the elements in First  way");
        int n=sc.nextInt();
        int e;
        for (int i = 0; i <6 ; i++) {
            System.out.println(">");
            e=sc.nextInt();
            dek.offerFirst(e);
        }

    }else {
        print("Enter the elements in back way");
        int n=sc.nextInt();
        int e;
        for (int i = 0; i <6 ; i++) {
            System.out.println(">");
            e=sc.nextInt();
            dek.offerLast(e);
        }

    }
    print("_____________printing the double ended queue___________");
    for (Integer e:dek){
        System.out.print(e+" -> ");
    }
    print("________________________________________________________-");
        print("Enter the how you like to Delete the elements \n1.Front side \n2.Back side ");
        c=sc.nextInt();
        if (c==1){
            print("Deleting the elements from the first  ");
            int n=sc.nextInt();
            int e1;
            for (int i = 0; i <6 ; i++) {
                System.out.println(">");
                e1=sc.nextInt();
                dek.pollFirst();
            }

        }else {
            print("Deleting the elements from the back  ");
            int n=sc.nextInt();
            int e;
            for (int i = 0; i <6 ; i++) {
                System.out.println(">");
                e=sc.nextInt();
                dek.offerLast(e);
            }

        }
        print("_____________printing the double ended queue___________");
        for (Integer e:dek){
            System.out.print(e+" -> ");
        }
        print("________________________________________________________-");

    }
}
