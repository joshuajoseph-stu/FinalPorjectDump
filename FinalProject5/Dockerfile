# we are extending everything from java:8.0 image ...
FROM java:8.0
MAINTAINER yilmazsen# 
#COPY path-to-your-application-jar path-to-webapps-in-docker-jar
COPY myproject-name_0.0.1_SNAPSHOT.jar /app/myproject_name.jar
CMD ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/myproject_name.jar"]