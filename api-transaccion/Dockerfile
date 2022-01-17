FROM openjdk:8
VOLUME /tmp
EXPOSE 8888
ADD ./target/transaccion.jar api-transaccion.jar
ENTRYPOINT ["java","-jar","/api-transaccion.jar"]