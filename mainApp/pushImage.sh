#!/bin/bash
set -e

repositoryName=613445080628.dkr.ecr.us-east-2.amazonaws.com/mainapp
tag=latest
imageFullName=$repositoryName:$tag

echo [Main app STARTING] building $imageFullName...

echo [Main app] pushing image...
docker push $imageFullName

echo [Main app FINISHED]