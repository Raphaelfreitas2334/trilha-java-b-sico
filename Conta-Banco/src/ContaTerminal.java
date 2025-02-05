import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODo: Conhecer e importar a classe Scanner
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        //obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o seu Número !");
        int Numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência !");
        String Agencia = scanner.next();
        scanner.nextLine(); // Consome a quebra de linha

        System.out.println("Por favor, digite o seu Nome !");
        String NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu Saldo !");
        if(scanner.hasNextDouble()) {
            double Saldo = scanner.nextDouble();
            
            // Exibir a mensagem conta criada
            System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, " +
            "sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque");
        } else {
            System.out.println("Erro: Entrada inválida. Por favor, digite um número decimal.");
        }

        scanner.close();
    }
}
