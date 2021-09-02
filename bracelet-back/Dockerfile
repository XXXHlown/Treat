FROM java:8
MAINTAINER max "max@neusoft.com"
VOLUME /data
EXPOSE 8000
ADD /target/braceletapi-0.0.1-SNAPSHOT.jar /data/braceletapi-0.0.1.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/data/meeting.jar"]