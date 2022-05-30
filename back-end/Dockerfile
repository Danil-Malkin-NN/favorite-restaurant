FROM gradle:7.4.2-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build



FROM openjdk:17-jdk-alpine
RUN mkdir /app
COPY --from=build /home/gradle/src/client/build/libs/client.app-0.0.1.jar /app/app.jar
RUN ls
ENTRYPOINT ["java","-jar","app/app.jar"]