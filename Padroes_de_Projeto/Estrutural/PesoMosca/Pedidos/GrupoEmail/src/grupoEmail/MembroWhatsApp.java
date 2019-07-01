package grupoEmail;

public class MembroWhatsApp implements Observer{

    private String numero = "";

    @Override
    public void update(Observable obs) {
        CaixaEntradaGrupo cx = (CaixaEntradaGrupo) obs;
        String msg = cx.getMensagem() ;
        System.out.println("Mensagem enviado para: " + this.numero + "; Conteúdo da mensagem: " + msg);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}