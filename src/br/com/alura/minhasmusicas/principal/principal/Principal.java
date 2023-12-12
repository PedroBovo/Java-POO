package br.com.alura.minhasmusicas.principal.principal;

import br.com.alura.minhasmusicas.principal.modelos.Classificacao;
import br.com.alura.minhasmusicas.principal.modelos.Musica;
import br.com.alura.minhasmusicas.principal.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Racionais");
        minhaMusica.setCantor("Racionais");
        minhaMusica.setGenero("Rap");
        minhaMusica.setTitulo("Um Homem na estrada");
        minhaMusica.setAnoDeLancamento(1988);
        System.out.println(minhaMusica.getTitulo());
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.reproduz();

        }
        System.out.println(minhaMusica.getReproducao());
        System.out.println(minhaMusica.getClassificacao());

        Podcast bovoCast = new Podcast();
        bovoCast.setNome("BovoCast");
        bovoCast.setHost("Pedro Bovo");
        for (int i = 0; i < 50; i++) {
            bovoCast.curte();
        }
        for (int i = 0; i < 50; i++) {
         bovoCast.reproduz();
        }

        Classificacao classificacao = new Classificacao();
        classificacao.avalia(minhaMusica);
        classificacao.avalia(bovoCast);

    }
}
