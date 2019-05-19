package adaptercliente.model;

import lib.ClienteExterno;

public class AdapterClienteExterno extends Cliente{
	
	public AdapterClienteExterno() {
		//super();
	}
	ClienteExterno ce = new ClienteExterno();
	
	@Override
	public String getNomeCompleto() {
		this.nomeCompleto = ce.getNome();
		ce.getSobreNome();
        return nomeCompleto;
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getCelular() {
        return celular;
    }

    @Override
    public void setCelular(String celular) {
        this.celular = celular;
    }
}
