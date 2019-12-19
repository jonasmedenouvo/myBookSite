start transaction;
drop schema if exists myBooksite;
Create schema if not exists myBooksite;
use myBooksite;


-- create table --

CREATE TABLE author (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(30),
    last_name VARCHAR(30),
    nationality VARCHAR(30)
);

CREATE TABLE saga (
    id INT AUTO_INCREMENT PRIMARY KEY,
    saga_name VARCHAR(40),
    tome_Number INT,
    author INT,
    FOREIGN KEY (author)
        REFERENCES author (id)
);

CREATE TABLE book (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(50),
    link_Url TEXT,
    genre VARCHAR(40),
    author INT,
    saga INT,
    FOREIGN KEY (author)
        REFERENCES author (id),
    FOREIGN KEY (saga)
        REFERENCES saga (id)
);


-- ! Insert author --

insert into author (first_name,last_name, nationality) values ("Robin", "Hobb","USA");
insert into author (first_name,last_name, nationality) values ("Xin", "Feng","CN");
insert into saga (saga_name,tome_number, author) values ("L'assassin du Roi",13,1);
insert into saga (saga_name,tome_number, author) values ("The Strongest System",1159,2);

-- inserts --

insert into book(title,link_Url,genre,author,saga) values ("L'Apprenti Assassin",
"http://91.165.206.133:44656/share/P9Z-ZRTsRjiQKBMo/Robin%20Hobb%20-%20L'Assassin%20Royal%20-1-%20L'Apprenti%20Assassin.pdf","Fantasy",1,1),
("L'Assassin du roi",
"http://91.165.206.133:44656/share/BBsDFt-aNGbwfBt1/Robin%20Hobb%20-%20L'Assassin%20Royal%20-2-%20L'Assassin%20du%20Roi.pdf","Fantasy",1,1),
("La Nef du crépuscule",
"http://91.165.206.133:44656/share/J5XDRylJa_mOuOOj/Robin%20Hobb%20-%20L'Assassin%20Royal%20-3-%20La%20Nef%20du%20Cr%C3%A9puscule.pdf","Fantasy",1,1),
("Le Poison de la vengeance",
"http://91.165.206.133:44656/share/F-5KI871IZ6qAvXY/Robin%20Hobb%20-%20L'Assassin%20Royal%20-4-%20Le%20Poison%20de%20la%20Vengeance.pdf","Fantasy",1,1),
("La Voie magique",
"http://91.165.206.133:44656/share/AV9dU1nLDYTy-LGH/Robin%20Hobb%20-%20L'Assassin%20Royal%20-5-%20La%20Voie%20Magique.pdf","Fantasy",1,1),
("La Reine solitaire",
"http://91.165.206.133:44656/share/cjzaE8GaIQxB5Dpm/Robin%20Hobb%20-%20L'Assassin%20Royal%20-6-%20La%20Reine%20Solitaire.pdf","Fantasy",1,1),
("Le Prophète blanc",
"http://91.165.206.133:44656/share/AmDKxaj8f_LblXDu/Robin%20Hobb%20-%20L'Assassin%20Royal%20-7-%20Le%20Proph%C3%A8te%20Blanc.pdf","Fantasy",1,1),
("La Secte maudite",
"http://91.165.206.133:44656/share/JMOSS44il5K3sBKl/Robin%20Hobb%20-%20L'Assassin%20Royal%20-8-%20La%20Secte%20Maudite.pdf","Fantasy",1,1),
("Les Secrets de Castelcerf",
"http://91.165.206.133:44656/share/w46qC9PgnBdy1a93/Robin%20Hobb%20-%20L'Assassin%20Royal%20-9-%20Les%20Secrets%20de%20Castelcerf.pdf","Fantasy",1,1),
("Serments et deuils",
"http://91.165.206.133:44656/share/3jaLtOgGDo-5hlqE/Robin%20Hobb%20-%20L'Assassin%20Royal%20-10-%20Serments%20_%20Deuils.pdf","Fantasy",1,1),
("Le Dragon des glaces",
"http://91.165.206.133:44656/share/0ZHe5o1P1YcVJhkp/Robin%20Hobb%20-%20L'Assassin%20Royal%20-11-%20Le%20Dragon%20des%20Glaces.pdf","Fantasy",1,1),
("L'Homme noir",
"http://91.165.206.133:44656/share/E4JlicCcUl4KWjja/Robin%20Hobb%20-%20L'Assassin%20Royal%20-12-%20L'Homme%20Noir.pdf","Fantasy",1,1),
("Adieux et retrouvailles",
"http://91.165.206.133:44656/share/G0BqrtKYmqNX90qQ/Robin%20Hobb%20-%20L'Assassin%20Royal%20-13-%20Adieux%20et%20Retrouvailles.pdf","Fantasy",1,1);

insert into book(title,link_Url,genre,author,saga) values
("The Strongest System","https://drive.google.com/open?id=1XHB2robmtdlHyFL8R8Q5ZilLPbaSLMSZ","Xanxia",2,2);


SELECT
    *
FROM
    book
;
