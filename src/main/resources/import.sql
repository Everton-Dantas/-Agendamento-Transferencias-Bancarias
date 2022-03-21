--Inserindo clientes
INSERT INTO tb_cliente(nome, cpf, data_nascimento) VALUES ('Marcele Brito Figueiras','551.082.319-46','1980-08-10')
INSERT INTO tb_cliente(nome, cpf, data_nascimento) VALUES ('Thiarles Annunziato Zava','124.163.552-87','2000-06-13')
INSERT INTO tb_cliente(nome, cpf, data_nascimento) VALUES ('Augusto Amorin Gomes','342.818.802-08','1942-09-14')

--Inserindo uma conta, que precisa de um cliente
INSERT INTO tb_conta(id_cliente, agencia, n_conta, exclusive, saldo) VALUES (3, '007','5369-0', true, 1000.00)
INSERT INTO tb_conta(id_cliente, agencia, n_conta, exclusive, saldo) VALUES (1, '007','1773-7', false, 630.00)
INSERT INTO tb_conta(id_cliente, agencia, n_conta, exclusive, saldo) VALUES (2, '007','9234 -9', false, 350.00)

--Inserindo uma movimentação
INSERT INTO tb_transacao(data_movimentacao, operacao, valor, id_conta ) VALUES( '2022-01-14',0,100.00,1)
INSERT INTO tb_transacao(data_movimentacao, operacao, valor, id_conta ) VALUES( '2022-01-14',1,200.00,1)