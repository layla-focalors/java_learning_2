package n20230921;

import java.util.Scanner;

public class f7 {
    public static void main(String[] args){
        try (// switch case문
        Scanner sc = new Scanner(System.in)) {
            System.out.println("input error code\nE001\nE002\nE003");
            String error_type = sc.next();
            switch(error_type){
                case "E001" -> {
                    System.out.println("case error");
                    break;
                }
                case "E002" -> {
                    System.out.println("세미콜론이 없습니다.");
                    break;
                }
                case "E003" -> {
                    System.out.println("노아");
                    break;
                }
                default -> {
                    System.out.println("에러 코드가 잘못되었습니다.");
                }
            }
        }
    }
}
