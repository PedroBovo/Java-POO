package br.com.alura.minhasmusicas.principal.modelos;
public class Classificacao  {

    public void avalia(Audio audio){
        if(audio.getClassificacao() > 8){
            System.out.println("Esse sua escolha esta entre as mais escutadas pelos ouvintes." );
        }else if (audio.getClassificacao() > 5){
            System.out.println("Essa sua escolha esta um pouco ultrapassada mas continua sendo muito boa");
        }else {
            System.out.println("Tem coisas melhores");
        }
    }
}
