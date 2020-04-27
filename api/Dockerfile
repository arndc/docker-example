FROM maven:3.6.3-openjdk-11 AS build
COPY pom.xml /home/app/pom.xml
COPY rest /home/app/rest
COPY run /home/app/run
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:11-jre
COPY --from=build /home/app/run/target/api-1.0.0.jar /opt/app/api/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/app/api/app.jar"]
