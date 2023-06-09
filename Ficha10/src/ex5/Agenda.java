package ex5;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> listaPessoa;
    private Pessoa pessoa;

    public Agenda(ArrayList<Pessoa> listaPessoa) {
        this.listaPessoa = listaPessoa;
    }

    public void addPessoas(Pessoa pessoaNova){
        this.listaPessoa.add(pessoaNova);
    }

    public void exibirDetalhes(){

        for (int i = 0; i < listaPessoa.size(); i++) {
            System.out.println("Nome: " + listaPessoa.get(i).getNome());
            System.out.println("Idade: " + listaPessoa.get(i).getIdade());
            System.out.println("Email: " + listaPessoa.get(i).getEmail());
            System.out.println("Telemóvel: " + listaPessoa.get(i).getTelemovel());
            System.out.println();
        }
    }
}
