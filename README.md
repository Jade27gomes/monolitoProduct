<div align="center">

# SpringBoot API REST - CRUD
### Modelo de Rotas Spring
*Projeto de estudo desenvolvido com Java 21 + Spring Boot 3*

![Java](https://img.shields.io/badge/Java-21-orange?style=flat-square&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=flat-square&logo=springboot)

</div>

---

## Endpoints

Base URL: `/produtos`

| Método | Rota | Descrição | Status |
|--------|------|-----------|--------|
| GET | `/produtos` | Lista todos os produtos | 200 OK |
| POST | `/produtos` | Cria um novo produto | 201 Created |
| PUT | `/produtos/{id}` | Atualiza um produto existente | 201 Created |
| DELETE | `/produtos/{id}` | Remove um produto | 204 No Content |

---

## Exemplo de payload

**POST / PUT** `/produtos`

```json
{
  "name": "Notebook Pro",
  "description": "Notebook de alta performance",
  "price": 4999.90
}
```

---

## Estrutura do projeto

```
src/
└── main/java/com/monolito/mvc/
    ├── config/
    ├── controller/   productControler.java
    ├── database/
    │   ├── dto/      ProdutoDTO.java
    │   └── model/    Produto.java
    ├── exception/
    ├── handler/
    ├── service/      ProductService.java
    └── utils/
    
```

---

## Como executar

```bash
./mvnw spring-boot:run
```

A aplicação sobe em `http://localhost:8080`
```
