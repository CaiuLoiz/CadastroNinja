-- V2: Migrations para adicionar a coluna de RANK na tabela de cadastros
-- Só pode ser feita uma alteração na tabela por arquivo, caso precise adicionar outra coluna é preciso criar um novo arquivo
ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);