import java.util.*;
public class priority_queue {
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
//        comparator is the is package
       print("||  Priority Based Queue  || ");
       print("please choose the priority for the queue \n 1.max \n 2. min");
       Scanner sc= new Scanner(System.in);
       int choice=sc.nextInt();
       if(choice==2){
           Queue<Integer> min_q=new PriorityQueue<>();
           print("_______choosen the MInimum Priority_____");
           print("Queue<Integer> min_q=new LinkedList<>();");
           print("_______Adding the elements in the Priority Queue________");
           min_q.offer(90);
           print(" min_q.offer(90);");
           System.out.println(min_q);
           print("Enter the NUmber of elements you want to enter ");
           int b=sc.nextInt();
           int j=0;
           for (int i = 0; i <b ; i++) {
               print("Enter : ");
               j=sc.nextInt();
               min_q.offer(j);

           }
           print("_________removing the elements________");
           for (int i = 0; i < b; i++) {
               System.out.println(min_q.poll());
           }
           print("___________Complete the processs______");
       }
       else{
           Queue<Integer> max_q=new PriorityQueue<>(Comparator.reverseOrder());
           print("_______choosen the Maximum Priority_____");
           print("Queue<Integer> min_q=new LinkedList<>();");
           print("_______Adding the elements in the Priority Queue________");
           max_q.offer(90);
           print(" max_q.offer(90);");
           System.out.println(max_q);
           print("Enter the NUmber of elements you want to enter ");
           int b=sc.nextInt();
           int j=0;
           for (int i = 0; i <b ; i++) {
               print("Enter : ");
               j=sc.nextInt();
               max_q.offer(j);

           }
           print("_________removing the elements________");
           for (int i = 0; i < b; i++) {

               System.out.print(max_q.poll()+"  ");
           }
           print("___________Complete the processs______");
       }


    }
}
