FROM amazoncorretto:18-alpine-jdk

COPY target/proyecto-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]
