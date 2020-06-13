#!/bin/bash
set -e

repositoryName=613445080628.dkr.ecr.us-east-2.amazonaws.com/mainapp
tag=latest
imageFullName=$repositoryName:$tag

echo [Main App STARTING] building $imageFullName...

echo [Main App] creating jar...
(exec "${BASH_SOURCE%/*}/../gradlew" bootJar )

echo [Main App] creating docker image...
docker build -t $imageFullName ${BASH_SOURCE%/*}

echo [Main App FINISHED] image has been built