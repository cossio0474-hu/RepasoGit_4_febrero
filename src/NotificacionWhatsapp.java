public class NotificacionWhatsapp extends Notificacion{

    protected NotificacionWhatsapp(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Se envio el mensaje \"" + mensaje + "\"por Whatsapp a: "
                + this.receptorNotificacion);
    }
}
