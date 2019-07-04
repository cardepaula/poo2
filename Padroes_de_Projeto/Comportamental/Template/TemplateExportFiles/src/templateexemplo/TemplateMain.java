
package templateexemplo;


public class TemplateMain {

   
    public static void main(String[] args) {
        String texto = "linha 1\n" 
                + "linha2\n"
                + "fim\n";                                
      ExportFiles exportHtml = new ExportHtml();
      ExportFiles exportWord = new ExportWord();

      exportHtml.export(texto);
      exportWord.export(texto);
    }
    
}
