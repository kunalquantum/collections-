import java.util.*;
class MAP{
    public void print(String n) {
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
    private
    Map<String,Integer> world=new HashMap<>();

    public void Add_key_value(String k,int v){
        world.put(k,v);

    }
    public void key_checker(String key){
        print("checking for the key");
        System.out.println(world.containsKey(key));
        Boolean res=world.containsKey(key);
        if(res){
            print("The is key is present in the map");
        }
        else {
            print("Key is not present in the map  ");
        }
    }
    public void key_value(String k,int p){
        print("This is Key and value checker which checks the absence of the pair is present or not ");
        Integer n=world.putIfAbsent(k,p);
        System.out.println(n);
        if(n!=null){
            print("the pair is present in the map");

        }else{
            print("Not present");
        }

    }

    public void display(){
        System.out.println(world);
    }

    public void get_key_value(){
        print("this is to get the Key of the value entered");
        for(Map.Entry<String,Integer> e:world.entrySet()){
            System.out.println(e);
            print("the key of the "+e.getKey());
            print("the values :"+e.getValue());
        }
    }
}
public class map_operations {
    public static void main(String[] args) {

        MAP m=new MAP();
        Scanner sc=new Scanner(System.in);
        m.print("_________-Map Implementation_____________ ");
        System.out.println("enter no total enteries you want to make ");
        int h=sc.nextInt();
        String key;
        int value;
        sc.nextLine();
        for (int i = 0; i < h; i++) {
            m.print("enter the key :");
            key=sc.nextLine();
            m.print("Enter the value");
            value=sc.nextInt();
            m.Add_key_value(key,value);
            sc.nextLine();

        }
        m.display();
        m.print("checking the key in the map");
        m.print("map.containskey(key)");
        m.print("please enter the key for search");
        String key1=sc.nextLine();
        m.key_checker(key1);
        m.print("To check wheather the key value is present or not ");

        m.key_value("mayak",23);
        m.display();
        m.get_key_value();

    }
}
