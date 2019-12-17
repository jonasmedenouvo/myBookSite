start transaction; 
drop schema if exists myBooksite;
Create schema if not exists myBooksite;
use myBooksite;


-- create table --
CREATE TABLE assassin_royal (
    tome_Number INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(50),
    link_Url TEXT,
    author VARCHAR(30)
);

-- inserts --

insert into assassin_royal(title,link_Url,author) values ("L'Apprenti Assassin",
"http://91.165.206.133:44656/share/P9Z-ZRTsRjiQKBMo/Robin%20Hobb%20-%20L'Assassin%20Royal%20-1-%20L'Apprenti%20Assassin.pdf","Robin HOBB"),
("L'Assassin du roi",
"http://91.165.206.133:44656/share/BBsDFt-aNGbwfBt1/Robin%20Hobb%20-%20L'Assassin%20Royal%20-2-%20L'Assassin%20du%20Roi.pdf","Robin HOBB"),
("La Nef du crépuscule",
"http://91.165.206.133:44656/share/J5XDRylJa_mOuOOj/Robin%20Hobb%20-%20L'Assassin%20Royal%20-3-%20La%20Nef%20du%20Cr%C3%A9puscule.pdf","Robin HOBB"),
("Le Poison de la vengeance",
"http://91.165.206.133:44656/share/F-5KI871IZ6qAvXY/Robin%20Hobb%20-%20L'Assassin%20Royal%20-4-%20Le%20Poison%20de%20la%20Vengeance.pdf","Robin HOBB"),
("La Voie magique",
"http://91.165.206.133:44656/share/AV9dU1nLDYTy-LGH/Robin%20Hobb%20-%20L'Assassin%20Royal%20-5-%20La%20Voie%20Magique.pdf","Robin HOBB"),
("La Reine solitaire",
"http://91.165.206.133:44656/share/cjzaE8GaIQxB5Dpm/Robin%20Hobb%20-%20L'Assassin%20Royal%20-6-%20La%20Reine%20Solitaire.pdf","Robin HOBB"),
("Le Prophète blanc",
"http://91.165.206.133:44656/share/AmDKxaj8f_LblXDu/Robin%20Hobb%20-%20L'Assassin%20Royal%20-7-%20Le%20Proph%C3%A8te%20Blanc.pdf","Robin HOBB"),
("La Secte maudite",
"http://91.165.206.133:44656/share/JMOSS44il5K3sBKl/Robin%20Hobb%20-%20L'Assassin%20Royal%20-8-%20La%20Secte%20Maudite.pdf","Robin HOBB"),
("Les Secrets de Castelcerf",
"http://91.165.206.133:44656/share/w46qC9PgnBdy1a93/Robin%20Hobb%20-%20L'Assassin%20Royal%20-9-%20Les%20Secrets%20de%20Castelcerf.pdf","Robin HOBB"),
("Serments et deuils",
"http://91.165.206.133:44656/share/3jaLtOgGDo-5hlqE/Robin%20Hobb%20-%20L'Assassin%20Royal%20-10-%20Serments%20_%20Deuils.pdf","Robin HOBB"),
("Le Dragon des glaces",
"http://91.165.206.133:44656/share/0ZHe5o1P1YcVJhkp/Robin%20Hobb%20-%20L'Assassin%20Royal%20-11-%20Le%20Dragon%20des%20Glaces.pdf","Robin HOBB"),
("L'Homme noir",
"http://91.165.206.133:44656/share/E4JlicCcUl4KWjja/Robin%20Hobb%20-%20L'Assassin%20Royal%20-12-%20L'Homme%20Noir.pdf","Robin HOBB"),
("Adieux et retrouvailles",
"http://91.165.206.133:44656/share/G0BqrtKYmqNX90qQ/Robin%20Hobb%20-%20L'Assassin%20Royal%20-13-%20Adieux%20et%20Retrouvailles.pdf","Robin HOBB");

select * from assassin_royal;