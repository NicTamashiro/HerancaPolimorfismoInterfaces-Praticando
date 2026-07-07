package SistemaDeNotificacao;

public class Push extends Notificacao{
    private String titulo;

    public Push(String destinatario, String mensagem, String titulo) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    public void enviar(){
        System.out.println("Enviando Push para: " + getDestinatario());
        System.out.println("Titulo: " + titulo);
        System.out.println("Conteudo: " + getMensagem());
        System.out.println();
    }
}
