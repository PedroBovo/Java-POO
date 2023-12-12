package br.com.alura.minhasmusicas.principal.modelos;

public class Musica extends Audio {
    private String cantor;
    private String album;
    private String genero;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (this.getReproducao() > 9){
            return 10;
        }else{
           return 5;
        }
    }
}
