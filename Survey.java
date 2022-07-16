import java.util.*;
public class Survey {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome..Thank you for taking Food Bill survey.........");
    int count=0;
    System.out.println("\nWhat is your name?");
    String name=sc.nextLine();
    count++;
 
    System.out.println("\nHow much money do spend on Fruit Juice?");
    double money=sc.nextDouble();
    count++;

    System.out.println("\nHow much money do spend on Biryani?");
    double money1=sc.nextInt();
    count++;

    System.out.println("\nHow many times in a week do you buy Fruit Juice?");
    int times1=sc.nextInt();
    count++;

    System.out.println("\nHow many times in a week do you buy Biryani?");
    int times2=sc.nextInt();
    count++;
    System.out.println("\nThank you "+ name +" for answering "+ count + "  quetions......");
    System.out.println("\nBiryani is "+ (money1/money) + " times of Fruit Juice");
    System.out.println("\nWeekly you spend money "+ (money*times1) + "  on Fruit Juice ");
    System.out.println("\nWeekly you spend money"+ (money1*times2)+ "  on Biryani ");
    sc.close();


    


    }
    
}
