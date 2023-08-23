# CBFD User Guide

## Running
The Docker image containing the application is available in the AWS ECR.  Running is as simple as pulling the image and running it:
- docker pull public.ecr.aws/j1x3h2j4/cbfd
- docker run cbfd-app chipotle visaxxx burrito,guac

## Building
If you clone this repo locally you can build the .jar file and Docker image yourself:
- git clone https://github.com/cnelson0641/CoderByteFoodDelivery
- cd CoderByteFoodDelivery/lib/cbfd-app
- mvn package  # to build the .jar
- docker build -t cbfd-app ..  # to build the dockerfile
