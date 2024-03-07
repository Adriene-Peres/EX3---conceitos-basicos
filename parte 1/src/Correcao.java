public class Correcao {
    private int quest;
    private String situacao;
    private int nTent;

    public Correcao(int q, String s, int t) {
        quest = q;
        situacao = s;
        nTent = t;
    }

    public int getQuest() {
        return quest;
    }

    public String getSituacao() {
        return situacao;
    }

    public int getNTent() {
        return nTent;
    }
}