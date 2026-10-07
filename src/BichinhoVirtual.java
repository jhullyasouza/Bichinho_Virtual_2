import static java.lang.IO.*;

public class BichinhoVirtual {

    private String nome;
    private int fome;
    private int energia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {

        if (fome < 0) {
            this.fome = 0;
        } else if (fome > 100) {
            this.fome = 100;
        } else {
            this.fome = fome;
        }

        if (this.fome > 75) {
            IO.println("Status: Pet morrendo de fome!");
        } else if (this.fome > 50) {
            IO.println("Status: Pet com fome.");
        } else if (this.fome > 25) {
            println("Status: Pet com pouca fome.");
        } else {
            IO.println("Status: Pet sem fome (saciado).");
        }
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {

        if (energia < 0) {
            this.energia = 0;
        } else if (energia > 100) {
            this.energia = 100;
        } else {
            this.energia = energia;
        }

        if (this.energia > 75) {
            IO.println("Status: Pet com muita energia!");
        } else if (this.energia > 50) {
            IO.println("Status: Pet com energia.");
        } else if (this.energia > 25) {
            IO.println("Status: Seu pet está quase sem energia.");
        } else {
            IO.println("Status: Seu pet precisa muito descansar/energia.");
        }
    }

    public String getHumor() {

        int calcularHumor = ((100 - fome) + energia) / 2;

        if (calcularHumor > 75) {
            return "Pet muito bem-humorado!";
        } else if (calcularHumor > 50) {
            return "Pet bem-humorado.";
        } else if (calcularHumor > 25) {
            return "Seu pet está meio mal-humorado...";
        } else {
            return "Seu pet está com um péssimo humor!";
        }
    }
}

