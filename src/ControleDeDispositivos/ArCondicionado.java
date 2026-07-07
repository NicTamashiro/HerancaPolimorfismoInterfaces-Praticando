package ControleDeDispositivos;

public class ArCondicionado implements Controlavel{
    private boolean ligado = false;

    @Override
    public void desligar() {
        if(ligado == false){
            System.out.println("O Ar condicionado ja esta desligado");
        } else {
            this.ligado = true;
            System.out.println("Ar condicionado desligado");
        }
    }

    @Override
    public void ligar() {
        if(ligado == true){
            System.out.println("O Ar condicionado ja esta ligado");
        } else {
            this.ligado = true;
            System.out.println("Ar condicionado ligado");
        }
    }
}
