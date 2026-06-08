# Database
```
   docker run --name postgres-shardbills -p 5432:5432 -e POSTGRES_USER={user} -e POSTGRES_PASSWORD={pass} -e POSTGRES_ROOT_PASSWORD={pass} -e TZ=America/Fortaleza -d postgres:latest
```