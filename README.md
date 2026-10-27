# Aluguel

Aplicação Java para modelagem de dados de aluguel de quartos e imóveis, com entidades para locadores, moradores, estabelecimentos, quartos e fotos.

> **Estado atual:** o projeto contém o modelo de domínio e a configuração inicial do Spring Boot. Ainda não há controladores ou rotas HTTP implementados.

## Tecnologias

- Java 21
- Spring Boot
- Spring Data JPA / Hibernate
- MySQL
- Maven (Maven Wrapper incluído)

## Pré-requisitos

- JDK 21
- MySQL em execução

## Configuração

Crie o banco de dados local:

```sql
CREATE DATABASE aluguel;
```

A configuração padrão da aplicação usa `jdbc:mysql://localhost:3306/aluguel` e o usuário `root`. Configure as credenciais do seu ambiente sem salvar senhas no código-fonte. As propriedades Spring podem ser sobrescritas com variáveis de ambiente, por exemplo:

```bash
export SPRING_DATASOURCE_URL='jdbc:mysql://localhost:3306/aluguel?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true'
export SPRING_DATASOURCE_USERNAME='seu-usuario'
export SPRING_DATASOURCE_PASSWORD='sua-senha'
```

## Compilar e testar

Linux/macOS:

```bash
./mvnw clean test
```

Windows:

```bat
mvnw.cmd clean test
```

## Executar

Linux/macOS:

```bash
./mvnw spring-boot:run
```

Windows:

```bat
mvnw.cmd spring-boot:run
```

O Hibernate está configurado para atualizar o esquema do banco automaticamente (`ddl-auto=update`). Essa configuração é adequada para desenvolvimento local; avalie uma estratégia explícita de migrações antes de usar em produção.

## Modelo de domínio

- **Locador:** informações de contato e perfil de quem disponibiliza o imóvel.
- **Estabelecimento:** endereço, características e comodidades de uma casa ou apartamento.
- **Quarto:** características, valor e disponibilidade de um quarto vinculado a um estabelecimento.
- **Morador:** informações de perfil de quem ocupa um quarto.
- **Foto:** localização de imagens associadas a um quarto ou estabelecimento.

## Estrutura do projeto

```text
src/
├── main/
│   ├── java/com/sistema/aluguel/
│   │   ├── entity/       # Entidades JPA
│   │   ├── enuns/        # Enumerações do domínio
│   │   └── AluguelApplication.java
│   └── resources/
│       └── application.properties
└── test/                 # Testes da aplicação
```

---

# Aluguel (English)

A Java application for modeling room and property rentals, with entities for landlords, residents, properties, rooms, and photos.

> **Current status:** the project contains the domain model and the initial Spring Boot configuration. HTTP controllers and routes have not been implemented yet.

## Technologies

- Java 21
- Spring Boot
- Spring Data JPA / Hibernate
- MySQL
- Maven (Maven Wrapper included)

## Prerequisites

- JDK 21
- A running MySQL server

## Configuration

Create the local database:

```sql
CREATE DATABASE aluguel;
```

By default, the application connects to `jdbc:mysql://localhost:3306/aluguel` with the `root` user. Configure credentials for your environment without committing passwords to source control. Spring properties can be overridden with environment variables, for example:

```bash
export SPRING_DATASOURCE_URL='jdbc:mysql://localhost:3306/aluguel?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true'
export SPRING_DATASOURCE_USERNAME='your-username'
export SPRING_DATASOURCE_PASSWORD='your-password'
```

## Build and test

Linux/macOS:

```bash
./mvnw clean test
```

Windows:

```bat
mvnw.cmd clean test
```

## Run

Linux/macOS:

```bash
./mvnw spring-boot:run
```

Windows:

```bat
mvnw.cmd spring-boot:run
```

Hibernate is configured to update the database schema automatically (`ddl-auto=update`). This is suitable for local development; evaluate an explicit migration strategy before using the application in production.

## Domain model

- **Locador (Landlord):** contact and profile information for the property owner/host.
- **Estabelecimento (Property):** address, characteristics, and amenities of a house or apartment.
- **Quarto (Room):** room details, price, and availability, linked to a property.
- **Morador (Resident):** profile information for someone occupying a room.
- **Foto (Photo):** image location associated with a room or property.

## Project structure

```text
src/
├── main/
│   ├── java/com/sistema/aluguel/
│   │   ├── entity/       # JPA entities
│   │   ├── enuns/        # Domain enums
│   │   └── AluguelApplication.java
│   └── resources/
│       └── application.properties
└── test/                 # Application tests
```
