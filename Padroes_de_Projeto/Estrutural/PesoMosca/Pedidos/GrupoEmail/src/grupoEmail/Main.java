package grupoEmail;

public class Main {

    public static void main(String[] args) {

        CaixaEntradaGrupo caixa = new CaixaEntradaGrupo();

        MembroEmail mebroEmail1 = new MembroEmail();
        MembroEmail mebroEmail2 = new MembroEmail();

        MembroWhatsApp mebroWApp1 = new MembroWhatsApp();
        MembroWhatsApp mebroWApp2 = new MembroWhatsApp();
        MembroWhatsApp mebroWApp3 = new MembroWhatsApp();

        mebroEmail1.setEmail("a@gmail.com");
        mebroEmail2.setEmail("b@gmail.com");
        mebroWApp1.setNumero("99999-1111");
        mebroWApp2.setNumero("99999-2222");
        mebroWApp3.setNumero("99999-3333");

        caixa.addObserver(mebroEmail1);
        caixa.addObserver(mebroEmail2);
        caixa.addObserver(mebroWApp1);
        caixa.addObserver(mebroWApp2);
        caixa.addObserver(mebroWApp3);

        caixa.setNovaMensagem("AAAAAAAA");
        caixa.setNovaMensagem("BBBBBBBB");
        caixa.setNovaMensagem("CCCCCCCC");

    }
}
