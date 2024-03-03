import java.util.*;

class Paging {
    Stack<String> names = new Stack<>();
    Stack<Integer> id = new Stack<>();
    Scanner sc = new Scanner(System.in);

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

    String PageName;
    int tag;

    public void add_page() {
        print("Start entering the pages name and respective ids");

        String name = sc.nextLine();
        int id1 = sc.nextInt();
        sc.nextLine(); // consume the newline
        names.push(name);
        id.push(id1);

    }

    public void Process_page() {
        print("...........Processing the Pages............. ");
        int stackSize = names.size();
        for (int i = 0; i < stackSize; i++) {
            String pageName = names.pop();
            int pageId = id.pop();
            print("| Page Name: " + pageName + " " + pageId);
        }
        print("..........processing complete........");
    }
}

public class page_loading_project {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Paging p = new Paging();
            p.print("||   Welcome to the Page processor     ||");
            p.print("How Many pages would you like to enter");
            int count=sc.nextInt();
            int c=0;
            while (c!=count){

            p.add_page();
            c=c+1;}

            p.Process_page();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
