FROM amazoncorretto:8-alpine-jdk
MAINTAINER emaaristimuno
COPY /target/Vanessa-0.0.1-SNAPSHOT.jar Vanessa-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Vanessa-0.0.1-SNAPSHOT.jar"]
