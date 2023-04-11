
FROM openjdk:19
WORKDIR usr/src
EXPOSE 9000
ADD ./target/APIClientSpringGateway-0.0.1-SNAPSHOT.jar /usr/src/APIClientSpringGateway-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","APIClientSpringGateway-0.0.1-SNAPSHOT.jar"]