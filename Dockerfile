FROM container-registry.oracle.com/java/jdk:24
WORKDIR /app
COPY target/TrackingNumberGeneratorApi.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
