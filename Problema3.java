import java.util.Scanner;

public class Main {
    
    public static void comparareVarste(int a, int b){
    int x=0;
    if (a>b){
        x = a-b;
    System.out.println("Primul copil este mai mare cu " + x + " ani.");
    }
    else if (b>a){
        x = b-a;
        System.out.println("Al doilea copil este mai mare cu "+ x + " ani.");
    } else if(a == b){
        System.out.println("Copii au varste egale.");
    }
    }
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Introdu varstele copiilor: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        comparareVarste(a,b);
    }
}

