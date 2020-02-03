FROM openjdk
MAINTAINER Dipankar Chatterjee <dipankar.c@hcl.com>
ADD target/spring-boot-efk-service-1.0.jar spring-boot-efk-service-1.0.jar
ENTRYPOINT exec java -jar /spring-boot-efk-service-1.0.jar spring-boot-efk-service
EXPOSE 12001