
package contacorrente;
public class ContaCorrente {
    
    private int numeroConta;
    private String titular;
    private double saldo;
    
   
    public ContaCorrente( int n, String t, double s ) 
    {
        setTitular (t);
        if (n < 0)
            System.out.println("\nNumero de conta invalido");
        else
            numeroConta = n;
        
        if (s < 0)
            System.out.println("\nSaldo inicial invalido!");
        else
            saldo = s;        
    }
}

public void saque(double vlrSaque)
{
if (vlrSaque < 0)
    System.out.println("\nValor de saque invalido!");
else
    if (vlrSaque > saldo)
        System.out.println("\nRecurso insuficiente!");
    else
        saldo = saldo - vlrSaque;
}

public void deposito (double vlrDeposito)
{
    if (vlrDeposito < 0)
        System.out.printf("\nValor de deposito invalido!");
    else
        saldo = saldo + vlrDeposito;
}

public void verDados()
{
    System.out.println("\n====================================");
    System.out.println("\nConta  : %07d", getConta());
    System.out.println("\nTitular: %s," getTitular());
    System.out.println("\nSaldo  : R$ %.2f", getSaldo());
    System.out.println("\n====================================");
}

public void setTitular (String s)
{
    titular = s;
}

public String getTitular ()
{
    return titular;
}

public int getConta ()
{
    return numeroConta;
}

public double getSaldo ()
{
    return saldo;
}

