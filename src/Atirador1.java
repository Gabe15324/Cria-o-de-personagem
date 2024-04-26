public class Atirador1 extends Personagem1 {
    public Atirador1(String nome, int ataque, int defesa) {
        super(nome, ataque, defesa);
    }

    @Override
    public String getTipoPersonagem() {
        return "Atirador";
    }
}
