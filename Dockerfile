FROM openjdk:11-jdk-slim
EXPOSE 8080
ADD /build/libs/EbiznesProjekt-0.0.1-SNAPSHOT.jar ebiznes.jar
ENTRYPOINT ["java", "-jar", "ebiznes.jar"]