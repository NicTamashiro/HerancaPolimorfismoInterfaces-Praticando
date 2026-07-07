package ControleDeDispositivos;

public class Luz implements Controlavel{
    private boolean ligado = false;

    @Override
    public void desligar() {
        if(ligado == false){
            System.out.println("A Luz ja esta desligada");
        } else {
            this.ligado = true;
            System.out.println("Luz desligada");
        }
    }

    @Override
    public void ligar() {
        if(ligado == true){
            System.out.println("A Luz ja esta ligada");
        } else {
            this.ligado = true;
            System.out.println("Luz ligada");
        }
    }
}
