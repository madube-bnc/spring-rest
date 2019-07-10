FROM openjdk:8

LABEL maintainer="Atomist <docker@atomist.com>"

#ENV DUMB_INIT_VERSION=1.2.2

#RUN curl -s -L -O https://github.com/Yelp/dumb-init/releases/download/v$DUMB_INIT_VERSION/dumb-init_${DUMB_INIT_VERSION}_amd64.deb     && dpkg -i dumb-init_${DUMB_INIT_VERSION}_amd64.deb     && rm -f dumb-init_${DUMB_INIT_VERSION}_amd64.deb

RUN mkdir -p /app

WORKDIR /app

EXPOSE 8080

COPY target/spring-rest.jar spring-rest.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","spring-rest.jar"]

