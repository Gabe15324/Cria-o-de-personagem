public class Atirador extends Personagem {

    int poderAtilharia;

    public Atirador() {
       
    }

    public Atirador(String nome, int ataque, int defesa, int poderAtilharia) {
        super(nome, ataque, defesa);
        this.poderAtilharia = poderAtilharia;
    }

    public int getPoderAtilharia() {
        return poderAtilharia;
    }

    public void setPoderAtilharia(int poderAtilharia) {
        this.poderAtilharia = poderAtilharia;
    }

    
    @Override
    public String toString() {

        return super.toString() +
                "\nPoder de artilharia: " + poderAtilharia;
    }

    
}
