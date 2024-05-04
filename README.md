# BookManagementSystem

A Full-Stack application that demonstrates the CRUD operations using Angular, Spring Boot, Docker and PostgreSQL.

<p align="center">
  <img src="https://github.com/y-s18/BookManagementSystem/blob/Images/book-list.png" width=50% height=50%>
</p>

<p align="center">
  <img src="https://github.com/y-s18/BookManagementSystem/blob/Images/add-book.png" width=50% height=50%>
</p>

<p align="center">
  <img src="https://github.com/y-s18/BookManagementSystem/blob/Images/book-details.png" width=50% height=50%>
</p>

<p align="center">
  <img src="https://github.com/y-s18/BookManagementSystem/blob/Images/update-book.png" width=50% height=50%>
</p>

## Tools and Technologies used

### Frontend
* TypeScript 5.3.3
* Angular 17.0.9
* NodeJS 20.10.0

### Backend
* Java 17
* Spring boot 3.2.5
* PostgreSQL
* JPA
* Lombok
* Docker
* Maven

## Steps to install

### Backend

**1. Clone the application**

```bash
git clone https://github.com/y-s18/BookManagementSystem.git
```

**2. Change PostgreSQL Username and Password as per your PostgreSQL Installation**
	
+ open `backendbms/src/main/resources/application.properties` file.

+ change `spring.datasource.username` and `spring.datasource.password` as per your installation.

+ open `backendbms/docker-compose.yml` file.

+ change `services.db.environment.POSTGRES_USER` and `services.db.environment.POSTGRES_PASSWORD` as per your installation.

**3. Build the app with Compose**

Before building the app, make sure that Docker Desktop is installed and running.
You can build the app by typing the following command

```bash
docker compose -f "docker-compose.yml" up -d --build
```

Or by right clicking the `docker-compose.yml` file then clicking `Compose Up`

**4. Create a database**

Run the following command to list all running Docker containers

```bash
docker ps
```

You should see the name `postgres`. To enter the container, start a bash shell by running the following command

```bash
docker exec -it postgres bash
```

Execute the `psql` command along with the username to make a connection with the Postgres Database Server

```bash
psql -U root
```

Create the database `customer` by running the following command. Run `\l` to list the databases

```bash
CREATE DATABASE book;
```

If you named the database otherwise, open `backendbms/src/main/resources/application.properties` file and change `spring.datasource.url` to your database name instead of `book`.

Run the following command to establish a Connection With the database

```bash
\c book
```

Press `ctrl + d` to exit the shell


### Frontend
**1. Install NodeJS and Angular**

You can download NodeJS from [here](https://nodejs.org/en/download). Type `node -v` to check the version.

To install angular, run the following command.
```bash
npm install -g @angular/cli
```
You can specify the version by typing `@angular/cli@desired.version.here`. Run `ng v` to check the installed version.

## Run the application

### Run Spring Boot Application

Open `backendbms` folder in terminal then run the following command

```bash
mvn spring-boot:run
```

### Run Angular Client
Open `frontend` folder in terminal then run

```bash
ng serve -o
```