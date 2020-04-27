# Docker example

This repository contains a simple [Docker](https://docker.com/) example to showcase how to build a 
[Docker container](https://www.docker.com/resources/what-container) and how you can communicate 
between multiple [Docker containers](https://www.docker.com/resources/what-container). 
The example consists of 3 modules with each module containing a Dockerfile to build an image of that module.

In order to let each Docker container work together we are going to use a tool to facilitate this, 
namely [docker-compose](https://docs.docker.com/compose/)



## Modules

`webapp` → `gateway` → `api`

1. Web application ([Vue.js](https://vuejs.org/))
2. REST API ([Spring Boot](https://spring.io/projects/spring-boot))
3. Gateway ([nginx](https://nginx.org/))

## Commands

```bash
# See all running Docker containers

docker container ls


# See all local Docker images

docker image ls


# Builds, (re)creates, starts, and attaches to containers for a service

docker-compose up


# Stops containers and removes containers, networks, volumes, and images created by up

docker-compose down

```

### References
- [docker-compose up](https://docs.docker.com/compose/reference/up/)
- [docker-compose down](https://docs.docker.com/compose/reference/down/)

