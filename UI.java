import java.util.Scanner;

class UI {
    Scanner scan;

    public UI() {
        this.scan = new Scanner(System.in);
    }



    public int nextInt() {
        int i = this.scan.nextInt();
        this.scan.nextLine();
        return i;
    }

    public String nextString() {
        return this.scan.nextLine();
    }



    public void printWelcome() {
        System.out.println("Simulação de batalha!");
        System.out.println("Escolha seus lutadores, digite a quantidade de batalhas e veja os resultados =)");
        System.out.println("--");
        System.out.println("Instruções:");
        System.out.println("  Esolha dois lutadores");
        System.out.println("  Cada lutador deve ter:");
        System.out.println("    -nome;");
        System.out.println("    -pontos de vida;");
        System.out.println("    -força total;");
        System.out.println("    -força do soco (precisa ser menor que a força total);");
        System.out.println();
        System.out.println("  A força do chute é a força total menos a força do soco");
        System.out.println("  Simule lutas e veja quem é o mais forte =)");
        System.out.println("--");
        System.out.println();
    }

    public void printMenu() {
        System.out.println();
        System.out.println("Digite a opção desejada");
        System.out.println("(1) Ver lutadores");
        System.out.println("(2) Adicionar / Trocar lutador 1");
        System.out.println("(3) Adicionar / Trocar lutador 2");
        System.out.println("(4) Simular lutas (com log)");
        System.out.println("(5) Simular lutas (sem log)");
        System.out.println("--");
        System.out.println("(0) Sair");
        System.out.println();
    }

    public void showLutador(int index, Lutador lutador) {
        System.out.println("Lutador " + index + ":");
        if (lutador == null) {
            System.out.println("  null");
            return;
        }
        System.out.println("  Nome:           " + lutador.getNome());
        System.out.println("  Pontos de vida: " + lutador.getHp());
        System.out.println("  Força do soco:  " + lutador.getPunch()); // @QUESTION o que esta linha faz?
        System.out.println("  Força do chute: " + lutador.getKick());
    }



    public Lutador getLutador() {
        System.out.println("Digite os dados do lutador:");

        System.out.print("nome (String): ");
        String name = this.nextString();

        System.out.print("pontos de vida (int): ");
        int hp = this.nextInt();

        System.out.print("força (int): ");
        int str = this.nextInt();

        int punchStr = str + 1;
        while (punchStr > str) {
            System.out.print("força do soco (int): ");
            punchStr = this.nextInt();
        }


        int kickStr = str - punchStr;
        Lutador l = new Lutador(name, hp, punchStr, kickStr); // @QUESTION o que esta linha faz?
        return l;
    }
}