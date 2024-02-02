# S3CUR1TY Spring boot OAuth2 
A sample project to practice Security in Spring Boot by implementing OAuth2 login using Github and Google as a resource server

# Application diagram

![computer](https://github.com/mjidelouss/S3CUR1TY/blob/main/oauth2-flow.png)

# Steps to create a gitHub application
- Go to GitHub developer portal
-  a new application and provide the required information
- Set the homepage URL to http://localhost:8080
- Authorization callback URL to http://localhost:8080/login/oauth2/code/github.
- Update the application.yml file
After creating a new application, you will a client ID and a client secret. Copy this two information and paste the in the application.yml file
The same basics are used for Google.

# Start the application and enjoy (-_-)