CREATE TABLE users
(
    id SERIAL PRIMARY KEY,
    name varchar(100) NOT NULL,
    salary float(10) DEFAULT NULL
);

select * from users;


CREATE OR REPLACE FUNCTION LAST_INSERT_ID()
  RETURNS integer AS
$func$
BEGIN
RETURN (SELECT max(id) from users);
END
$func$  LANGUAGE plpgsql;


select LAST_INSERT_ID();