



FROM icustom-cloud-docker:1.0.0 
VOLUME /tmp
ADD icustom-cloud-docker-1.0.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]




