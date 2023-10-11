FROM openjdk:8
EXPOSE 7762
ADD target/rat-0.0.1-SNAPSHOT.jar spring-boot-docker.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-docker.jar"]
