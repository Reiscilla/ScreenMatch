package br.com.alura.screenmatch.modelos;
import br.com.alura.sreenmatch.calculos.Classificavel;

public class filme extends Título implements Classificavel {
   private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
