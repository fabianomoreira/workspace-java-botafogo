-- Primeiro grupo de comandos INSERT
INSERT INTO tarefas(descricao, prazo) VALUES('Comprar pão', 1);
INSERT INTO tarefas(descricao, prazo) VALUES('Reprovar alunos', 5);
INSERT INTO tarefas(descricao, prazo) VALUES('Pedir almoço', 2);
INSERT INTO tarefas(descricao, prazo) VALUES('Escovar os dentes', 1);
INSERT INTO tarefas(descricao, prazo) VALUES('Ligar para o médico', 1);
INSERT INTO tarefas(descricao, prazo) VALUES('Agendar revisão do carro', 1);
INSERT INTO tarefas(descricao, prazo) VALUES('Comprar ingresso para o cinema', 1);
INSERT INTO tarefas(descricao, prazo) VALUES('Ligar para minha mãe', 1);
INSERT INTO tarefas(descricao, prazo) VALUES('Pagar os pedreiros', 1);
INSERT INTO tarefas(descricao, prazo) VALUES('Comprar material da obra', 1);

-- Exemplo a pedido
INSERT INTO tarefas(descricao, prazo, finalizada) 
	 VALUES
     ('Criar exemplo de SQL', 1, true);

-- Atualização de um registro
UPDATE tarefas SET finalizada = TRUE WHERE id = 5;