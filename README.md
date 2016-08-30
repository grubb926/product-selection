## product-selection

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

## Prerequisities

* Java 8+
* Maven 3+


## Building the project

From the command line: mvn clean install


## Running the project

Options:

1) This project utilises spring boot with an embedded tomcat server so you can run it from the command line using: mvn clean spring-boot:run

2) A WAR file has been provided if you would prefer to deploy the application manually.

Once running open a browser and go to localhost:8080/product-selection

A default cookie (customerId) has been set with the value 001 this is the LIVERPOOL user, there is also:

- 002 for LONDON
- 003 ser to CHESTER (this will only bring back the all location products)

To change the cookie open the browser's developer tools (F12 or ctrl-shit-j for Chrome) and in the console enter document.cookie="customerId={customerId}" to change

## Notes

For this project I have used:

Spring Boot, Spring MVC and Angularjs.

I was unable get the selected products to display, however I have now realised that I could have used a service to store the data
between views.