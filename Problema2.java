import java.util.Scanner ;

public class Main {
    public static void perechiNum(int n){
        for (int x=1; x<n;x++){
            int y = n-x;
            if(x<=y){
            System.out.println(x + " " + y);
            }
        }    
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu n: ");
        int n= scanner.nextInt();
        System.out.println("Perechile sunt: ");
        perechiNum(n);
        
        scanner.close();
    }
}

