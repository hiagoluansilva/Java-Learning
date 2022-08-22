import java.util.Scanner;

class App{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 

        String nome;
        String endereco;
        double saldo;
       

        System.out.println("* Dados Correntista *");

        System.out.println("Informe seu nome:");
        nome = sc.nextLine();

        System.out.println("Informe seu endereco:");
        endereco = sc.nextLine();

        System.out.println("Informe o valor do deposito inicial:");
        saldo = sc.nextDouble();
        
        Correntista cc1 = new Correntista(nome, endereco);

        Conta c1 = new Conta(1, saldo, cc1);

        c1.extrato();
        sc.close();
    }
}

