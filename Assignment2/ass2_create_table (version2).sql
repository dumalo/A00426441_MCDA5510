drop table transaction;

CREATE TABLE IF NOT EXISTS transaction (
    ID INT NOT NULL,
    NameOnCard VARCHAR(256) NOT NULL,
    CardNumber VARCHAR(45) NOT NULL,
    UnitPrice DECIMAL(10,2) NOT NULL,
    Quantity INT(11) NOT NULL,
    TotalPrice DECIMAL(10,2) NOT NULL,
    ExpDate VARCHAR(16),
    CreatedOn DATETIME NOT NULL,
    CreatedBy VARCHAR(45) NOT NULL,
    PRIMARY KEY (ID)
)  ENGINE=INNODB;

insert into transaction values (1, 'Joe Smith', 123, 1.5, 2, 3.0, '2022-10-31', now(), 'Cashier 11');

select * from transaction;

insert into assignment2_5510.transaction (ID, NameOnCard, CardNumber, UnitPrice, Quantity, TotalPrice, ExpDate, CreatedOn, CreatedBy) values (3711,'Puddy',11,5.0,10,50.0,"test date",'2018-11-16 11:00:00.0',"Elaine");

UPDATE assignment2_5510.transaction set NameOnCard = "Duane", CardNumber = 11, UnitPrice = 5.0, Quantity = 10, TotalPrice = 50.0, ExpDate = "test date", CreatedOn = '2018-11-16 11:00:00.0', CreatedBy = "Elaine" WHERE ID = 3711;