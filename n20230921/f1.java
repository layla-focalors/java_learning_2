// 강제 형 변환
package n20230921;

import javax.swing.text.Style;

public class f1 {
	public static void main(String[] args) {
        // casting
        char char_value1 = 'A';
        char char_value2 = 1;

        char sum_char = (char) (char_value1 + char_value2);
        System.out.println(sum_char);

        // 자동 형 변환
        int int_value = 100;
        double double_Value = 111.45;
        double sum_value = double_Value + int_value;
        System.out.println(sum_value);
        
        // 28
        int int_value1 = 100;
        double double_Value1 = 111.45;
        double sum_value1 = (double) (double_Value1 + int_value1);
        System.out.println(sum_value1);

        // 단항연산자 ( ++ / -- )
        int x = 5;
        x = x++ - ++x;
        // x ( 5) - x(7)
        // -> 처리 방향, 참조가 끝나면 증가
        System.out.println(x);
        System.out.println(-x);
        System.out.println(x);
    }
}