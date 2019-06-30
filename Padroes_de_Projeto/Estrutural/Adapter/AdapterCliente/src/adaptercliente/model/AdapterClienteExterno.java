package adaptercliente.model;

import lib.ClienteExterno;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class AdapterClienteExterno extends Cliente{
    private ClienteExterno clienteExterno;
	
    public AdapterClienteExterno(ClienteExterno ce) {
            this.clienteExterno = ce
    }

    @Override
    public String getNomeCompleto() {
        return this.clienteExterno.getNome() + " " + this.clienteExterno.getSobreNome();
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        List<String> nomeList = new ArrayList<String>(Arrays.asList(nomeCompleto.split(" ")));;
        String sobrenome;

        this.clienteExterno.setNome(nomeList[0]);
        this.sobrenome = sobrenome + nomeList[1];
        for(int i=2; i < nomeList.size(); i++){
            this.sobrenome = sobrenome + " " + nomeList[i];
        }
        this.clienteExterno.setSobreNome(sobrenome);
        
    }

    @Override
    public String getTelefone() {
        return this.clienteExterno.getDddTelefone()+" "+this.clienteExterno.getTelefone();
    }

    @Override
    public void setTelefone(String telefone) {
        String telArray[] =  new String[2];
        telArray = telefone.split(" ");

        this.clienteExterno.setDddTelefone(telArray[0]);
        this.clienteExterno.setTelefone(telArray[1]);
    }

    @Override
    public String getEmail() {
        return this.clienteExterno.getEmail();
    }

    @Override
    public void setEmail(String email) {
        this.clienteExterno.setEmail(email)
    }

    @Override
    public String getCelular() {
        return this.clienteExterno.getDddCelular()+" "+this.clienteExterno.getCelular();
    }

    @Override
    public void setCelular(String celular) {
        String celularArray[] =  new String[2];
        celularArray = celular.split(" ");

        this.clienteExterno.setDddCelular(celularArray[0]);
        this.clienteExterno.setCelular(celularArray[1]);
    }
}
