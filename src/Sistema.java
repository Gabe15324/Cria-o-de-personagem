public class Sistema {
    private static void exibirMenu() {

        System.out.println("\nPERSONAGEM");
        System.out.println("1) Cadastrar Mago");
        System.out.println("2) Cadastrar Atirador");
        System.out.println("3) Cadastrar Curador");
        System.out.println("4) Procurar Personagem");
        System.out.println("5) Listar Todos");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");

    }

    private static void verificarOpcao(int op){
        String nome;
        int ataque;
        int defesa;
        int poderMagia;
        int poderAtilharia;

        switch (op) {
            case 1:

                System.out.println("\nNovo Mago:");
                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("\nAtaque: ");
                ataque = Console.lerInt();

                System.out.print("Defesa:");
                defesa = Console.lerInt();

                System.out.print("\nMagia: ");
                poderMagia = Console.lerInt();

                Mago m = new Mago(nome, ataque, defesa, poderMagia);

                Cadastro.cadastrar(m);

                System.out.println("\nMago cadastrado com sucesso!");

                break;

            case 2:

                System.out.println("\nNovo Atirador:");
                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("\nAtaque: ");
                ataque = Console.lerInt();

                System.out.print("Defesa:");
                defesa = Console.lerInt();

                System.out.print("\nPoder de artilharia: ");
                poderAtilharia = Console.lerInt();

                Atirador a = new Atirador(nome, ataque, defesa, poderAtilharia);

                Cadastro.cadastrar(a);

                System.out.println("\nAtirador cadastrado com sucesso!");

                break;


            case 3:
            
            
                break;

            case 4:
                
                System.out.println("\nProcurar Personagem:");

                System.out.print("Nome: ");
                nome = Console.lerString();
                
                Personagem p = Cadastro.buscar(nome);

                  if (p != null) {

                     System.out.println("\nPersonagem Localizado:");
                     System.out.println(p.toString());
                    return;

                }

                System.out.println("\nPersonagem " + nome + " não foi encontrado");

                break;

                case 5:
                System.out.println("\nTodos os personagens Cadastrados:");

                if (Cadastro.getListaPersonagens().size() == 0) {
                    System.out.println("\nNão há personagens cadastrados...");
                    return;
                }

                for (Personagem temp : Cadastro.getListaPersonagens()) {
                    System.out.println(temp.toString());
                }

                break;


            case 0:

                System.out.println("\nO programa foi finalizado...");
                break;

            default:

                System.out.println("\nOpção inválida. Digite novamente.");
                break;
    }  




    }


    public static void executar() {

        int op;
        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

}
