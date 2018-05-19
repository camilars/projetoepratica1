class Lutador {
    String nome;
    int maxHp;
    int hp;
    int punch;
    int kick;

    public Lutador(String nome, int hp, int punch, int kick) {
        this.nome = nome;
        this.maxHp = hp;
        this.hp = hp;
        this.punch = punch;
        this.kick = kick;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public String getNome() { return this.nome; }
    public int getHp() { return this.hp; }
    public int getPunch() { return this.punch; }
    public int getKick() { return this.kick; }

    public String getNomeAndHp() {
        return "[" + this.nome + "(" + this.hp + " / " + this.maxHp + ")" + "]";
    }

    public void resetHp() {
        this.hp = this.maxHp;
    }



    public void punch(Lutador l) {
        l.hp -= this.punch;
    }

    public void kick(Lutador l) {
        l.hp -= this.kick;
    }
}
