#!/bin/bash

repositoryName=613445080628.dkr.ecr.us-east-2.amazonaws.com/mainapp
tag=latest
totalSteps=3
imageFullName=$repositoryName:$tag

//exit on any error
set -e

echo [STARTING] building $imageFullName...

echo [Step 1/$totalSteps] creating jar...
(exec "${BASH_SOURCE%/*}/../gradlew" bootJar )

echo [Step 2/$totalSteps] creating docker image...
docker build -t $imageFullName .

echo [Step 3/$totalSteps] pushing image...
docker push $imageFullName

echo [FINISHED]