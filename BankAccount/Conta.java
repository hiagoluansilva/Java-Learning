public class Conta {
    private int numero;
    private double saldo;
    private Correntista c;

    public Conta(){}
    
    /*Sobrecarga*/
    public Conta(int numero, double saldo, Correntista c)
    {
        this.numero = numero;
        this.saldo = saldo;
        this.c = c;
    }
    public int getNumero() 
    {
          return numero;
    }
    public void setNumero(int numero) 
    {
          this.numero = numero;
    }
    public double getSaldo() 
    {
          return saldo;
    }
    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }
    public void setAdicionaSaldo(double saldo)
    {
        this.saldo += saldo;
    }

    public void extrato()
    {
        System.out.println("* Extrato *");
        System.out.println("Titular: " + c.getNome());
        System.out.println("Endereco: " + c.getEndereco());
        System.out.println("Numero Conta: " + this.getNumero());
        System.out.println("Saldo: " + this.getSaldo());
    }
}