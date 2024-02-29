package org.example.audio;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Speak Now");
        musica.setArtista("Taylor Swift");
        musica.setAlbum("Speak Now");
        musica.setGenero("Pop");
        for (int i = 0; i < 2100; i++) {
           musica.reproduzir();
        }

        for (int i = 0; i < 150; i++) {
            musica.curtir();
        }
        musica.exibirDetalhes();
        musica.classificacao();
        musica.minhasPreferidas();

        Podcast podcast = new Podcast();
        podcast.setTitulo("My Life");
        podcast.setHost("Eu");
        podcast.setDescricao("Sobre minha vida diaria");
        for (int i = 0; i < 2005; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 765; i++) {
            podcast.curtir();
        }
        podcast.exibirDetalhes();
        podcast.classificacao();
        podcast.minhasPreferidas();

        List<Funcionamentos> list = new ArrayList<>();
        list.add(musica);
        list.add(podcast);

        list.forEach(funcionamentos -> funcionamentos.exibirDetalhes());
    }
}
