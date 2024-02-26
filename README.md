# Projeto CRUD com Spring Boot

Este é um projeto simples usando Spring Boot para criar operações CRUD (Create, Read, Update, Delete).

## Detalhes do Projeto

- **Grupo de Artefatos:** com.example
- **Artefato:** crud
- **Versão:** 0.0.1-SNAPSHOT

## Descrição

Este é um projeto simples usando Spring Boot que inclui operações CRUD básicas. Ele utiliza tecnologias como Spring Data JDBC, Spring Data JPA, e Spring Web.

## Pré-requisitos

- Java 17
- MySQL (ou outro banco de dados compatível)

## Dependências

- [Spring Boot Starter Data JDBC](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jdbc)
- [Spring Boot Starter Data JPA](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa)
- [Spring Boot Starter JDBC](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-jdbc)
- [Spring Boot Starter Web](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web)
- [Spring Boot Starter Web Services](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web-services)
- [MySQL Connector/J](https://mvnrepository.com/artifact/com.mysql/mysql-connector-j)
- [Spring Boot Starter Test](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test)
- [JUnit Jupiter API](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api)
- [Spring Boot Configuration Processor](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-configuration-processor)
- [Mockito Core](https://mvnrepository.com/artifact/org.mockito/mockito-core)

## Instruções de Uso
- Clone o repositório.
- Configure o banco de dados MySQL.
- Execute o aplicativo Spring Boot.
- Licença
- Este projeto está licenciado sob a MIT License.

## Configuração do Maven

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.2.3</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>

<groupId>com.example</groupId>
<artifactId>crud</artifactId>
<version>0.0.1-SNAPSHOT</version>
<name>crud</name>
<description>Project Simples Spring Boot</description>

<properties>
    <java.version>17</java.version>
</properties>

<dependencies>
    <!-- Adicione as dependências aqui -->
</dependencies>

<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>


