package n20230921;

public class f2 {
    public static void main(String[] args){
        // 비교 연산
        float f1 = 0.001f;
        double d1 = 0.001;
        double d2 = (double)f1;
        float d3 = (float)d1;

        System.out.println(d2);
        System.out.println(d3);
        System.out.printf("f1:[%19.16f]/d1:[%19.16f]/d2:[%19.16f]/d3:[%19.16f]\n", f1, d1, d2, d3);

        System.out.printf("f1 == d1 : %b\n", f1==d1);
        
        System.out.printf("d1 == d2 : %b\n", d1==d2);
        System.out.printf("d2 == f1 : %b\n", d2==f1);
        System.out.printf("d3 == f1 : %b\n", d3==f1);
        
        // float, double 선언 -> 리터럴
        // 문자열 비교
        // 문자열 비교 - 참조비교
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.printf("str1 == str2 : %b\n", str1 == str2);
        System.out.printf("str1 == str2 : %b\n", str1 == str3);
        System.out.printf("str1 == str2 : %b\n", str2 == str3);

        // equals 메소드 이용
        System.out.printf("str1.euals(str2) : %b\n", str1.equals(str2));
        System.out.printf("str1.equals(str2) : %b\n", str1.equals(str3));
        System.out.printf("str1.equals(str3) : %b\n", str2.equals(str3));
        
    }
}
