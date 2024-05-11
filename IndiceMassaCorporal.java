import java.util.Scanner;

public class IndiceMassaCorporal{

  public static void main(String[] args) {

     Scanner entrada = new Scanner(System.in);

     System.out.print("Informe seu peso: ");
     int peso = entrada.nextInt();

     System.out.print("Informe sua altura: ");
     double altura = entrada.nextDouble();

     entrada.nextLine();

     System.out.println("Informe seu nome: ");
     String nome = entrada.nextLine();
 
     double imc = peso / (altura * altura);
     System.out.printf("IMC de %s: %.2f%n:", nome, imc);
  }

}