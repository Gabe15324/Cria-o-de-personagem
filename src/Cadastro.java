import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private static List<Personagem> ListaPersonagens = new ArrayList<>();

    public static void cadastrar(Personagem personagem) {
        ListaPersonagens.add(personagem);
    }

    public static List<Personagem> getListaPersonagens() {
        return ListaPersonagens;
    }

    public static Personagem buscar(String nome) {
        for (Personagem temp : ListaPersonagens) {
            if (temp.getNome().equals(nome)) {
                return temp;
            }
        }
        return null;
    }
}
