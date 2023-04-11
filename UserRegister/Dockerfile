
FROM openjdk:19
WORKDIR usr/src
EXPOSE 8085
ADD ./target/UserRegister-0.0.1-SNAPSHOT.jar /usr/src/UserRegister-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","UserRegister-0.0.1-SNAPSHOT.jar"]