package n20230921;
import java.util.Scanner;

public class f6 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = 0, num2 = 0;
            int operator = 0;
            System.out.println("first number >> ");
            num1 = sc.nextInt();
            System.out.println("2번째 숫자 입력 : ");
            num2 = sc.nextInt();
            System.out.println("Select Operator");
            System.out.println("1. 덧셈");
            System.out.println("2. 빼기\n3. 곱하기\n4. 나누기\n5. 나머지");
            int cnt = 0;
            operator = sc.nextInt();

            if(true && operator == 1){
                cnt += 1;
                System.out.println(num1 + num2);
            }
            else if(true && operator == 2){
                cnt += 1;
                System.out.println(num1 - num2);
            }
            else if(true && operator == 3){
                cnt += 1;
                System.out.println(num1 * num2);
            }
            else if(true && operator == 4){
                cnt += 1;
                System.out.println(num1 / num2);
            }
            else if(true && operator == 2){
                cnt += 1;
                System.out.println(num1 % num2);
            }
            System.out.println("CNT : " + cnt);
        }
    }

}
