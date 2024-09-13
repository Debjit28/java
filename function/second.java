import java.util.*;
public class second{
    static void matlabi(int money){
        System.out.println("hello i am here");
        
    }
    public static void main(String[]args){
        //passing parameter in java
        int money;
        System.out.println("enter the value of money");
        Scanner sc=new Scanner(System.in);
        money=sc.nextInt();
        sc.close();
        matlabi(money);

    }
}