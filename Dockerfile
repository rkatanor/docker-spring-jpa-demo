FROM openjdk:8
ADD target/jpa-repo-demo-0.0.1-SNAPSHOT.jar   jpademo.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "jpademo.jar"]