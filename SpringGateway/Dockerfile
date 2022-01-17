FROM openjdk:8
VOLUME /tmp
EXPOSE 8888
ADD ./target/SpringGateway-0.0.1-SNAPSHOT.jar spring-gateway.jar
ENTRYPOINT ["java","-jar","/spring-gateway.jar"]