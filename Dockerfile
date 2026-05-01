# Usa a imagem oficial do Amazon Corretto (Java 17) em sua versão mais leve
FROM amazoncorretto:17-alpine

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo .jar gerado pelo Maven para dentro do contêiner
# (Certifique-se de rodar './mvnw clean package' antes)
COPY target/*.jar app.jar

# Expõe a porta que o Spring Boot vai rodar
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]