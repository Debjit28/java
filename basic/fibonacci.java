import java.util.*;
public class fibonacci {
    public static void main(String[]args){
        int n , a , b ;
        a=0;
        b=1;
        int sum;
        System.out.println("enter the limit of loop");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        for(int i=0; i<n;i++){
            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;
        }

    }
    
}
