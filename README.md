# Restful Web Services

### Created Quick API for Users and Posts
#### Users
- POST: create a single user  - '/jpa/users'
- GET: retrieve a single user  - '/jpa/users/{id}'
- GET: retrieve all users     - '/jpa/users/'
- DELETE: delete a user       - '/jpa/users/{id}'

#### Posts
- GET: get all posts for a user -  'jpa/users/{id}/posts'
- POST: create post for a user  - 'jpa/users/{id}/posts'

---

### Helpful Tips
Lombok dependency: 
```
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.18</version>
    <scope>provided</scope>
</dependency>
```
for the @Data annotation as shown below for getters and setters!!
```
@Data
public class User {}
```
