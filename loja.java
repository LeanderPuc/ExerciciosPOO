public class loja {
    public static void main(String[] args){
        Notebook note1 = new Notebook();

        note1.marca = "Samsung";
        note1.modelo = "Galaxy";
        note1.cor = "Branco";
        note1.polegadas = 19.5f;

        System.out.println(note1.marca + " " + note1.modelo);

        note1.abrir();
        note1.ligar();
        note1.AumentarVolume();
        note1.AumentarVolume();
        note1.diminuirVolume();
        note1.desligar();
        System.out.println(" ");

        Notebook note2 = new Notebook("Apple","Macbook","Prata",16.8f);

        System.out.println(note2.marca + " " + note2.modelo);

        note2.abrir();
        note2.ligar();
        note2.desligar();
        System.out.println(" ");

        Notebook note3 = new Notebook("Positivo", "Seilá");

        note3.cor = "verde";
        note3.polegadas = 19.6f;

        System.out.println(note3.marca + " " + note3.modelo);
        System.out.println(note3.cor + " " + note3.polegadas + " polegadas");

        note3.abrir();
        note3.fechar();


    }
}
