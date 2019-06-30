package flyweight;

import java.util.HashMap;

public class FlyweightStatusItem {

    private static HashMap<StatusItem.Estado,StatusItem> cacheStatusItem = new HashMap<>();

    public void addStatusItem(StatusItem statusItem) {
        cacheStatusItem.put(statusItem.getEstado(), statusItem);
    }

    public FlyweightStatusItem() {
        StatusItem statusItemCarrinho = new StatusItem(StatusItem.Estado.CARRINHO , true, false);
        this.cacheStatusItem.put(statusItemCarrinho.getEstado(), statusItemCarrinho);

        StatusItem statusItemFechado = new StatusItem(StatusItem.Estado.FECHADO, true, false);
        this.cacheStatusItem.put(statusItemFechado.getEstado(), statusItemFechado);

        StatusItem statusItemPago = new StatusItem(StatusItem.Estado.PAGO, true, true);
        this.cacheStatusItem.put(statusItemPago.getEstado(), statusItemPago);

        StatusItem statusItemEnviado = new StatusItem(StatusItem.Estado.ENVIADO, false, true);
        this.cacheStatusItem.put(statusItemEnviado.getEstado(), statusItemEnviado);

        StatusItem statusItemEntregue = new StatusItem(StatusItem.Estado.ENTREGUE, false, true);
        this.cacheStatusItem.put(statusItemEntregue.getEstado(), statusItemEntregue);

    }


    public static StatusItem get(StatusItem.Estado estado){
        return (StatusItem)cacheStatusItem.get(estado);
    }
}
