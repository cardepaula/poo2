package flyweight;

public class StatusItem {

    enum Estado {
        CARRINHO,
        FECHADO,
        PAGO,
        ENVIADO,
        ENTREGUE
    }

    private Estado estado;
    private boolean podeCancelar = false;
    private boolean compraConcluida = false;

    public StatusItem(Estado estado, Boolean podeCancelar, Boolean compraConcluida) {
        this.estado = estado;
        this.podeCancelar = podeCancelar;
        this.compraConcluida = compraConcluida;


    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean isPodeCancelar() {
        return podeCancelar;
    }

    public void setPodeCancelar(boolean podeCancelar) {
        this.podeCancelar = podeCancelar;
    }

    public boolean isCompraConcluida() {
        return compraConcluida;
    }

    public void setCompraConcluida(boolean compraConcluida) {
        this.compraConcluida = compraConcluida;
    }
}
