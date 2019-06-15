# EmailAgent

# Import project into Eclipse IDE or STS IDE
Import source files as Maven Existing project by pointing to location of pom.xml
Run as SpringBoot application

# Tomcat deployment
mvn clean
mvn package
deploy war file EmailAgent/target/EmailAgent-0.0.1-SNAPSHOT.jar  on tomcat

## Invoking Rest API via MailGun API 
http://localhost:8080/sendmail1

## Invoking Rest API via MailJet API 
http://localhost:8080/sendmail2

