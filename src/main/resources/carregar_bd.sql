-- Carga de tabelas do BD (para ambiente DES)

-- Tabelas de domínio

-- Cliente
INSERT INTO cliente (id, nome, cpf) VALUES (1, 'Jose', `12345678901`);
INSERT INTO cliente (id, nome, cpf) VALUES (2, 'Maria', `12345678902`);
INSERT INTO cliente (id, nome, cpf) VALUES (3, 'Marta', `23456123456`);
INSERT INTO cliente (id, nome, cpf) VALUES (4, 'Carlos', `98789087654`);
INSERT INTO cliente (id, nome, cpf) VALUES (5, 'Juca', `84754832109`);

-- Produto
INSERT INTO produto (id, nome, valor, quantidade) VALUES (1, 'Telefone', 100.0, 10);
INSERT INTO produto (id, nome, valor, quantidade) VALUES (2, 'Televisao', 350.0, 8);
INSERT INTO produto (id, nome, valor, quantidade) VALUES (3, 'Radio', 50.0, 20);
INSERT INTO produto (id, nome, valor, quantidade) VALUES (5, 'Par de Meia', 10.0, 30);
