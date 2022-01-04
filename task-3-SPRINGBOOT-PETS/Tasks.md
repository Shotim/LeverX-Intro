<h1> LeverX Sprint Boot Task </h1>

<h2> Important information: </h2>

1. You can find some useful materials in [Materials.md](/task-3-SPRINGBOOT-PETS/materials/Materials.md).
2. Pay attention to the file [Self-check.md](/task-3-SPRINGBOOT-PETS/Self-check.md).
3. You are able to use *Lombok* and *other libraries* you think you need.
4. It's convenient to use the following service to compose and share database schemas: https://dbdiagram.io/home
5. Check Markdown in [Materials.md](/task-3-SPRINGBOOT-PETS/materials/Materials.md) for writing a nice documentation.
6. Read about **HTTP response status codes**.

<h2> Requirements: </h2>

1. You have to implement task given below using **Java 8+**.
2. You need to install [Maven](https://maven.apache.org/) for implementing this task.
3. Use any **relational database**.
   We can recommend using Postgres, but your choice is up to you.
4. Use [Postman](https://www.postman.com/) to interact with your application and check API endpoints.
   **Save your API collection** and stick it to the project
   (either as a link at README.md or as a file in directory 'postman' in the root of your project).
5. **Stick database schema** to README.md as pictures or as a link.
6. Feel free to place any important info in README.md.
7. Use **DTO objects** for transfer data from server to client and vise versa. (Check [Materials.md](/task-3-SPRINGBOOT-PETS/materials/Materials.md))
8. Use **Spring DATA JPA** for repositories layer.
9. Investigate **Hibernate Inheritance Strategies**. 
10. Be able to **explain** why you prefer one Hibernate inheritance strategy 
or another in your project.
11. Investigate **Hibernate Entity Lifecycle**.
12. Investigate **Spring Bean Scopes**.
13. Provide **validation** for the domain model
    and create **own exceptions** if your business logic requires it.
14. Create **dev and cloud profiles**.

<h2> Task "Pet service": </h2>

This is REST API application with the following **domain model**:
- Abstract `Pet`
- `Dog` that is inherited from `Pet`
- `Cat` that is inherited from `Pet`
- `Owner`. `Owner` could have a lot of `Pets` 

**Business logic**:
- CRUD for `Owner`, `Cat` and `Dog`
- `Owner` could pass away.
- `Pet` could pass away.
- If `Owner` dies all of his `Pets` die too.
- Possibility of exchange two `Pets` between two `Owners`.
  `Owners` as well as `Pets` **must be alive** for successful exchange.