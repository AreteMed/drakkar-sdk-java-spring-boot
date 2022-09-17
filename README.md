# A SpringBoot sample using "Drakkar Telehealth SDK (Java/Kotlin)"

## Overview
This Projects serves like a Guide for Developers for an easy way to embed the "Drakkar Telehealth SDK" into an existing Spring Boot Project

## Quick Setup of this Project
##### Specify Token here
```
src/main/resources/application.yml
```
##### Build
```
./gradlew build
```
##### Run
```
./gradlew bootRun
```
##### Enjoy
Go to any WebAPI Testing utility like Postman, Insomnia
```
http://localhost:8080/api/drakkar/sample/rooms
http://localhost:8080/api/drakkar/sample/rooms?limit=15&offset=5
http://localhost:8080/api/drakkar/sample/rooms/12345abcde-12345abcde-12345abcde-12345abcde-12345abcde
http://localhost:8080/api/drakkar/sample/encounters
http://localhost:8080/api/drakkar/sample/encounters?limit=15&offset=5
etc.
```