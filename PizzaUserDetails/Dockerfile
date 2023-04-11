
FROM openjdk:19
WORKDIR usr/src
EXPOSE 8083
ADD ./target/PizzaUserDetails-0.0.1-SNAPSHOT.jar /usr/src/PizzaUserDetails-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","PizzaUserDetails-0.0.1-SNAPSHOT.jar"]