import java.util.*;
public class set {
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
        System.out.println("Enter the Data type for the set \n1.Integer\n2.String");
        int choice=sc.nextInt();
        if(choice==1){
            Set<Integer> set=new HashSet<>();
            System.out.println("enter the no of elements you want to add ");
            int k=sc.nextInt();
            int c;
            for (int j = 0; j < k; j++) {

                c=sc.nextInt();
                set.add(c);

            }
            System.out.println("Printing the elements ");
            for (Integer e:set){
                System.out.println(e);
            }
            System.out.println("hash code :"+set.hashCode());
        }
        else{
            Set<String> set =new HashSet<>();
            System.out.println("enter the no of elements you want to add ");
            int k=sc.nextInt();
            String c;
            for (int j = 0; j < k; j++) {

                c=sc.nextLine();

                set.add(c);

            }

            System.out.println("Printing the elements ");
            for (String e:set){
                System.out.println(e);
            }
            System.out.println("hash code :"+set.hashCode());

        }

    }
}
