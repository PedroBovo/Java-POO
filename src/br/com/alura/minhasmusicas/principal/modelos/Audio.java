package br.com.alura.minhasmusicas.principal.modelos;

public class Audio {
    private String titulo;
    private int anoDeLancamento;
    private int duração;
    private int curtidas;
    private int reproducao;
    private int classificacao;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getReproducao() {
        return reproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void curte (){
        this.curtidas ++;
    }
    public void reproduz(){
        this.reproducao ++;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
