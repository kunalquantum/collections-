import java.util.Arrays;
import java.util.Scanner;

public class array_class {
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
        print("ARRAY class Implementation");
        int pen[]={12,45,67,34,67,457,6};
        for(Integer e:pen){
            System.out.println(e);
        }
        print("Performing Binary Search");
        print("Please enter the number You want to search");
        int chouc=0;
        chouc=sc.nextInt();
        int index=Arrays.binarySearch(pen,chouc);
        if(chouc!=0){
            print("the value is present at index position"+index);
        }
        else{
            print("the element is not present");
        }
        print("Performing Sorting");
        Arrays.sort(pen);
        for(Integer e:pen){
            System.out.println(e);
        }

        print("Performing Fill which is filling every position of your array with the a number");
        print("Please enter  the number you wish to fill");
        int wish=sc.nextInt();
        Arrays.fill(pen,wish);
        for(Integer e:pen){
            System.out.println(e);
        }


    }
}
