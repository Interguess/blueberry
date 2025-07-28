# Dockerfile
FROM nvidia/cuda:12.9.1-cudnn-runtime-ubuntu24.04

# Set non-interactive mode for apt
ENV DEBIAN_FRONTEND=noninteractive
RUN apt update && apt install -y \
    openjdk-24-jdk \
    python3.12 python3-pip python3.12-dev libpython3.12 \
    git wget unzip curl libgomp1 \
    && apt clean

# Install Python dependencies
COPY requirements.txt /
RUN pip3 install --upgrade pip && pip3 install -r /requirements.txt

# Install JEP (Java Embedded Python)
RUN pip3 install jep

# Set working directory
WORKDIR /app

# Copy project files
COPY . /app

# Build the project using ShadowJar
RUN ./gradlew :bootstrap:shadowJar

# Run the fat JAR built with ShadowJar
CMD ["java", "-jar", "bootstrap/build/libs/blueberry.jar"]