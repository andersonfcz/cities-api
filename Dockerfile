FROM postgres
EXPOSE 5432
ENV POSTGRES_PASSWORD admin
ENV POSTGRES_DB Cities_DB

COPY ./sql/sql-paises-estados-cidades/PostgreSQL/pais.sql /docker-entrypoint-initdb.d/pais.sql
COPY ./sql/sql-paises-estados-cidades/PostgreSQL/estado.sql /docker-entrypoint-initdb.d/estado.sql
COPY ./sql/sql-paises-estados-cidades/PostgreSQL/cidade.sql /docker-entrypoint-initdb.d/cidade.sql
