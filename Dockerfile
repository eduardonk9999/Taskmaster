# Etapa 1: Construir o projeto
FROM maven:3.9.2-eclipse-temurin-17 as build
WORKDIR /app

# Copia o pom.xml e baixa as dependências
COPY pom.xml .
RUN mvn dependency:go-offline

# Copia o código-fonte e constrói o projeto
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Executar o projeto
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

# Copia o JAR gerado da etapa de build
COPY --from=build /app/target/taskmaster-0.0.1-SNAPSHOT.jar /app/taskmaster.jar

# Define a porta em que a aplicação será exposta
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "/app/taskmaster.jar"]
