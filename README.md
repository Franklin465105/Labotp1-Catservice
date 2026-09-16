Catalog Service

The Catalog Service is responsible for storing and managing products. For this lab, the products are stored temporarily in a Java List and there is no database yet.

Port

The Catalog Service runs on:
http://localhost:8081

Endpoints
Get all products

GET /products
Returns all products currently stored in the service.

Create a product
POST /products

Example request:
{
  "name": "USB-C Dock",
  "price": 89.99
}
The service automatically gives each product an ID.

Swagger

Swagger UI is available at:
http://localhost:8081/swagger-ui/index.html

Project Structure
model - contains the Product class
service - contains the product service and temporary product list
controller - contains the REST endpoints
Other Service
The Order Service is a separate microservice and has its own GitHub repository.

At the moment, the Catalog Service does not communicate with the Order Service.

Current Version

This is Lab 1, so the service currently uses temporary in-memory storage. A database will be added in a later week.
