package grupoEmail;

public class MembroEmail implements Observer{

    private String email = "";

    @Override
    public void update(Observable obs) {
        CaixaEntradaGrupo cx = (CaixaEntradaGrupo) obs;
        String msg = cx.getMensagem() ;
        System.out.println("Email enviado para: " + this.email + "; Conteúdo da mensagem: " + msg);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
