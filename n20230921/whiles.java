package n20230921;

import javax.swing.text.Style;

public class whiles {
    public static void main(String[] args){
        int add = 0;
        boolean switcher = true;
        // while(switcher){
        //     System.out.println("반복중! " + add++);
        //     if(add == 210){
        //         switcher = false;
        //     }
        // }
        // while(add < 21){
        //     add += 1;
        //     System.out.printf("add = %d\n", add);
        // }
        // add = 0;
        // boolean isrun = false;
        // do {
        //     add += 1;
        //     System.out.println("[do-while] " + add);
        // }while (!isrun);

        // for(int i = 0; i < 4; i++){
        //     for(int j = 0; j < 5; j ++){
        //         if(i == 3 && j == 3){
        //             System.out.println("before break");
        //             break;
        //         }
        //         System.out.println("after break");
        //         // continue;
                
        //     }
        // }

        int x = 0;
        while(x < 100){
            if(x%2 == 0){
                x++;
                continue;
            }
            System.out.println(x);
            x++;
        }
    }
}
