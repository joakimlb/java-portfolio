# Use Maven to build the project and OpenJDK to run the jar (multi-stage)
FROM maven:3.9.6-eclipse-temurin-26 AS build
WORKDIR /app
