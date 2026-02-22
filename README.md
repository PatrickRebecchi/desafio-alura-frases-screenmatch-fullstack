## ScreenMatch – Desafio Fullstack

Esse projeto foi desenvolvido como parte dos meus estudos em Spring Boot e desenvolvimento backend, integrando também um frontend simples em HTML, CSS e JavaScript.

A aplicação disponibiliza uma API que retorna frases aleatórias de séries, buscando os dados em um banco PostgreSQL.

🚀 Tecnologias utilizadas
## Backend

Java

Spring Boot

Spring Web

Spring Data JPA

PostgreSQL

Maven

## Frontend

HTML

CSS

JavaScript

Fetch API

## O que pratiquei nesse projeto

Criação de API REST

Organização em camadas (Controller, Service, Repository)

Uso de DTO para controlar os dados retornados

Queries personalizadas com JPQL

Integração entre frontend e backend

Configuração de CORS

Manipulação de requisições assíncronas no JavaScript

📌 Endpoint principal
GET /frases

Retorna uma frase aleatória cadastrada no banco.

Exemplo de resposta:
{
  "titulo": "Breaking Bad",
  "frase": "I am the one who knocks!",
  "personagem": "Walter White",
  "poster": "https://..."
}

⚙️ Como executar
1️⃣ Configure o banco PostgreSQL

No arquivo application.properties, configure:

spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
2️⃣ Execute o backend

Dentro da pasta do backend:

mvn spring-boot:run

O servidor iniciará em:

http://localhost:8080
3️⃣ Execute o frontend

Abra a pasta do frontend com o Live Server ou outro servidor local.

📚 Sobre o projeto

Esse projeto faz parte do meu processo de aprendizado em backend com Java.
Estou buscando evoluir cada vez mais na organização do código, arquitetura e boas práticas.

👨‍💻 Autor

Patrick
Estudante de Engenharia de Software 🚀
