# projeto-boot-admin
Monitoramento de API com Actuator

# Spring Boot Admin
O __Spring Boot Admin__ é um aplicativo Web, usado para gerenciar e monitorar aplicativos Spring Boot. Cada aplicativo é considerado como um cliente e se registra no servidor de administração do Spring Boot Admin. Nos bastidores, a mágica é feita pelos endpoints do __Spring Boot Actuator__.

# Projeto Boot Admin - Monitoramento de REST API
Projeto que usa o Spring Boot Admin para monitoramento de API usando o Actuator


# O que o Actuator?
A principio o __Actuator__ traz alguns recursos prontos para serem usados em produção para nossa aplicação. Monitorar nossa aplicação, coletar métricas, entender o tráfego ou o estado do nosso banco de dados se torna facil trivial com essa dependência. O principal benefício desta biblioteca é que podemos obter ferramentas de monitoramento de nível de produção sem precisar implementar esses recursos pois eles ja vem prontos com o Spring Boot.

# Monitorando a API 
Para este projeto, vamos monitorar uma REST API "projeto-boot-admin-cliente" criada no repositório GitHub [Projeto Boot Admin Cliente](https://github.com/EmanuelGabriel/projeto-boot-admin-cliente). 


# Configurando o Actuator em nossa aplicação REST API "projeto-boot-admin-cliente" 
Para adicionarmos o actuator em nosso projeto precismos adicionar a dependencia spring-boot-starter-actuator no nosso maven.

Abra seu arquivo __pom.xml__ e adicione essa dependência:

```
arquivo pom.xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>

```


# Detalhes do projeto

### Participante: 
|nome|e-mail|atualizado|
| -------- | -------- | -------- |
|Emanuel A. Gabriel |emanuel.gabriel.sousa@hotmail.com|true|

# Status do projeto

> Status do Projeto: Concluido :heavy_check_mark:



# Criado por
> Emanuel A. Gabriel


# Imagens da aplicação
## Dashboard
![Captura de tela de 2020-08-31 10-34-17](https://user-images.githubusercontent.com/16214525/91727425-13dbdb80-eb78-11ea-9856-f972ab335faf.png)

![Captura de tela de 2020-08-31 10-34-24](https://user-images.githubusercontent.com/16214525/91727706-70d79180-eb78-11ea-8796-95ef5c96d73b.png)

![Captura de tela de 2020-08-31 10-34-32](https://user-images.githubusercontent.com/16214525/91727768-88af1580-eb78-11ea-9ded-d27ecc728dad.png)

![Captura de tela de 2020-08-31 10-34-38](https://user-images.githubusercontent.com/16214525/91727872-ab412e80-eb78-11ea-8aad-a0928bffe931.png)

## Métricas
![Captura de tela de 2020-08-31 11-54-10](https://user-images.githubusercontent.com/16214525/91734186-fbbc8a00-eb80-11ea-92b3-e0d57d45800e.png)

