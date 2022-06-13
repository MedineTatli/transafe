FROM openjdk:8-jre-alpine
RUN apk update && apk add bash
WORKDIR /app
COPY /target/docker-java-app-transafe.jar /app
EXPOSE 8085
CMD ["java", "-jar", "docker-java-app-transafe.jar"]