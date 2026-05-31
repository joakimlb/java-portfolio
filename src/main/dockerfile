# Use Maven to build the project and OpenJDK to run the jar (multi-stage)
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy pom and source
COPY pom.xml .
COPY src ./src

# Build the project (skip tests for faster build; remove -DskipTests if you want tests)
RUN mvn -B package -DskipTests

FROM eclipse-temurin:17-jre
WORKDIR /app

# Copy the built jar from the build stage. Adjust the jar name/pattern if needed.
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
