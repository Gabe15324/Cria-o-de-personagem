public class Mago extends Personagem {
    int poderMagia;

    public Mago() {
        
    }

    public Mago(String nome, int ataque, int defesa, int poderMagia) {
        super(nome, ataque, defesa);
        this.poderMagia = poderMagia;
    }

    public int getPoderMagia() {
        return poderMagia;
    }

    public void setPoderMagia(int poderMagia) {
        this.poderMagia = poderMagia;
    }

    @Override
    public String toString() {
        return super.toString() + "Poder de magia: " + poderMagia; 
    }

    

}
