import static java.lang.IO.*;

public class Main {
    public static void main(String[] args) {
        BichinhoVirtual pet = new BichinhoVirtual();

        print("Digite o nome do seu pet: ");
        pet.setNome(readln());

        while (true) {
            println("\n=== MENU ===");
            println("1 - Alterar Fome");
            println("2 - Alterar Energia");
            println("3 - Ver Humor");
            println("0 - Sair");
            print("Escolha uma opção: ");

            int opcao = Integer.parseInt(readln());

            if (opcao == 0) {
                println("Saindo...");
                break;
            } else if (opcao == 1) {
                print("Digite o valor da fome (0-100): ");
                pet.setFome(Integer.parseInt(readln()));
            } else if (opcao == 2) {
                print("Digite o valor da energia (0-100): ");
                pet.setEnergia(Integer.parseInt(readln()));
            } else if (opcao == 3) {
                println("Humor: " + pet.getHumor());
            } else {
                println("Opção inválida!");
            }
        }
    }
}