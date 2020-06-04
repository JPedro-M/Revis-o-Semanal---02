
package revisão.semanal.pkg02;

import java.util.Scanner;

/**
 *
 * @author troll
 */
public class RevisãoSemanal02 {
    
    public static void main(String[] args) {

        Double total, A1, A2, frangos;
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos frangos tem?");
        frangos = ler.nextDouble();
        A1 = frangos;
        A2 = frangos*2;
        total = A1*4 + A2*3.50;
        
        System.out.println("O gasto é: R$"+total);
    }
    
}
