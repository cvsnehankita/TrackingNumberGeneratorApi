FROM container-registry.oracle.com/java/jdk:24
WORKDIR /app
COPY target/TrackingNumberGeneratorApi-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
