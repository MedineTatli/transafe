FROM openjdk:8-jre-alpine
RUN apk update && apk add bash
WORKDIR /app
COPY /target/transafe-1.0-SNAPSHOT.jar /app
EXPOSE 8085
CMD ["java", "-jar", "transafe-1.0-SNAPSHOT.jar"]