package n20230921;

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
        while(add < 21){
            add += 1;
            System.out.printf("add = %d\n", add);
        }
        add = 0;
        boolean isrun = false;
        do {
            add += 1;
            System.out.println("[do-while] " + add);
        }while (!isrun);
    }
}
