import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
        
    public static void main(String[] args) {
            //os argumentos começam com indice 0
            Scanner scaner = new Scanner(System.in);
            Locale.setDefault(Locale.US);

            System.out.println("informe o seu primeiro nome: ");
            String nome = scaner.next();
            System.out.println("informe o seu segundo nome: ");
            String sobrenome = scaner.next();
            System.out.println("informe a sua idade: ");
            int idade = scaner.nextInt(); 
            System.out.println("informe o seu tamanho em CM: ");
            double altura = scaner.nextDouble();
    
            System.out.println("Ola, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");


            scaner.close();
        }
}

