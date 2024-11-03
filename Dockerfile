FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY target/demo1-0.0.1-SNAPSHOT.jar DemoApp.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","DemoApp.jar"]
