package calculadora.de.nota;
import java.util.Scanner;
public class CalculadoraDeNota {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int contAprovados = 0;
    
    for (int i = 0; i < 10; i++) {
    
            System.out.println("Digite a nota 1");
            double nota1 = scanner.nextDouble();
            System.out.println("Digite nota 2");
            double nota2 = scanner.nextDouble();
            System.out.println("Digite a frequencia");
            double frequencia = scanner.nextDouble();
            double media = (nota1 + nota2) / 2;
            
            
            if(frequencia < 74.99) {
                System.out.println("Reprovado");
            }else{
                if(media < 7) {
                    System.out.println("Reprovado");
            }else{
                    System.out.println("Aprovado");
                    contAprovados++;
                    }
                
                
                
            }
}
    
}
}
