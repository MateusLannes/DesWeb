# Use uma imagem base do OpenJDK
FROM maven:3.8.4-openjdk-17-jammy

# Crie um diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie o arquivo JAR do seu aplicativo para o contêiner
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src

RUN mvn clean package

# Exponha a porta que o aplicativo Spring Boot está usando (geralmente a porta 8080)
EXPOSE 8080

# Comando para iniciar o aplicativo quando o contêiner for iniciado
CMD ["mvn, spring-boot:run"]
