#!/bin/bash

set -e

cd `dirname $0`
r=`pwd`
echo $r

# Eureka
cd $r/Peer-Eureka-Service
echo "Starting Eureka Service..."
mvn -q clean spring-boot:run &

# Rest Service
echo "Starting Catalog Service..."
cd $r/Peer-Catalog-Service
mvn -q clean spring-boot:run &

# Edge Service
echo "Starting Edge Service..."
cd $r/Peer-Edge-Service
mvn -q clean spring-boot:run &

# Client
cd $r/client
npm install
echo "Starting Angular Client..."
npm start
