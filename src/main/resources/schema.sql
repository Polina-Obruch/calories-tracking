CREATE TABLE IF NOT EXISTS USERS
(
    id         BIGSERIAL PRIMARY KEY,
    name       VARCHAR(200) NOT NULL ,
    email      VARCHAR(254) NOT NULL UNIQUE,
    age        INT2 NOT NULL,
    weight     NUMERIC(4,1) NOT NULL,
    height     INT2 NOT NULL,
    goal       VARCHAR(15) NOT NULL,
    gender     VARCHAR(15) NOT NULL,
    BMR        INT2 NOT NULL
);