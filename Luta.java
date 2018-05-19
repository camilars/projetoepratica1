import java.util.Random;


class Luta {
    Lutador lutador1, lutador2;

    public Luta(Lutador l1, Lutador l2) {
        this.lutador1 = l1;
        this.lutador2 = l2;
    }

    public void run(boolean log) {
        this.lutador1.resetHp();
        this.lutador2.resetHp();

        Random random = new Random();
        while (this.lutador1.isAlive() && this.lutador2.isAlive()) {
            String action1 = "";
            String action2 = "";
            if (random.nextInt() % 2 == 0) {
                this.lutador1.punch(this.lutador2);
                action1 = "P";
            } else {
                this.lutador1.kick(this.lutador2);
                action1 = "K";
            }

            if (random.nextInt() % 2 == 0) {
                this.lutador2.punch(this.lutador1);
                action2 = "P";
            } else {
                action2 = "K";
                this.lutador2.kick(this.lutador1);
            }

            // @QUESTION o que o bloco de código abaixo faz?
            if (log) {
                System.out.println("  " + this.lutador1.getNomeAndHp() + " " + action1 + "-> " + this.lutador2.getNomeAndHp());
                System.out.println("  " + this.lutador1.getNomeAndHp() + " <-" + action2 + " " + this.lutador2.getNomeAndHp());
            }
        }

        if (this.lutador1.isAlive() && !this.lutador2.isAlive()) {
            System.out.println("  " + this.lutador1.getNomeAndHp() + " venceu!");
        } else if (this.lutador2.isAlive() && !this.lutador1.isAlive()) {
            System.out.println("  " + this.lutador2.getNomeAndHp() + " venceu!");
        } else {
            System.out.println("Empate!!");
        }
    }
}
