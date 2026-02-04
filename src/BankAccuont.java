


public class BankAccuont {

   private final String id;

   private int saldo;

   public BankAccuont(String id, int saldo)
   {
       this.id = id;
       this.saldo = saldo;
   }

   public String getId()
   {
       return id;
   }

   public int getSaldo()
   {
       return saldo;
   }

   public void consignar(int valorAConsignar)
    {
        if (valorAConsignar <= 0)
        {
             throw new IllegalArgumentException("the inserted number is not valid");
        }

        this.saldo += valorAConsignar;
    }

    public void retirar(int valorARetirar)
    {
        if(valorARetirar <= 0)
        {
            throw new IllegalArgumentException("the inserted number is not valid");
        }

        if (valorARetirar > saldo)
        {
            throw new IllegalArgumentException("the value inserted is bigger than the available balance");
        }

        this.saldo -= valorARetirar;
    }

}