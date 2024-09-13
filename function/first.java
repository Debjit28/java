import java.util.*;
public class first {
    public static void my_name(String name){
        System.out.print(name);
        return ;
    }
    public static void main(String[]args){
        System.out.println("enter your name pls");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        sc.close();
        my_name(name);
        

    }

    }
    

