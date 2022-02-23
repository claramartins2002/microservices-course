# Microservices course

Conjunto de microsserviços desenvolvidos em Spring Boot. 

## Linguagens e tecnologias utilizadas

- Spring Boot
- Spring Cloud Server
- Spring Cloud Gateway Zuul
- Spring Security OAuth
- Banco de dados H2
- Eureka 
- Jpa


## Microsserviços
- Gateway Zuul: Centralização de configurações de todas as portas utilizadas
- Config Server: Centralicação de propriedades de todos os microsserviços em um repositório no github
- Eureka Server: Gerenciamento de serviços que estão rodando paralelamente
- Oauth: Autenticação via token 
- Payroll: Cálculo de salário do trabalhador
- User: Configuração dos usuários da aplicação em banco de dados
- Worker: Configuração dos trabalhadores cadastrados no sistema em banco de dados

## Instruções de uso
Ordem de inicialização dos microsserviços para evitar erros de compilação: hr-config-server -> hr-eureka-server-> hr-api-gateway-zuul-> hr-user... 




