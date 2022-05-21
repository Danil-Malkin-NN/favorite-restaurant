FROM gradle:7.4.2-jdk17 AS build-database
COPY --chown=gradle:gradle ../l-data-base/. /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build