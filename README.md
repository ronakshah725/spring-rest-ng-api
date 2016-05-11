README.md

STACK

- Framework: Spring MVC, Spring REST HATEOAS and Spring Boot
- Database: H2 
- Persistence layer: Java Persistence with Hibernate
- Server: Apache Tomcat 8
- FrontEnd : Angular JS, Angular JS resource and, Twitter bootstrap
- Test: Junit, Spring MockMvc API
- Package Manager: Bower (front-end)
- Build: Apache Maven
- Source Control: Git

DEPLOYEMENT

- Public IP Address: http://vehiclesapi-ronakshah725.boxfuse.io:8080
- Deployed the webapp on Amazon EC2 Instance, Ubuntu Server
- Deployed by using BoxFuse, which helped automate the process and results in faster builds

STEPS TO RUN LOCALLY

Requirements : Java 1.8, Apache Maven, bower, an Internet connection

1. Download source code with $:git clone from https://github.com/ronakshah725/spring-rest-ng-api.git 
2. Load Front-end dependencis $:bower install
3. Build $:mvn clean package
4. Run $: cd target; java -jar vehicles-api-1.0.0.jar
5. Goto http://localhost:8080
6. Test the appliction by adding and, updating or deleting some vehicles

