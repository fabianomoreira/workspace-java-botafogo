CREATE DATABASE gerenciador;

USE gerenciador;

CREATE TABLE tarefas(
	id INT AUTO_INCREMENT NOT NULL,
    descricao VARCHAR(30) NOT NULL,
    prazo INT NOT NULL,
    finalizada BOOLEAN DEFAULT FALSE,
    PRIMARY KEY(id)
);