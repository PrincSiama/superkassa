-- liquibase formatted sql

-- changeset liquibase:1

CREATE TABLE sk_example_table (
    id SERIAL,
    obj JSONB NOT NULL,
    PRIMARY KEY(id)
);