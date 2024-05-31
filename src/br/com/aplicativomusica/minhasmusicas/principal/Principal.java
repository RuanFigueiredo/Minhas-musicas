package br.com.aplicativomusica.minhasmusicas.principal;

import br.com.aplicativomusica.minhasmusicas.modelos.Musica;
import br.com.aplicativomusica.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("kiss");

        for (int i = 0; i < 1000 ; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("NerdCast");
        meuPodcast.setApresentador("Paulo silveira");

        for (int i = 0; i < 5000; i++) {
          meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }
    }
}
