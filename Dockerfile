#FROM openjdk:10-jre-slim
FROM openjdk:8-jre-slim

WORKDIR /app
COPY ./target/demo-backend-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "demo-backend-0.0.1-SNAPSHOT.jar"]