# Microservice with Spring Boot + Oracle Cloud

This project demonstrates how to build a **complete microservice** using **Spring Boot**, integrated with **Oracle Cloud's free tier services**, including **Object Storage** and **Mail Delivery**.

The application simulates a microservice capable of **generating and sending reports via email**, leveraging Oracle Cloud’s free-tier resources.


## ☁️ Oracle Cloud Free Tier

To create a free account, visit: [Oracle Cloud Free Tier](https://www.oracle.com/cloud/free/)

The free tier offers **unlimited usage** of several services, including:
- Virtual Machine (VM) Instances  
- Object Storage  
- Email Delivery  
- NoSQL Database  
- SQL Database  


## ✅ Requirements

- Oracle Cloud account  
- Java 21  
- Maven 3.9.7  


## ⚙️ Configuration

### `application.properties`

The `src/main/resources/application.properties` file should contain:

```properties
# Oracle Cloud
spring.application.name=mailservice
spring.mail.username=YOUR_SMTP_USERNAME
spring.mail.password=YOUR_SMTP_PASSWORD
spring.mail.from=YOUR_REGISTERED_EMAIL
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.starttls.required=true
spring.mail.properties.mail.smtp.ssl.trust=smtp.email.sa-saopaulo-1.oci.oraclecloud.com
spring.mail.host=smtp.email.sa-saopaulo-1.oci.oraclecloud.com
spring.mail.port=587
spring.mail.protocol=smtp
