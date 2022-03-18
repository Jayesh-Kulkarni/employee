Codegen using Open API Specs

The Open API Spec is available at   /src/main/resources/openapi.yml

The codegen will generate the model and api classes using the open api spec, after you run the maven build using 'mvn clean package' 

Post build you can see the files under /target/generated-sources/openapi/src/main/java/com/jayesh/rest

You can run the service using 'mvn spring-boot:run'

Once the service is started, you can use postman or any other suitable tool to test the following:

1. GET http://localhost:8080/employees 

2. POST http://localhost:8080/employees with a HTTP Body 
{
    "id": 10,
    "name": "Johny",
    "designation": "Teacher"
}

The swagger ui is available at http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config

You can change the default port 8080 to any port by adding the following in the application.properties file.
server.port={port-number} e.g. server.port=8761 

  
