package menuComposite;

public class Main {

    public static void main(String[] args) {

        Pasta meusDocumentos = new Pasta("Meus Documentos");

        meusDocumentos.inserirItem(new Pasta("Documentos"));
        meusDocumentos.inserirItem(new Pasta("Downloads"));
        meusDocumentos.inserirItem(new Pasta("imagens"));
        meusDocumentos.inserirItem(new Pasta("Musicas"));
        meusDocumentos.inserirItem(new Pasta("Videos"));

        System.out.println("Pasta: " + meusDocumentos.nome + " possui " + meusDocumentos.getNumItem() + " pastas e/ou arquivos");

        Pasta documento = (Pasta) meusDocumentos.getItem(0);
        documento.inserirItem(new Arquivo("documento.pdf"));
        documento.inserirItem(new Arquivo("documento.txt"));
        documento.inserirItem(new Arquivo("documento.docx"));
        documento.inserirItem(new Arquivo("documento.adt"));

        System.out.println("Pasta: " + documento.nome + " possui " + documento.getNumItem() + " pastas e/ou arquivos");

        Pasta musicas = (Pasta) meusDocumentos.getItem(3);
        musicas.inserirItem(new Pasta("Rock"));
        musicas.inserirItem(new Pasta("Jazz"));
        musicas.inserirItem(new Pasta("Samba"));

        System.out.println("Pasta: " + musicas.nome + " possui " + musicas.getNumItem() + " pastas e/ou arquivos");

        Pasta rock = (Pasta) musicas.getItem(0);
        rock.inserirItem(new Arquivo("Queen - Bohemian Rhapsody"));
        rock.inserirItem(new Arquivo("Metalica - The Unforgiven"));
        rock.inserirItem(new Arquivo("Aerosmith - Dream On"));
        rock.inserirItem(new Arquivo("Led Zeppelin - Stairway To Heaven"));


        System.out.println("Pasta: " + rock.nome + " possui " + rock.getNumItem() + " pastas e/ou arquivos");


    }
}
