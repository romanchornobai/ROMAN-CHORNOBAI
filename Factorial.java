import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Numero: ");
    int num = sc.nextInt();
    long result = 1;
    

    if (num >= 0 && num <= 35) {
        System.out.print(1);
        
        for (int i=2; i<=num; i++) {
            result *= i;
            System.out.print(" * " + i);
        }
            
        System.out.println();
        System.out.println("Resultado: " + result);
    
    }
    else {
        System.out.println("Solo se aceptan numeros de 1 a 35");
    }
  }
}
