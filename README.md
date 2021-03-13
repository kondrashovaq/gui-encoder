## About
Program that encode and decode text with spiral matrix method with GUI

## Requirements
- My encoder package [Ссылка](https://github.com/kondrashovaq/encoder)
- JDK version 11+ [Ссылка](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- Maven 3.6.3+ [Ссылка](https://maven.apache.org/download.cgi)

## Install encoder
Download encoder package from this [repository](https://github.com/kondrashovaq/encoder), then build it with `mvn clean install`,
after this add dependency to pom.xml in current gui-encoder project
```xml
        <dependency>
            <groupId>org.ekondrashova</groupId>
            <artifactId>encoder</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
```

## How to use
- Build jar file according to [INSTALL.md](https://github.com/kondrashovaq/gui-encoder/blob/master/INSTALL.md)
- Run file `java -jar ./target/gui-encoder.jar`
- For other purposes import project to IDE