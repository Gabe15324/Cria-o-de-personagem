 public class Curador extends Personagem {
      
    int poderCura;
        
    public Curador() {
            
    }
        
    public Curador(String nome, int ataque, int defesa, int poderCura) {
        super(nome, ataque, defesa);
        this.poderCura = poderCura;
    }

        
    public int getPoderCura() {
        return poderCura;
    }

    public void setPoderCura(int poderCura) {
        this.poderCura = poderCura;
    }
        
        
    @Override
    public String toString() {

        return super.toString() +
                "\nPoder de cura: " + poderCura;
    }



        
    }
    

