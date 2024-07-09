/* Execute o script a seguir para criar corretamente o esquema e as tabelas do Banco de Dados 
 para a aplicacao.*/


CREATE SCHEMA IF NOT EXISTS crypta_nostalgica --Criacao do esquema

/* Criacao das tabelas para o esquema "crypta_nostalgica"*/
CREATE TABLE IF NOT EXISTS crypta_nostalgica.Usuario_Usu_logado_Usu_admin (
    id_usuario SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    imag_usuario BYTEA,
    senha VARCHAR(64) NOT NULL,
    e_mail VARCHAR(250) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS crypta_nostalgica.Jogo (
    titulo_jogo VARCHAR(100) PRIMARY KEY,
    data_lancamento VARCHAR(64) NOT NULL,
    imag_jogo BYTEA NOT NULL,
    sinopse VARCHAR(600) NOT NULL,
    produtora VARCHAR(64) NOT NULL,
    nota_critica DOUBLE PRECISION NOT NULL,
    data_publicacao DATE UNIQUE NOT NULL,
    nota_media_usuario DOUBLE PRECISION NOT NULL,
    comentatio_critico varchar(600) NOT NULL
);

CREATE TABLE IF NOT EXISTS crypta_nostalgica.Avaliacao (
    id_avaliacao SERIAL PRIMARY KEY,
    id_usuario INTEGER NOT NULL,
    titulo_jogo VARCHAR(100) NOT NULL,
    comentario VARCHAR(600),
    nota_usuario DOUBLE PRECISION NOT NULL,
    FOREIGN KEY (titulo_jogo) REFERENCES crypta_nostalgica.Jogo(titulo_jogo),
    FOREIGN KEY (id_usuario) REFERENCES crypta_nostalgica.Usuario_Usu_logado_Usu_admin(id_usuario)
);

CREATE TABLE IF NOT EXISTS crypta_nostalgica.Escolha_jogo (
    id_escolha SERIAL PRIMARY KEY,
    titulo_jogo VARCHAR(100) NOT NULL,
    id_usuario INTEGER NOT NULL,
    FOREIGN KEY (titulo_jogo) REFERENCES crypta_nostalgica.Jogo(titulo_jogo),
    FOREIGN KEY (id_usuario) REFERENCES crypta_nostalgica.Usuario_Usu_logado_Usu_admin(id_usuario)
);

CREATE TABLE IF NOT EXISTS crypta_nostalgica.Genero (
    id_genero SERIAL PRIMARY KEY,
    nome_genero VARCHAR(300) NOT NULL
);

CREATE TABLE IF NOT EXISTS crypta_nostalgica.jogo_genero (
    id SERIAL PRIMARY KEY,
    titulo_jogo VARCHAR(100) NOT NULL,
    id_genero INTEGER NOT NULL,
    FOREIGN KEY (titulo_jogo) REFERENCES crypta_nostalgica.Jogo(titulo_jogo),
    FOREIGN KEY (id_genero) REFERENCES crypta_nostalgica.Genero(id_genero)
);

CREATE TABLE IF NOT EXISTS crypta_nostalgica.Plataforma (
    id_plataforma SERIAL PRIMARY KEY,
    nome_plataforma VARCHAR(64) NOT NULL,
);

CREATE TABLE IF NOT EXISTS crypta_nostalgica.Jogo_plataforma (
    id SERIAL PRIMARY KEY,
    id_plataforma INTEGER NOT NULL,
    titulo_jogo VARCHAR(100) NOT NULL,
    FOREIGN KEY (id_plataforma) REFERENCES crypta_nostalgica.Plataforma(id_plataforma),
    FOREIGN KEY (titulo_jogo) REFERENCES crypta_nostalgica.Jogo(titulo_jogo)
);