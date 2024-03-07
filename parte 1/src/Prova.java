import java.util.Scanner;

public class Prova {
    private Questao[] q;
    private Correcao[] c;

    public Prova() {
        c = new Correcao[5];
        q = new Questao[5];
        for (int i = 0; i < 5; i++) {
            q[i] = new Questao();
        }
    }

    public void aplicar() {
        Scanner ent = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Questão %d: %s%nResposta: ", q[i].getIdQuestao(), q[i].getEnunciado());

            int resp = ent.nextInt();
            int tentativas = 1;

            if (q[i].corrigir(resp)) {
                System.out.println("Muito bem, você acertou!");
                System.out.println("Você tentou " + tentativas + " vez e acertou a questão.\n");
                c[i] = new Correcao(q[i].getIdQuestao(), "acertou", tentativas);
            } else {
                System.out.println("Infelizmente você errou!");
                System.out.println("Você ganhou mais uma chance! Digite outra resposta para a questão: ");
                resp = ent.nextInt();
                tentativas++;

                if (q[i].corrigir(resp)) {
                    System.out.println("Muito bem, você acertou!");
                    System.out.println("Você tentou " + tentativas + " vezes e acertou a questão.\n");
                    c[i] = new Correcao(q[i].getIdQuestao(), "acertou", tentativas);
                } else {
                    System.out.println("Infelizmente você errou!");
                    System.out.println("Você tentou " + tentativas + " vezes e errou a questão.\n");
                    c[i] = new Correcao(q[i].getIdQuestao(), "errou", tentativas);
                }
            }
        }
    }

    public void getRelatorio() {
        System.out.printf("%-9s %-10s %-22s\n", "Questão", "Situação", "Número de tentativas");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-9d %-10s %-22d\n", c[i].getQuest(), c[i].getSituacao(), c[i].getNTent());
        }
    }
}