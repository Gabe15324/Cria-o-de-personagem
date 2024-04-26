public abstract class Personagem1 {
    private String nome;
    private int ataque;
    private int defesa;

    public Personagem1(String nome, int ataque, int defesa) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    // Método abstrato para obter o tipo do personagem
    public abstract String getTipoPersonagem();

    @Override
    public String toString() {
        return "Nome: " + nome + ", Ataque: " + ataque + ", Defesa: " + defesa + ", Personagem: " + getTipoPersonagem();
    }
}
