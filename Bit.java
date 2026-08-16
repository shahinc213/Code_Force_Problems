import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();


        for (int i = 1; i <= n; i++){
            String operation = sc.nextLine();

            if (operation.equals("++X") || operation.equals("X++")){
                a += 1;
            }
            else if (operation.equals("--X") || operation.equals("X--")){
                a -= 1;
            }
        }

        System.out.println(a);
    }
}
