
package projetorecupera;

public class Contato {
    private String email;
    private int telefone;
    private int ddd;

    //Construtor vazio
    public Contato() {
    }

    //Criação gets
    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getDdd() {
        return ddd;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }
    
    
    
}
