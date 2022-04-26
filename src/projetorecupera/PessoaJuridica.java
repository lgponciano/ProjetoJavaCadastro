
package projetorecupera;

//PessoaJuridica classe filha da Pessoa

import Classe_Pessoa.Pessoa;

public class PessoaJuridica extends Pessoa{
    private int cnpj;
    private String tipo;

    public PessoaJuridica(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
