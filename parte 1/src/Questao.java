import java.util.Random;

public class Questao {
    private String enunciado;
    private int gabarito;
    private int idQuestao;
    private static int totalQuestoes = 0;

    // elaborar questão
    public Questao() {
        Random n = new Random();
        int num1 = n.nextInt(10); // retorna um valor aleatório ente 0 e 9
        int num2 = n.nextInt(10);

        totalQuestoes++;
        idQuestao = totalQuestoes;

        enunciado = "Quanto é " + num1 + "*" + num2 + "?";
        gabarito = num1 * num2;

    }

    public String getEnunciado() {
        return enunciado;
    }

    public int getIdQuestao() {
        return idQuestao;
    }

    public boolean corrigir(int resp) {
        return gabarito == resp;
    }
}
