package menuComposite;

public class Main {

    public static void main(String[] args) {

        Pasta meusDocumentos = new Pasta("Meus Documentos");

        meusDocumentos.inserirArquivo(new Pasta("Documentos"));
        meusDocumentos.inserirArquivo(new Pasta("Downloads"));
        meusDocumentos.inserirArquivo(new Pasta("imagens"));
        meusDocumentos.inserirArquivo(new Pasta("Musicas"));
        meusDocumentos.inserirArquivo(new Pasta("Videos"));

        System.out.println("Pasta: " + meusDocumentos.nome + " possui " + meusDocumentos.getNumArquivos() + " pastas e/ou arquivos");

        Pasta documento = (Pasta) meusDocumentos.getArquivo(0);
        documento.inserirArquivo(new Arquivo("documento.pdf"));
        documento.inserirArquivo(new Arquivo("documento.txt"));
        documento.inserirArquivo(new Arquivo("documento.docx"));
        documento.inserirArquivo(new Arquivo("documento.adt"));

        System.out.println("Pasta: " + documento.nome + " possui " + documento.getNumArquivos() + " pastas e/ou arquivos");

        Pasta musicas = (Pasta) meusDocumentos.getArquivo(3);
        musicas.inserirArquivo(new Pasta("Rock"));
        musicas.inserirArquivo(new Pasta("Jazz"));
        musicas.inserirArquivo(new Pasta("Samba"));

        System.out.println("Pasta: " + musicas.nome + " possui " + musicas.getNumArquivos() + " pastas e/ou arquivos");

        Pasta rock = (Pasta) musicas.getArquivo(1);
        rock.inserirArquivo(new Arquivo("Queen - Bohemian Rhapsody"));
        rock.inserirArquivo(new Arquivo("Metalica - The Unforgiven"));
        rock.inserirArquivo(new Arquivo("Aerosmith - Dream On"));
        rock.inserirArquivo(new Arquivo("Led Zeppelin - Stairway To Heaven"));


        System.out.println("Pasta: " + rock.nome + " possui " + rock.getNumArquivos() + " pastas e/ou arquivos");


    }
}
