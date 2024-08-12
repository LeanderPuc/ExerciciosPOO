import java.sql.SQLOutput;

public class Notebook {
    public String marca;
    public String modelo;
    public String cor;
    public float polegadas;
    public boolean ligado = false;
    public int volume = 5;
    public boolean abrir = false;

    //construtor
    public Notebook(){
        this.marca = null;
        this.modelo = null;
        this.cor = null;
        this.polegadas = 0f;
    }
    public Notebook(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public Notebook(String marca, String modelo, String cor, float polegadas){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.polegadas = polegadas;
    }


    public void ligar() {
        ligado = true;
        System.out.println(modelo + " " + marca + " " + "Bem-vindo");
    }

    public void desligar() {
        System.out.println(modelo + " " + "Desligando");
    }

    public void AumentarVolume() {
        if (ligado) {
            System.out.println("Volume: " + volume++);
        }
    }

    public void diminuirVolume() {
        if (ligado) System.out.println("Volume: " + (volume-1));
    }
    public void abrir() {
        if(!abrir);
        System.out.println("Abrindo");
    }
    public void fechar() {
        System.out.println("Fechando");
    }
}