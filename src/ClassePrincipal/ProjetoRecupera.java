
package ClassePrincipal;

import InterfaceGrafica.Menu;
import projetorecupera.PessoaJuridica;


public class ProjetoRecupera {

    public static void main(String[] args) {
        //Enviando dados para classe Pessoa(Nome, CEP)
        //Pessoa pessoa = new Pessoa("Joao");
        //PessoaJuridica pessoaJu = new PessoaJuridica(1212);
        
        //Puxando nome da classe Pessoa e inserindo na nova variavel novoNome
        //String novoNome = pessoa.getNome();
        //Imprimindo nome
        //System.out.println("Novo nome: " + novoNome);
        
        //Chamando tela para inicio projeto
        Menu menu = new Menu();
        menu.setVisible(true);
    }
    
}
