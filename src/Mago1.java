public class Mago1 extends Personagem1 {
    public Mago1(String nome, int ataque, int defesa) {
        super(nome, ataque, defesa);
    }

    // Sobrescrevendo o método para retornar o tipo do personagem
    @Override
    public String getTipoPersonagem() {
        return "Mago";
    }
}
