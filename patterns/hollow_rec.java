public class hollow_rec {
    public static void main(String[]args){
        int i , j ,n;
        n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=n+1;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    
}
