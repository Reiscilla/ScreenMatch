import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Série;
import br.com.alura.screenmatch.modelos.filme;
import br.com.alura.sreenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.sreenmatch.calculos.FiltroDeRecomendacao;

public class Principal {
    public static void main(String[] args) {
        filme meuFilme = new filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        // meuFilme.somaDasAvaliacoes = 10;
        // meuFilme.totalDeAvaliacoes = 1;
        // System.out.println(meuFilme.pegaMedia());

        Série lost = new Série();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.exibeFichaTecnica();
        lost.setTemporadas(6);
        lost.setEpisodiosPorTemporada(18);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());

        filme outroFilme = new filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2009);
        outroFilme.setDuracaoEmMinutos(162);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());


        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}