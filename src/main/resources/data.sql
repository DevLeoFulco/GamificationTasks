--Iniciando a tabela User

INSERT INTO users (id, matricula,senha,nome) VALUES (1,'LD001','senha01','Leo Fulco');
INSERT INTO users (id, matricula,senha,nome) VALUES (2,'ME001','senha01','Danilo Alves');
INSERT INTO users (id, matricula,senha,nome) VALUES (3,'GE001','senha01','Rannah Kimiko');
INSERT INTO users (id, matricula,senha,nome) VALUES (4,'JR001','senha01','Belle Legal');
INSERT INTO users (id, matricula,senha,nome) VALUES (5,'PL001','senha01','Yuri Sena');

--Iniciando informações para a tabela Card

INSERT INTO cards (id, status, descricao, nivel_complexidade, prazo_entrega, quantidade_pessoas, pontos) VALUES (1,'Disponivel','Implementar Autenticação','Médio','2024-05-31',5,10);
INSERT INTO cards (id, status, descricao, nivel_complexidade, prazo_entrega, quantidade_pessoas, pontos) VALUES (2,'Disponivel','Criar Pagina de Login','Facil','2024-05-28',2,5);


--Iniciando informações para a tabela de Commits

INSERT INTO commits (id, commit_hash, card_id) VALUES (1,'190495f',1);
INSERT INTO commits (id, commit_hash, card_id) VALUES (2,'158e147',2);