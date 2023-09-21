package n20230921;

public class f4 {
    public static void main(String[] args){
        // OR 연산
        int left = 10;
        int right = 20;
        System.out.println(++left == 11 || ++right == 21);
        System.out.println(left);
        System.out.println(right);
        
        // AND 연산;
        System.out.println(++left == 282 && ++right == 21);
        System.out.println(left);
        System.out.println(right);

        int random_number = 11;
        String number_type = (random_number%2==0) ? "짝수" : "홀수";
        System.out.println(number_type);

        int number = 0;
        number += 5;
        System.out.println(number);

        int number2 = 0;
        number2 = +5;
        System.out.println(number2);
    }
}
