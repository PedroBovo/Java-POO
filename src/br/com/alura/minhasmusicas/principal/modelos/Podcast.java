package br.com.alura.minhasmusicas.principal.modelos;

public class Podcast extends Audio{
    private String nome;
    private String host;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public int getClassificacao() {
        if (this.getCurtidas() > 10){
            return 10;
        }else {
            return 5;
        }
    }
}
