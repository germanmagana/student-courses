FROM adoptopenjdk/openjdk11:latest
RUN mkdir /opt/app
COPY target/*.jar /opt/app
EXPOSE 8080
CMD ["java", "-jar", "/opt/app/school-registration-system-0.0.1-SNAPSHOT.jar"]
