FROM adoptopenjdk/openjdk11:latest
RUN mkdir /opt/app
COPY school-registration-system-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/japp.jar"]