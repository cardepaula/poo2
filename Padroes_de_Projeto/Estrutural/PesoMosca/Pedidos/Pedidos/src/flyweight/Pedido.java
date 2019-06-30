package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Item> itens = new ArrayList<>();

    public Pedido() {

    }

    public void addItemPedido(Item item){
        this.itens.add(item);
    }
}
