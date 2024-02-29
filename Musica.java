package org.example.audio;

public class Musica extends Audio implements Funcionamentos{
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void classificacao() {
        if (getTotalCurtidas() >= 1000) {
            System.out.println("5 estrelas");
        } else if (getTotalCurtidas() >= 750 && getTotalCurtidas() < 1000) {
            System.out.println("4 estrelas");
        } else if (getTotalCurtidas() >= 450 && getTotalCurtidas() < 750) {
            System.out.println("3 estrelas");
        } else if (getTotalCurtidas() >= 150 && getTotalCurtidas() < 450) {
            System.out.println("2 estrelas");
        } else if (getTotalCurtidas() >= 1 && getTotalCurtidas() < 150) {
            System.out.println("1 estrela");
        }

    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Album: " + getAlbum());
        System.out.println("Genero: " + getGenero());
        System.out.println("Total curtidas: " + getTotalCurtidas());
        System.out.println("Total reproducoes: " + getTotalReproducoes());
    }

    @Override
    public void minhasPreferidas(){
        if(getTotalReproducoes() >= 2000 ) {
            System.out.println(getTitulo()+ " é considerado sucesso absoluto e preferido por todos!");
        } else {
            System.out.println(getTitulo() + "também é um dos que todo mundo está curtindo");
        }
    }
}
