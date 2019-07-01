import java.util.List;

public abstract class AbstractSaqueHandler implements SaqueHandler{

    private SaqueHandler saqueHandler;

    @Override
    public void setNextHandler(SaqueHandler handler) {
        this.saqueHandler = handler;
    }

    @Override
    public void processHandler(double valor) {

        if (valor >= getValorCedula() ) {
            valor = this.handleSaque(valor);
        }
        if (saqueHandler != null && valor >= 2){
            this.saqueHandler.processHandler(valor);
        }
    }

    protected abstract double getValorCedula();
    protected abstract double handleSaque(double valor);
}
