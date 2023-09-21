package n20230921;

public class f5 {
    public static void main(String[] args){
        int number = 101;
        String game_id = "layla-focalors";
        if(number == 100 && number%2 == 0){
            System.out.println("넘버가 짝수이고 100이다!");
        }else {
            System.out.println("false");
        }
        
        if(game_id.equals("layla-focalors")){
            System.out.println("아이디가 일치합니다.");
        }else {
            System.out.println("아이디가 일치하지 않습니다.");
        }
    }
}
