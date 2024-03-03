import java.util.*;

class Royal_Rumble {
    int w, w1, p, p1;
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> weights = new ArrayList<>();
    ArrayList<Integer> power = new ArrayList<>();

    ArrayList<String> namesb = new ArrayList<>();
    ArrayList<Integer> weightsb = new ArrayList<>();
    ArrayList<Integer> powerb = new ArrayList<>();
    String name;
    int weight, weight2;
    int power1, power2;

    public void participate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of wrestlers in each team");

        int b = sc.nextInt();
        sc.nextLine();

        print("|| For teams in the A ||");
        for (int i = 0; i < b; i++) {
            System.out.println("Enter the name of Wrestler");
            String n = sc.nextLine();
            names.add(n);
            System.out.println("Enter the Weight of the wrestler");
            int w = sc.nextInt();
            weights.add(w);
            System.out.println("Enter the Power of Wrestler ");
            int p = sc.nextInt();
            power.add(p);
            sc.nextLine(); // consume the newline character
        }

        print("|| For teams in the B ||");
        for (int i = 0; i < b; i++) {
            System.out.println("Enter the name of Wrestler");
            String n = sc.nextLine();
            namesb.add(n);
            System.out.println("Enter the Weight of the wrestler");
            int w = sc.nextInt();
            weightsb.add(w);
            System.out.println("Enter the Power of Wrestler ");
            int p = sc.nextInt();
            powerb.add(p);
            sc.nextLine(); // consume the newline character
        }
    }

    public String prewrestle(String name1, String name2) {
        w = names.indexOf(name1);
        w1 = names.indexOf(name2);
        weight = weights.get(w);
        weight2 = weights.get(w1);
        if (weight > weight2) {
            return name1;
        } else {
            return name2;
        }
    }

    public String wrestle(String name1, String name2) {
        p = names.indexOf(name1);
        p1 = names.indexOf(name2);

        power1 = power.get(p);
        power2 = power.get(p1);
        if (power1 > power2) {
            return name1;
        } else {
            return name2;
        }
    }

    public void results() {
        for (int i = 1; i < names.size()+1; i++) {
            String PW, WW;
            ArrayList<String> PW1 = new ArrayList<>();
            ArrayList<String> WW1 = new ArrayList<>();
            PW = prewrestle(names.get(i), namesb.get(i));
            PW1.add(PW);
            WW = wrestle(names.get(i), namesb.get(i));
            WW1.add(WW);
            if (PW1.get(0).equals(WW1.get(0))) {
                System.out.println("Undoubted Continental champion is :" + PW);
            } else if (PW.length() != WW.length()) {
                System.out.println("Continental champion is " + WW);
            } else {
                System.out.println("Match tied");
            }
        }
    }

    public void print(String n) {
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
}

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Royal_Rumble r = new Royal_Rumble();
        r.print("|| Welcome to the Royal Rumble game ||");
        r.participate();
        r.print("Participation Process Completed");
        r.results();
    }
}
