public interface SaqueHandler {

    void setNextHandler(SaqueHandler saqueHandler);
    void processHandler(double valor);

}
