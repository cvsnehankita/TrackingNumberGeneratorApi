# TrackingNumberGeneratorApi : Scalable Tracking Number Generator API
A Springboot Restful Api implementation to generates unique tracking numbers for parcels for Springboot demo


## This is a simple Spring Boot Maven application that designs and implements a functionality of generating unique tracking numbers for parcels. This is generates unique tracking numbers for parcels.

API Details
GeneratorApplication: Main starting point of the applictaion.
#### *1 TrackingApiController*: Main controller implementation for the GET (/next-tracking-number) api that accepts Tracking request details and generates the tracking id for the requested parcel details.
#### *2 TrackingApiService:* The controllers calls the Service class to provide the implementation.
#### *3 TrackingNumberRequest:* Request entity of the parcel request
#### *4 TrackingNumberResponse:* API response to be shared
#### *5JPAConfig:* COnfiguration calss
#### *6 CountryRepository:* Country code and country name mapping entity. Stored in the H2 database by default.
#### *7 CountryRepository:* JPA repository for the country entity.
#### *8 TrackingNumberRepository:* JPA repository for the TrackingNumberRequest.
#### *9 application.properties:* Resource for the H2 in-memory database details and actuator endpoints details to perform the application health check.

Please check the Postman/Jwt_Backend_Api.postman_collection for api testing.

Technologies Used
JAVA JDK 24 as latest JDK release version, Spring Boot (for backend), Maven (for Dependency management), H2 Database (for local development), Spring Data JPA (for data persistence) Spring Actuator for Application healthcheck.

Deployment Platforms and Google login platform
Heroku is used for Backend deployment, ("https://dashboard.heroku.com")
Netlify is used for Frontend deployment, ("https://app.netlify.com")
Google Authentication, ("https://console.cloud.google.com")
API Url: Local Env
Local: Backend

http://localhost:8080/actuator
http://localhost:8080/actuator/health
http://localhost:8080/next-tracking-number?origin_country_id=IN&destination_country_id=US&weight=56&created_at=&customer_id=de619854-b59b-425e-9db4-943979e1bd49&customer_name=RedBox Logi&customer_slug=redbox-logistics&created_by=Sneha

Backend is deployed on Heroku for testing

http://localhost:8080/actuator
http://localhost:8080/actuator/health
http://localhost:8080/country/add
http://localhost:8080/country/get/IN
http://localhost:8080/next-tracking-number?origin_country_id=IN&destination_country_id=US&weight=56&created_at=&customer_id=de619854-b59b-425e-9db4-943979e1bd49&customer_name=RedBox Logi&customer_slug=redbox-logistics&created_by=Sneha

Repository
Please clone the repository from: "https://github.com/cvsnehankita/TrackingNumberGeneratorApi".

Prerequisites
JDK 24
Maven (3.9.9)
IntelliJ IDEA IDE 4 H2 Database (In-memory database)
Postman (for making HTTP requests)

Contact
Your suggestions are always welcome as "cvsnehankita@gmail.com".