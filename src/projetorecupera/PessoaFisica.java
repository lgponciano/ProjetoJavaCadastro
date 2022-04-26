
package projetorecupera;

import Classe_Pessoa.Pessoa;

public class PessoaFisica extends Pessoa{
    private int rg;
    private int cpf;
    private String tipo;

    //construtor vazio
    public PessoaFisica() {
    }

    public String getTipo() {
        return tipo;
    }

    public int getRg() {
        return rg;
    }

    public int getCpf() {
        return cpf;
    }
    
    public void setRg(int rg) {
        this.rg = rg;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
