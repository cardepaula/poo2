import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        double valorASerSacado = 0.0;

        SaqueHandler cedula100 = new Cedula100();
        SaqueHandler cedula50 = new Cedula50();
        SaqueHandler cedula20 = new Cedula20();
        SaqueHandler cedula10 = new Cedula10();
        SaqueHandler cedula5 = new Cedula5();
        SaqueHandler cedula2 = new Cedula2();

        cedula100.setNextHandler(cedula50);
        cedula50.setNextHandler(cedula20);
        cedula20.setNextHandler(cedula10);
        cedula10.setNextHandler(cedula5);
        cedula5.setNextHandler(cedula2);

        System.out.println("Digite o valor a ser sacado:");
        Scanner leitor = new Scanner(System.in);

        valorASerSacado = leitor.nextDouble();

        cedula100.processHandler(valorASerSacado);


    }
}
