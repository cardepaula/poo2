public class Cedula50 extends AbstractSaqueHandler {

    public static final int CINQUENTA=50;


    @Override
    protected double getValorCedula() {
        return 50.00;
    }

    @Override
    protected double handleSaque(double valor) {
        double valorRestante = valor;

        int quantidadeCedulas = 0;

        while(valorRestante >= this.getValorCedula()) {
            valorRestante = valorRestante - this.getValorCedula();
            quantidadeCedulas++;
        }

        if (quantidadeCedulas > 0){
            System.out.println(quantidadeCedulas + " cédula(s) de R$ "+ this.getValorCedula() +" sacada(s)");
        }


        return valorRestante;
    }


}
