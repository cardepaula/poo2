package grupoEmail;

public class CaixaEntradaGrupo extends Observable {

    private String mensagem;

    public CaixaEntradaGrupo() {
        this.mensagem = "";
    }

    public void setNovaMensagem(String mensagem){
        this.mensagem = mensagem;

        notifyObserver();
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
