FROM openjdk:17-oracle
ADD target/sb-app.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
