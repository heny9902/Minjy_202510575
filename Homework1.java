import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "회차) 정수를 입력하세요 : ");
            int num = scanner.nextInt();
            numSum += num;
            System.out.println("현재까지 입력된 정수의 합은 " + numSum + "입니다.");
        }
    }
}