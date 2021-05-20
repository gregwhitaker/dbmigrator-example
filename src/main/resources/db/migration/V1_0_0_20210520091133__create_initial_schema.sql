-- Script: V1_0_0_20210520091133__create_initial_schema.sql
-- Description: Create Initial Schema

CREATE TABLE metadata_type (
  id            BIGSERIAL       PRIMARY KEY,
  type_name     VARCHAR(255)    NOT NULL,
  type_value    VARCHAR(255)    NOT NULL
);

CREATE TABLE metadata (
  id                BIGSERIAL       PRIMARY KEY,
  metadata_value    VARCHAR(255)    NOT NULL,
  metadata_type     INT             NOT NULL REFERENCES metadata_type(id),
  modified_on       TIMESTAMP       NOT NULL DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO metadata_type (id, type_name, type_value) VALUES (1, 'type1', 'type1Value');
INSERT INTO metadata_type (id, type_name, type_value) VALUES (2, 'type2', 'type2Value');
INSERT INTO metadata_type (id, type_name, type_value) VALUES (3, 'type3', 'type3Value');
