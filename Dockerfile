FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /app
COPY . .
# copy pom.xml from context into image
COPY pom.xml /app/pom.xml
RUN mvn clean install

FROM eclipse-temurin:17-jdk
COPY --from=build ./target/*.jar demo.jar
# ENV PORT=8080
EXPOSE 8081
ENTRYPOINT ["java","-jar","demo.jar"]
