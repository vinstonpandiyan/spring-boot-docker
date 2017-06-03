######################################
# Spring-boot application Base Image #
######################################

# Set the base image to our base
FROM vinston/javabase

# File Author
MAINTAINER Vinston Pandiyan @https://hub.docker.com/u/vinston/

ENV JAVA_HOME=/usr/java/latest

COPY ./target/tomcat-example-1.0.RELEASE.jar /app/

EXPOSE 8080

ENTRYPOINT ["java","-jar", "/app/tomcat-example-1.0.RELEASE.jar"]
