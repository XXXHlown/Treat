#!/bin/bash 
docker build -t meetspringboot .
docker login 10.1.36.112:10002 -u admin -p admin123
docker tag meetspringboot 10.1.36.112:10002/private/meetspringboot:v4.0
docker push 10.1.36.112:10002/private/meetspringboot:v4.0
docker rmi -f  meetspringboot
docker rmi -f  10.1.36.112:10002/private/meetspringboot:v4.0
