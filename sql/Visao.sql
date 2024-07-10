--uma tabela com o nome do jogo, genero, plataforma e nota da critica
CREATE VIEW JogoGeneroPlataformaNota AS
SELECT 
    j.titulo_jogo AS nome_jogo,
    g.nome_genero AS genero,
    p.nome_plataforma AS plataforma,
    j.nota_critica AS nota_critica
FROM 
    Jogo j
JOIN 
    jogo_genero jg ON j.titulo_jogo = jg.titulo_jogo
JOIN 
    Genero g ON jg.id_genero = g.id_genero
JOIN 
    Jogo_plataforma jp ON j.titulo_jogo = jp.titulo_jogo
JOIN 
    Plataforma p ON jp.id_plataforma = p.id_plataforma;

--SELECT * FROM JogoGeneroPlataformaNota;

--Numero total de avaliacoes e nota media dos usuarios para cada jogo
CREATE VIEW AvaliacoesMediaNotaPorJogo AS
SELECT 
    j.titulo_jogo AS nome_jogo,
    COUNT(a.id_avaliacao) AS total_avaliacoes,
    AVG(a.nota_usuario) AS media_nota_usuario
FROM 
    Jogo j
LEFT JOIN 
    Avaliacao a ON j.titulo_jogo = a.titulo_jogo
GROUP BY 
    j.titulo_jogo;

--SELECT * FROM AvaliacoesMediaNotaPorJogo;

--Quantidade de jogos por plataforma e por genero
CREATE VIEW QuantidadeJogosPorPlataformaEGenero AS
SELECT 
    p.nome_plataforma AS plataforma,
    g.nome_genero AS genero,
    COUNT(j.titulo_jogo) AS quantidade_jogos
FROM 
    Jogo j
JOIN 
    Jogo_plataforma jp ON j.titulo_jogo = jp.titulo_jogo
JOIN 
    Plataforma p ON jp.id_plataforma = p.id_plataforma
JOIN 
    jogo_genero jg ON j.titulo_jogo = jg.titulo_jogo
JOIN 
    Genero g ON jg.id_genero = g.id_genero
GROUP BY 
    p.nome_plataforma, g.nome_genero;

--SELECT * FROM QuantidadeJogosPorPlataformaEGenero;
