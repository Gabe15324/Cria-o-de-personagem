public class Curador1 extends Personagem1 {
    public Curador1(String nome, int ataque, int defesa) {
        super(nome, ataque, defesa);
    }

    @Override
    public String getTipoPersonagem() {
        return "Curador";
    }
}