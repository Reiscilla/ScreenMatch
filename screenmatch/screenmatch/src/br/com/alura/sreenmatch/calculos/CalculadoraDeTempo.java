package br.com.alura.sreenmatch.calculos;
import br.com.alura.screenmatch.modelos.Título;


public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }


   // public void inclui(filme f){
   //     this.tempoTotal += f.getDuracaoEmMinutos();
   // }

   //  public void inclui(Série s){
   //     this.tempoTotal += s.getDuracaoEmMinutos();
   // }

    public void inclui(Título título){
        System.out.println("Adicionando duração em minutos de: " + título);
        this.tempoTotal += título.getDuracaoEmMinutos();
    }

}
