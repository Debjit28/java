import java.util.*;
public class third_aaray{
    public static void main(String[]args){
        int n;//size of aaray
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        int []array_num=new int[n];
        for(int i=0; i<n;i++){
            array_num[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            System.out.print("{"+array_num[j]+"}");
        }
        sc.close();




    }
}