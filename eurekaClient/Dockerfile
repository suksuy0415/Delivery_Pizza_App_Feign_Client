
FROM openjdk:19
WORKDIR usr/src
EXPOSE 8761
ADD ./target/eurekaClient-0.0.1-SNAPSHOT.jar /usr/src/eurekaClient-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","eurekaClient-0.0.1-SNAPSHOT.jar"]