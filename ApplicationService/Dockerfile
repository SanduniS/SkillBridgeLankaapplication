# Use Java 21 image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy Maven build artifact (jar)
COPY target/*.jar app.jar

# Expose port (change if needed)
EXPOSE 8088

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
