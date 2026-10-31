FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Assumes your JAR file is in the target directory (Maven)
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
