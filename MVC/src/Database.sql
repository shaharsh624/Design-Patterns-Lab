USE DMBS_LAB;

CREATE TABLE CARS (
    CAR_NAME VARCHAR(40),
    CAR_ENGINE VARCHAR(30)
);

INSERT INTO CARS (CAR_NAME, CAR_ENGINE)
VALUES ('Honda Civic', '1.5L'),
       ('Ford Mustang', 'V8'),
       ('Chevrolet Corvette', 'Supercharged V8')
;

SELECT * FROM CARS;