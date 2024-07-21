FROM maven:3.9.6-amazoncorretto-17-debian as builder

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:17-alpine

COPY --from=builder /app/target/restaurant-backend.jar /opt/

EXPOSE 5431

LABEL authors="andreas"
LABEL maintainer="andreasmouzong@gmail.com"

ENTRYPOINT ["java", "-jar", "/opt/restaurant-backend.jar"]