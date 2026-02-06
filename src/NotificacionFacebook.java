public class NotificacionFacebook extends Notificacion {

    protected NotificacionFacebook(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    public void enviarMensaje(String mensaje) {
        System.out.println("Se envio el mensaje \"" + mensaje + "\"por Facebook "
                + this.receptorNotificacion);
}


}
