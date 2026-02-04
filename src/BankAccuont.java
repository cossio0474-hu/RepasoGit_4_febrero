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

   public void saetId(id)
   {
       this.id = id;
   }



}
