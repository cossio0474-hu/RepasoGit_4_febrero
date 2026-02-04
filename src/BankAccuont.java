import java.awt.image.BaseMultiResolutionImage;

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

   public void consignar(int valorAConstignar) throws IllegalAccessException {
       if (valorAConstignar <= 0)
       {
           throw new IllegalAccessException("EL valor no es valido");
       }
       this.saldo += valorAConstignar;
   }

public void retirar(int valorARetirar) throws IllegalAccessException {
if (valorARetirar <= 0)
{
    throw new IllegalAccessException("el valor no es valido");
}

if (valorARetirar > saldo)
{
    throw new IllegalAccessException("el valor no es valdio");
}

this.saldo -= valorARetirar;
}

}