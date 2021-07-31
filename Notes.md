1. Install Java
2. Install Eclipse and Sprint tool suit or IntellijIdea
3. Create Spring Boot project from Spring Initializer
4. Import the Maven Project into IDE
5. Create a Rest Controller class to implement the methods of service call
6. Create a resource representation Class/Bean for service
7. Implement Get mapping method and understand how response is mapped to Json from Ben class
8. Start the Sprint boot app (It comes with embedded Tomcat server)
9. Test the service
   Greeting API via postman
    http://localhost:8080/greeting?name=Deepa
10. download MySQL installer
    pin MySql jShell and mySql workbench to the task bar
11. Set up JPA Repository and its Mapping Beans (query methods)
12. Create Database and Table to add the data from Service
13. Define MySQL properties in Spring Boot application-properties file
    -spring.datasource.url = jdbc:mysql://localhost:3306/<database name>
14. Get JPA and MYSQL Dependencies in POM.xml
    -add maven dependency MySQL Connector/J to pom
15. Create mapping entry beans for the table which we need to map
    Class/Bean, @entity and @Table, @Column
16. Define Repository interface by extending JPA Repository interface
    - Add JPA Hibernate Properties into application- properties file
       spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect
    - Understand CRUD Operations of JPA Repository with example
