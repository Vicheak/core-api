FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/core-api-0.0.1.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
