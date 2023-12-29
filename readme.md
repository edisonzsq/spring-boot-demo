# Setup Instructions

## Databases

There is no need to setup database now because it is containerized. Yippeeee~~!

## Run docker compose

Navigate to the same directory as `docker-compose.yml` file and run the following command:

```sh
docker compose up
```

If you change any code/content, use the `--build` flag:

```sh
docker compose up --build
```

## Endpoints

- GET /book will return an array of books
- POST /book with request body 

```json
{
  "id": 1,
  "title": "Book B",
  "author": "Peter",
  "publishedDate": "2021-01-01"
}
```

See the RestController class file [here](./src/main/java/com/example/demo/controller/BookController.java).