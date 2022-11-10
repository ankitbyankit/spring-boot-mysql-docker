# spring-boot-mysql-docker

Pre-requiste
1) Docker
2) Maven
3) Postman or insomina (tool to execute API call)
4) Mysql docker image (official docker image can be downloaded form dockerhub. I have used tag 5.7 to pull docker image)
5) Mysql workbench (can be downloaded from oracle website)


Steps to containerrize and run the application
1) Ensure you have downloaded mysql image (mysql:5.7)
2) open terminal
3) navigate to directory containing docker-compose.dev.yml
4) use "docker-compose -f docker-compose.dev.yml up --build" command

Note: you need to change the first half of the volumes in docker-compose.dev.yml to your local machines path.

Access mysql db from mysql workbench
use port: 3306
user: root
password: admin
Db name: EmployeeDB

Topics covered in POC
1) Docker
2) Mysql
3) Spring Boot, JPA
