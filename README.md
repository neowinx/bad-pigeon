# Bad Pigeon

Little program for sending mails.

## Development

Scala has been used for the development of this aplication (it's more fun than do it in pure java).

### Requirements

- [SBT](http://www.scala-sbt.org/)
- [JDK](http://openjdk.java.net/)

### Build

Once you have jdk and sbt installed, execute the **assembly** task in sbt in order to compile and build the artifact

```bash
sbt assembly
```

the result is a jar inside the directory **target/scala-2.10/bad-pigeon.jar**

## Use

```bash
java [-Dproperty1=value1]... -jar bad-pigeon.jar FROM TO SUBJECT MESSAGE [ATTACH]
```

where the parameters are:
* [-Dproperty1=value1] - Properties used by the [JavaMail API](https://javamail.java.net/nonav/docs/api/) for configuration. Ej.: -Dmail.smpt.host=localhost
* FROM - The email address of the sender i.e.: boss@example.org
* TO - The email address of the recipient i.e.: employee@example.org
* SUBJECT - The email subject i.e.: "Hola buddy"
* MESSAGE - The message i.e.: "Do your work!!!"
* [ATTACH] - Some optional file to send as attachment. (only 1 file is supported in this version)

All protocol configuration like hosts, ports and others are completely configured throught the JavaMail API properties. For more information see [https://javamail.java.net/nonav/docs/api/]

## License

See [LICENSE](LICENSE)

Enjoy!

Pedro Flores