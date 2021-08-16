package Pastaatividades9.at5;

public class Alunos {
    private float media;
    private boolean aprovado;

    public Alunos(float media) {
        if(media > 10 || media < 0){
            System.out.println("Digite um valor válido para as notas (0 a 10)!");
        }
        else {
            this.media = media;
            aprovacao(media);
        }
    }

    public void aprovacao(float media){
        if(media >= 7){
            this.aprovado = true;
        }
        else {
            this.aprovado = false;
        }
    }

    public float getMedia() {
        return media;
    }


    public boolean isAprovado() {
        return aprovado;
    }
}
