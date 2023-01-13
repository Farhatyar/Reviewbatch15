package review3;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("please Enter your Favorite browser");
        String browser=scan.nextLine();

        switch (browser){
            case "chrome":
                System.out.println("Test case executed in"+browser);
                break;
            case "microsoft edge":
                System.out.println("Test case executed in"+browser);
                break;
            default:
                System.out.println("browser is unknown - no Execution");
        }
    }
}
