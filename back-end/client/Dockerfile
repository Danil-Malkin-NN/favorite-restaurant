
FROM gradle:7.4.2-jdk17-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:8-jre-slim

EXPOSE 8080

RUN mkdir /app

COPY --from=build /home/gradle/src/build/libs/*.jar /app/spring-boot-application.jar


FROM openjdk:17-jdk-alpine as client

VOLUME /tmp
COPY build/libs/client-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]