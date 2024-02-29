package org.example.audio;

public class Podcast extends Audio implements Funcionamentos{
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void classificacao() {
        if(getTotalCurtidas() > 0 && getTotalCurtidas() < 500){
            System.out.println("Vale a pena ouvir!");
        } else if (getTotalCurtidas() >= 500 && getTotalCurtidas() < 750) {
            System.out.println("Top 10 must listen!");
        } else if (getTotalCurtidas() >= 750 ) {
            System.out.println("Must listen NOW!");
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Host: "+getHost());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Total curtidas: "+getTotalCurtidas());
        System.out.println("Total reproducoes: "+getTotalReproducoes());

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
