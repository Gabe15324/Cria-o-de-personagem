public class Personagem {
    String nome;
    int ataque;
    int defesa;
   
    
   
   
   
    public Personagem() {
    }

    public Personagem(String nome, int ataque, int defesa) {
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

    @Override
    public String toString(){
        return "Nome: " + nome + "\nAtaque: " + ataque + "\nDefesa: " + defesa;
    
    }
}
