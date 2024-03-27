# emailExpress

Ich habe diese Anwendung erstellt, um meine Kompetenz in Spring Boot zu demonstrieren.
Modellierung des E-Mail-Versands zwischen verschiedenen Workern, die einen Thread verwenden.

## Overview
Das ist ein Microservice, der entwickelt wurde, um den E-Mail-Versand in einer verteilten Umgebung effizient zu verwalten. Sie ermöglicht es, E-Mails zwischen verschiedenen Workern zu verteilen, die Threads verwenden, um den Versandprozess zu optimieren.

## Microservice
- **Client API**: Die Client-API ermöglicht es Benutzern, E-Mail-Versandaufträge an den Microservice zu senden und den Status der versendeten E-Mails abzufragen.
- **Worker**: Die Worker-Komponente ist für die Verarbeitung der eingehenden E-Mail-Versandaufträge verantwortlich. Sie verwendet Threads, um den Versandprozess zu optimieren und eine effiziente Verteilung der E-Mails zu gewährleisten.
- **Store**: Der Store dient als zentraler Speicher für E-Mail-Versandaufträge und deren Status. Er ermöglicht es den Workern, auf die benötigten Daten zuzugreifen und den Status der bearbeiteten E-Mails zu aktualisieren.


## Technologies Used
- Spring Boot
- Gradle
- Hibernate/JPA
- Lombok
- Microservice
- Redis
- Actuator
- Scheduling
- Logging
