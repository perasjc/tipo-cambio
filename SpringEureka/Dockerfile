FROM openjdk:8
VOLUME /tmp
EXPOSE 8888
ADD ./target/SpringEureka-0.0.1-SNAPSHOT.jar spring-eureka.jar
ENTRYPOINT ["java","-jar","/spring-eureka.jar"]