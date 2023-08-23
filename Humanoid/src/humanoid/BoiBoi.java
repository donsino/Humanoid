package humanoid;

import java.util.Scanner;

public class BoiBoi {

    public static void main(String[] args) {
        Humanoid charity = new Humanoid();
        Scanner scanner = new Scanner(System.in);
        
        charity.powerOn();
        switch(scanner.nextInt()){
            case 1:{
               charity.startInteraction();
            break;
            }
            case 2:{
                charity.runErrand();
            break;
            }
            case 3:{
                charity.cuddle();
            break;
    }
}
    }
    
}
