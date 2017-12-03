# Use an official  runtime as a parent image
FROM java:8-jre
#FROM  docker/compose:1.17.1
#FROM maven
#FROM docker:17.11.0-ce

# Set the working directory to /app
WORKDIR /workflowte

# Copy the current directory contents into the container at /app
ADD . /workflowte

# Make port 80 available to the world outside this container
EXPOSE 8080
EXPOSE 8122

ENV HOMER="Hiiiiiiiiiiiiiiii sekhar"
#RUN mvn clean package

# Run app.py when the container launches
CMD ["java","-jar","target/DockerDeployment-1.3.5.RELEASE.jar"]
