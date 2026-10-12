import java.util.Scanner;

public class Homework4 {

    int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }

        int smaller = m < n ? m : n;
        int larger = m > n ? m : n;

        return gcd(smaller, larger % smaller);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Homework4 hw = new Homework4();

        System.out.print("두 수를 입력하세요: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result = hw.gcd(num1, num2);

        System.out.println("두 수의 최대공약수는 " + result + "입니다.");

        scanner.close();
    }
}