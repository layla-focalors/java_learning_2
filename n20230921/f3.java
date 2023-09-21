package n20230921;

public class f3 {
    public static void main(String[] args){
        // 논리연산자 예제
        int number = 120;

        System.out.printf("number가 100보다 크고 200보다 작거나 같은가? [%b]\n", 
        (number > 100) && (number <= 200));
        // System.out.println((number > 100) && (number <= 200));
        System.out.printf("number가 짝수이거나 1인가? [%b]",(number%2==0) || (number==1));
    }
}
