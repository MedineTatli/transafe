FROM openjdk:8-jre-alpine
RUN apk update && apk add bash
WORKDIR /app
COPY /target/docker-transafe.jar /app
EXPOSE 8085
CMD ["java", "-jar", "docker-transafe.jar"]