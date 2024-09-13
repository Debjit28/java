import java.util.*;
public class num_pyra_part_two {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int i , j, n , m;
        m=1;
        System.out.println("enter the limit");
        n=sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }

    }
    
}
