import java.util.*;

public class stack {
    static void print(String n){
        String name=n;
        try {


        for(int i=0;i<=name.length()-1;i++){
            System.out.print(name.charAt(i));
            Thread.sleep(100);
        }
        System.out.println();}catch (Exception e){
            System.out.println(e);
        }}
    static void print(int m){
        String name=Integer.toString(m);
        try {


            for(int i=0;i<=name.length()-1;i++){
                System.out.print(name.charAt(i));
                Thread.sleep(100);
            }
            System.out.println();}catch (Exception e){
            System.out.println(e);
        }}


    public static void main(String args[]){
        Stack<Integer> st=new Stack<>();
        print("the stack implementatiion is ");
        print("Stack<Integer> st=new Stack<>();");
        System.out.println(st);
        print("Pushing the element in the stack ");
        st.push(12);
        st.push(45);
        print(" st.push(45);");
        print(st.push(56));
        System.out.println(st);
        print("Popping the element ");
        int rec=st.pop();
        print("st.pop()");
        print(st.pop());
        print("to check the stack is empty or not ");
        print("st.empty()");
        boolean emp=st.empty();
        System.out.println(emp);

        print("To search the element in stack ");
        print("st.search(78);");
        System.out.println(st.search(78));
        st.push(34);
        st.push(45);
        print("to check the capacity of the stack ");
        print("st.capacity()");
        System.out.println(st.capacity());


    }
}
