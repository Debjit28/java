public class right_pyra {
    public static void main(String[]args){
        int i , j ,n=6;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
}
