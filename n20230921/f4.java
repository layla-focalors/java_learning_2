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
    }
}
