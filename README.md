# spring-boot-jwt-demo2

### Things todo list

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-jwt-demo2.git`
2. Navigate to the folder: `cd spring-boot-jwt-demo2`
3. Replace MySQL credentials with your own.
4. Run the application: `mvn clean spring-boot:run`
5. Open your POSTMAN APP then import the POSTMAN Collection

### Image Screen shots

All API Request

![All API Request](img/all.png "All API Request")

Get Token

![Get Token](img/get_token.png "Get Token")
```shell
curl --location --request POST 'localhost:8080/api/login' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'username=naruto' \
--data-urlencode 'password=1234'
```

Get Refresh Token

![Get Refresh Token](img/refresh.png "Get Refresh Token")

```shell
curl --location --request GET 'localhost:8080/api/token/refresh' \
--header 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJuYXJ1dG8iLCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjgwODAvYXBpL2xvZ2luIiwiZXhwIjoxNjQ5MzA2ODU2fQ.z5Q1iduLaE7fW9Qoq3_CtURgIFQ3RI3fsj054NGGNT4'
```

List All Users

![List All Users](img/list.png "List All Users")

```shell
curl --location --request GET 'localhost:8080/api/users' \
--header 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJuYXJ1dG8iLCJyb2xlcyI6WyJST0xFX0FETUlOIiwiUk9MRV9TVVBFUl9BRE1JTiJdLCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjgwODAvYXBpL2xvZ2luIiwiZXhwIjoxNjQ5MzA1NjU2fQ.jXXDW8yJMQL4m-z4u42JTbuPskaQpGxCPAwhF2cK48M'
```

Add New User

![Add New User](img/add.png "Add New User")

```shell
curl --location --request POST 'localhost:8080/api/users' \
--header 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJuYXJ1dG8iLCJyb2xlcyI6WyJST0xFX0FETUlOIiwiUk9MRV9TVVBFUl9BRE1JTiJdLCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjgwODAvYXBpL2xvZ2luIiwiZXhwIjoxNjQ5MzA0MTc2fQ.b-E7pvPi3Z3rAKZRHbEv_oztbcGAufLBbEY91rPTwLM' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Uchiha Madara",
    "username": "madara",
    "password": "1234",
    "roles": null
}'
```

Add Role to User

![Add Role to User](img/add_role.png "Add Role to User")

```shell
curl --location --request POST 'localhost:8080/api/role/addtouser' \
--header 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJuYXJ1dG8iLCJyb2xlcyI6WyJST0xFX0FETUlOIiwiUk9MRV9TVVBFUl9BRE1JTiJdLCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjgwODAvYXBpL2xvZ2luIiwiZXhwIjoxNjQ5MzA0OTA3fQ.fbs2_ReLLTqFMy5HYyOYuknRXxOSQd1YN8Ypgf-HW-8' \
--header 'Content-Type: application/json' \
--data-raw '{
    "username": "madara",
    "roleName": "ROLE_USER"
}'
```

Token Expired

![Token Expired](img/role.png "Token Expired")
