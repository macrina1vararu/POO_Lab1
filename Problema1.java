import java.util.Scanner;

public class Main{

    public static boolean verificarePrim(int n ){
        if (n < 2)
            return false;

        for (int i = 2; i<= Math.sqrt(n); i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu nr de elemente ale vectorului: ");
        int n = scanner.nextInt();
        int [] vector = new int[n];

        for (int i = 0 ; i<n; i++){
            vector[i] = scanner.nextInt();
        }

        boolean gasit = false;
        for (int i = n-1 ; i>= 0 ;i--){
            if ( verificarePrim(vector[i])){
                vector[i]=0;
                gasit = true;
                break;
            }
        }
        if (!gasit){
            System.out.println("Nu exista niciun nr prim.");
        } else {
            for(int i =0; i< vector.length; i++){
                System.out.print( vector[i] + " ");
            }
        }
    }

}

