FROM openjdk:8
EXPOSE 8089
ADD /target/FournisseurService1.0-0.0.1-SNAPSHOT.jar FournisseurService.jar
ENTRYPOINT ["java", "-jar", "FournisseurService.jar"]
