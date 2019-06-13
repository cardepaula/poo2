
package leitura;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeCsv {
        
     public LinkedList<Cliente> leCsvClientes() throws IOException{         
      
        LinkedList<Cliente> clientes = new  LinkedList<Cliente>();             
        String current = new java.io.File( "." ).getCanonicalPath();        
        File inputFile = new File(current + "\\src\\arquivo.csv");                
        FileReader in = new FileReader(inputFile);
        int c;
        String input = "";
        boolean primeiraLinha = false;
        
        while(!primeiraLinha){
            c = in.read();
            if (c == (int)('\n')){
                primeiraLinha = true;
            }
        }
        
        while ((c = in.read()) != -1) { 
            if ((char)(c) != '\n'){
                  input += (char)(c);
            }else{
                Cliente cliente = preencheCliente(input);
                clientes.add(cliente);
                input = "";
            }
        }       
        in.close(); 
        
        //complete o codigo para ler o csv e criar as instancias de cliente.
        //rode o teste MainReadCsvTest.java para testar o seu código.
        
        return clientes;
     }
     
     private Cliente preencheCliente(String linha){
         
         String dados[] = linha.split(";");
         Cliente cliente = new Cliente();
         
         cliente.setId(dados[0]);
         cliente.setNome(dados[1]);
         cliente.setEmail(dados[2]);
         cliente.setTelefone(dados[4]);
         cliente.setTotalCompras(Double.parseDouble(dados[5]));
        
         return cliente;
     }
}
