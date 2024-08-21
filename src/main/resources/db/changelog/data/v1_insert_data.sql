-- liquibase formatted sql

-- changeset liquibase:2

INSERT INTO sk_example_table (obj)
VALUES ('{"current":0}'::JSONB);