--uma tabela com o nome do jogo, genero, plataforma e nota da critica
CREATE VIEW crypta_nostalgica.JogoGeneroPlataformaNota AS
SELECT 
    j.titulo_jogo AS nome_jogo,
    g.nome_genero AS genero,
    p.nome_plataforma AS plataforma,
    j.nota_critica AS nota_critica
FROM 
    crypta_nostalgica.Jogo j
JOIN 
    jogo_genero jg ON j.titulo_jogo = jg.titulo_jogo
JOIN 
    crypta_nostalgica.Genero g ON jg.id_genero = g.id_genero
JOIN 
    crypta_nostalgica.Jogo_plataforma jp ON j.titulo_jogo = jp.titulo_jogo
JOIN 
    crypta_nostalgica.Plataforma p ON jp.id_plataforma = p.id_plataforma;

--SELECT * FROM crypta_nostalgica.JogoGeneroPlataformaNota;

--Numero total de avaliacoes e nota media dos usuarios para cada jogo
CREATE VIEW crypta_nostalgica.AvaliacoesMediaNotaPorJogo AS
SELECT 
    j.titulo_jogo AS nome_jogo,
    COUNT(a.id_avaliacao) AS total_avaliacoes,
    AVG(a.nota_usuario) AS media_nota_usuario
FROM 
    crypta_nostalgica.Jogo j
LEFT JOIN 
    crypta_nostalgica.Avaliacao a ON j.titulo_jogo = a.titulo_jogo
GROUP BY 
    j.titulo_jogo;

--SELECT * FROM crypta_nostalgica.AvaliacoesMediaNotaPorJogo;

--Quantidade de jogos por plataforma e por genero
CREATE VIEW crypta_nostalgica.QuantidadeJogosPorPlataformaEGenero AS
SELECT 
    p.nome_plataforma AS plataforma,
    g.nome_genero AS genero,
    COUNT(j.titulo_jogo) AS quantidade_jogos
FROM 
    crypta_nostalgica.Jogo j
JOIN 
    crypta_nostalgica.Jogo_plataforma jp ON j.titulo_jogo = jp.titulo_jogo
JOIN 
    crypta_nostalgica.Plataforma p ON jp.id_plataforma = p.id_plataforma
JOIN 
    crypta_nostalgica.jogo_genero jg ON j.titulo_jogo = jg.titulo_jogo
JOIN 
    crypta_nostalgica.Genero g ON jg.id_genero = g.id_genero
GROUP BY 
    p.nome_plataforma, g.nome_genero;

--SELECT * FROM crypta_nostalgica.QuantidadeJogosPorPlataformaEGenero;
