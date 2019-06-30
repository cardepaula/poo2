package adaptercliente.model;

import lib.ClienteExterno;

public class AdapterClienteExterno extends Cliente{
    private ClienteExterno clienteExterno;
	
    public AdapterClienteExterno(ClienteExterno ce) {
            this.clienteExterno = ce;
    }

    @Override
    public String getNomeCompleto() {
        return this.clienteExterno.getNome() + " " + this.clienteExterno.getSobreNome();
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        String[] nomeArray = nomeCompleto.split("\\s");
        String sobrenome;

        this.clienteExterno.setNome(nomeArray[0]);
        sobrenome = nomeArray[1];
        for(int i=2; i < nomeArray.length; i++){
            sobrenome = sobrenome + " " + nomeArray[i];
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
        this.clienteExterno.setEmail(email);
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
