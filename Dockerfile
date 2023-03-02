FROM eclipse-temurin:17
COPY target/containeriz-0.0.1-SNAPSHOT.jar /opt/app/containeriz-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/opt/app/containeriz-0.0.1-SNAPSHOT.jar"]