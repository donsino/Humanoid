package humanoid;

import java.util.Scanner;

public class Humanoid{
    int chargeLevel;
    boolean powerState;
    String language;
    boolean inMotion;
    int speechVolume;
    ArmType arm;
    Scanner scanner = new Scanner(System.in);

    public Humanoid() {
        this.chargeLevel = 53;
        this.powerState = false;
        this.language = "US_en";
        this.inMotion = false;
        this.speechVolume = 40;
    }
    void powerOn(){
        System.out.println("Power On!\nHow may i be of help today\n1. Start Interaction\n2. Run Errand\n3. Cuddle");
    }
    
    void startInteraction(){
        System.out.println("(Input exit to stop)\nWhat do you want to talk about!");
        String input = scanner.nextLine();
        while(! input.contains("exit")){
            System.out.println("Okay");
            input = scanner.nextLine();
        }
    }
    
    void runErrand(){
        this.arm = ArmType.STIFF;
        System.out.println(arm + " ARM TYPE ACTIVATED!\n(Input 'stop' to exit)\nWhat can i do for you!");
        String input = scanner.nextLine();
        
        while(! input.contains("stop") ){
            System.out.println("What else can i do for you");
            input = scanner.nextLine();
        if(input.contains("stop")){
            System.out.println("see you next time!");
        }
        }
    }
    
    void cuddle(){
        System.out.println("You must be feeling lonely, let's get on with it!");
        this.arm = ArmType.SOFT;
        System.out.println(arm + " ARM TYPE ACTIVATED!");
    }
}