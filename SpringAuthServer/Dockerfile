FROM openjdk:8
VOLUME /tmp
EXPOSE 8888
ADD ./target/SpringAuthServer-0.0.1-SNAPSHOT.jar spring-auth-server.jar
ENTRYPOINT ["java","-jar","/spring-auth-server.jar"]