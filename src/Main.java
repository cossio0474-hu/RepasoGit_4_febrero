//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        BankAccuont cuenta1 = new BankAccuont("1", 100);
        System.out.println( "The user id is: " + cuenta1.getId());

        System.out.println( "The user balance is: " + cuenta1.getSaldo());

        cuenta1.retirar(100);

        System.out.println("The balance after withdraw is: " + cuenta1.getSaldo());

        cuenta1.consignar(200);

        System.out.println("The balance after record is: " + cuenta1.getSaldo());




     }
}