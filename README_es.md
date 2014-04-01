# Bad Pigeon

Pequeño programita que envia emails.

## Desarrollo

Para el desarrollo de la aplicacion se ha utilizado scala (es más divertido que hacerlo con java).

### Requerimientos

- [SBT](http://www.scala-sbt.org/)
- [JDK](http://openjdk.java.net/)

### Construcción

Una vez instalados jdk y sbt, ejecutamos la tarea **assembly** en sbt para poder compilar y construir el ejecutable

```bash
sbt assembly
```

el resultado es un jar dentro del directorio **target/scala-2.10/bad-pigeon.jar**

## Uso

```bash
java [-Dproperty1=value1]... -jar bad-pigeon.jar DE PARA ASUNTO MENSAJE [ADJUNTO]
```

donde los parametros son:
* [-Dproperty1=value1] - Son las propiedades que utiliza el [JavaMail API](https://javamail.java.net/nonav/docs/api/) para su configuración. Ej.: -Dmail.smpt.host=localhost
* DE - La dirección de email del remitente. Ej.: boss@example.org
* PARA - La dirección de email del destinatario. Ej.: employee@example.org
* ASUNTO - El asunto del email. Ej.: "Hola buddy"
* MENSAJE - El mensaje. Ej.: "Do your work!!!"
* [ADJUNTO] - Archivo adjunto a enviarse junto con el email. (En esta versión solo puede enviarse 1 archivo adjunto)

La configuracion de protocolos, host, puertos son totalmente configuradas por las propiedades del JavaMail API. Para mas información, vea [https://javamail.java.net/nonav/docs/api/]

## Licencia

Véase el archivo [LICENSE](LICENSE)

Que lo disfrutes!

Pedro Flores