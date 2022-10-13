FROM openjdk:18.0.2-oracle
ARG JAR_FILE=target/*.jar
COPY out/artifacts/AdstateCatProject_jar/AdstateCatProject.jar app.jar
CMD ["java","-jar","/app.jar"]
EXPOSE 8080