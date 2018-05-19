class App {
    public static void main(String[] args) {
        UI ui = new UI();
        Lutador lutador1 = null;
        Lutador lutador2 = null;

        ui.printWelcome();
        boolean run = true;
        while (run) {
            ui.printMenu(); // @QUESTION o que esta linha faz?
            int option = ui.nextInt();
            switch(option) {
                case 1:
                    ui.showLutador(1, lutador1);
                    ui.showLutador(2, lutador2);
                    break;
                case 2:
                    lutador1 = ui.getLutador();
                    break;
                case 3:
                    lutador2 = ui.getLutador(); // @QUESTION o que esta linha faz?
                    break;
                case 4:
                case 5:
                    System.out.print("Quantas lutas? ");
                    int simulations = ui.nextInt();
                    Luta sim = new Luta(lutador1, lutador2);
                    for (int i = 1; i <= simulations; i++) {
                        System.out.println("Simulação " + i + ":");
                        if (option == 4) {
                            sim.run(true);
                        } else {
                            sim.run(false); // @QUESTION o que esta linha faz?
                        }
                    }
                    break;
                case 0:
                    run = false;
                    break;
            }
        }
    }
}