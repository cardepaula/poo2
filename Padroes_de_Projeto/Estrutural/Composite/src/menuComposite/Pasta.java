package menuComposite;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends Arquivos {
    private List<Arquivos> listaDeArquivos = new ArrayList<>();

    public Pasta(String nome) {
        super(nome);
    }

    public void inserirArquivo(Arquivos novoArquivo){
        this.listaDeArquivos.add(novoArquivo);
    }

    public void removerArquivo(Arquivos arquivo) {
        this.listaDeArquivos.remove(arquivo);
    }

    public Arquivos getArquivo(int index) {
        return this.listaDeArquivos.get(index);
    }

    public int getNumArquivos() {
        return this.listaDeArquivos.size();
    }
}
