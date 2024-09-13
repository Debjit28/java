//Find an element x from an array & write it's index//
import java.util.*;
public class fourth{
public static void main(String[]args){
    int n , x ;
    System.out.println("enter the lenght of array");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int[]array=new int[n];
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
    System.out.println("enter the value of x");
    x=sc.nextInt();
    for(int i=0;i<n;i++){
        if(array[i]==x){
            System.out.print("the index is as follows"+i);
            break;
        }
    }
    sc.close();
}
//linear search technique
}