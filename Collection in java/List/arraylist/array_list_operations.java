import com.sun.security.jgss.GSSUtil;

import javax.lang.model.type.ArrayType;
import java.util.*;
public class array_list_operations {
    static void print(String n) {

        try {
            for (int i = 0; i < n.length(); i++) {
                Thread.sleep(100);
                System.out.print(n.charAt(i));
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    static void print(int m) {

        String n=Integer.toString(m);
        try {
            for (int i = 0; i < n.length(); i++) {
                Thread.sleep(100);
                System.out.print(n.charAt(i));
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        print("ArrayList Implementation Operations");
        print("To Declare the object of the ArrayList");
        print("import java.util.*;");
        print("ArrayList<datatype(wrapper class)> object=new ArrayList<>();");
        ArrayList<Integer>object=new ArrayList<>();
        print("Adding in the Array of type <data type>");
        object.add(23);
        print("object.add(23)");
        System.out.println(object);
        print("To remove or delete the element using the index number ");
        object.remove(0);
        print("object.remove(23);");
        object.add(12);
        object.add(232);
        System.out.println(object);
        print("the Clear the complete List or the arrayList ");
        object.clear();
        print("object.clear();");
        System.out.println(object);
        object.add(12);
        object.add(4);
        object.add(67);
        print("To check the existance of the element in the array");

        print("object.contains(4);");
        System.out.println(object.contains(4));
        print("creating the new object and thus ... adding the whole new list as the element in the list");
        print("ArrayList<int> object2=new ArrayList<>();");
        ArrayList<Integer> Object2=new ArrayList<>();
        Object2.add(12);
        Object2.add(90);
        Object2.add(23);
        print("Object2.addAll(object);");
        System.out.println(Object2.addAll(object));
        print("to get the index of the element  existing in the array ");
        int rez=Object2.get(1);
        print("Object2.get(23);");
        System.out.println(rez);
        print("removing a Particular element ");
        Object2.remove(Integer.valueOf(12));
        print("  Object2.remove(Integer.valueOf(12));");
        System.out.println(Object2);
        print("to get the size of the or the length of te array ");
        System.out.println(Object2.size());
        print("Lets have the oveview on the iterator ");
        for(Integer element:Object2){
            print(element);
        }
    }
}
