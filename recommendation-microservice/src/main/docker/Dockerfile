FROM java:8
VOLUME /tmp
ADD recommendation-microservice-0.1.0.2018.03.18.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
