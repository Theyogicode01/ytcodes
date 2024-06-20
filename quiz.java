// hello everyone....let's get started :)
import java.util.*;
class quiz{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ask = "Do you want to take a quick quiz ? ";
        System.out.println(ask);
        String a = sc.nextLine();
        if(a.equals("yes")){
            System.out.println("okk then, let's go !");
            String q1 = "What is the capital of India ? ";
            System.out.println(q1);
            String b = sc.nextLine();
            if(b.equals("new delhi")){
                System.out.println("correct !");
            }else{
                System.out.println("better luck next time :)");
            }
            String q2 = "What language do most Indians speak ? ";
            System.out.println(q2);
            String c = sc.nextLine();
            if(c.equals("hindi")){
                System.out.println("correct !");
            }else{
                System.out.println("better luck next time :)");
            }
        }else if(a.equals("no")){
            System.out.println("then go from here.");
        }else{
            System.out.println("please enter yes/no.");
        }
    }
}