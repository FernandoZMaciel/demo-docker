# Usar uma imagem base com OpenJDK
FROM openjdk:17-jdk-slim

# Definir o diretório de trabalho dentro do container
WORKDIR /app

# Copiar o arquivo JAR da aplicação para dentro do container
COPY target/minha-aplicacao.jar app.jar

# Expôr a porta 8080 (padrão do Spring Boot)
EXPOSE 8080

# Comando para rodar a aplicação no container
ENTRYPOINT ["java", "-jar", "app.jar"]