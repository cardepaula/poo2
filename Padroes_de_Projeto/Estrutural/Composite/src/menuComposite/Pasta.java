package menuComposite;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends ItemMenu {
    private List<ItemMenu> listaDeItemMenu = new ArrayList<>();

    public Pasta(String nome) {
        super(nome);
    }

    public void inserirItem(ItemMenu item){
        this.listaDeItemMenu.add(item);
    }

    public void removerItem(ItemMenu item) {
        this.listaDeItemMenu.remove(item);
    }

    public ItemMenu getItem(int index) {
        return this.listaDeItemMenu.get(index);
    }

    public int getNumItem() {
        return this.listaDeItemMenu.size();
    }
}
