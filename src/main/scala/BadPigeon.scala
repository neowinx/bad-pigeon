import javax.mail._
import javax.mail.internet._

/**
 * Original implementation comes from:
 *
 * http://langref.org/scala/networking/smtp/send-an-email
 *
 * It's not as functional as we wanted. But it's still better than doing it in pure Java
 *
 */
object BadPigeon {

  def main(args: Array[String]) {

    if (args.length != 4) {
      println("Evia un email.")
      println("uso:")
      println("  bad-pigeon-1.0 [-Dproperty1=value1]... [DE] [PARA] [ASUNTO] [MENSAJE]")
      println
      println("Ejemplo: bad-pigeon-1.0 gt40@example.org gt90@example.org \"I am a better car\" \"... and you know it...\"")
      sys.exit(1)
    }

    val from = args(0)
    val to = args(1)
    val asunto = args(2)
    val mensaje = args(3)

    // Set up the mail object
    val properties = System.getProperties
    val session = Session.getDefaultInstance(properties)
    val message = new MimeMessage(session)

    // Set the from, to, subject, body text
    message.setFrom(new InternetAddress(from))
    message.setRecipients(Message.RecipientType.TO, to)
    message.setSubject(asunto)
    message.setText(mensaje)

    // And send it
    Transport.send(message)

  }

}