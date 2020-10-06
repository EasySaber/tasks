import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = input.nextInt();
        int zero = 0;
        do {
            n = n / 5;
            zero = zero + n;
        }while (n > 5);
        System.out.print("Zero -> " + zero);
    }
}
