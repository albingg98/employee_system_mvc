FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/employeemvc-0.0.1.jar
COPY ${JAR_FILE} app_employeemvc.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_employeemvc.jar"]