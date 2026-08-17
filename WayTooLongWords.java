import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        String s;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++){
            s = sc.nextLine();
            if (s.length() > 10){
                System.out.print(s.charAt(0));
                System.out.print(s.length()-2);
                System.out.println(s.charAt(s.length()-1));
            }
            else {
                System.out.println(s);
            }
        }
    }
}
