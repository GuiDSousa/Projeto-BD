--Consulta 1: Jogo com a maior nota de um determinado genero em uma determinada plataforma
SELECT
  j.* FROM crypta_nostalgica.Jogo j 
JOIN
  crypta_nostalgica.jogo_genero jg ON j.titulo_jogo = jg.titulo_jogo 
JOIN
  crypta_nostalgica.Genero g ON jg.id_genero = g.id_genero 
JOIN
  crypta_nostalgica.Jogo_plataforma jp ON j.titulo_jogo = jp.titulo_jogo 
JOIN
  crypta_nostalgica.Plataforma p ON jp.id_plataforma = p.id_plataforma 
WHERE
  g.nome_genero = ? AND p.nome_plataforma = ? 
ORDER BY
  j.nota_critica DESC LIMIT 1;

--Consulta 2: Jogos de uma produtora especifica para uma plataforma especifica e de um genero especifico
SELECT
  j.* FROM crypta_nostalgica.Jogo j
JOIN
  crypta_nostalgica.jogo_genero jg ON j.titulo_jogo = jg.titulo_jogo
JOIN
  crypta_nostalgica.Genero g ON jg.id_genero = g.id_genero
JOIN
  crypta_nostalgica.Jogo_plataforma jp ON j.titulo_jogo = jp.titulo_jogo
JOIN
  crypta_nostalgica.Plataforma p ON jp.id_plataforma = p.id_plataforma
WHERE
  j.produtora = ? AND p.nome_plataforma = ? AND g.nome_genero = ?;

--Consulta 3: Numero de jogos por genero em uma determinada plataforma
SELECT 
  g.nome_genero, COUNT(*) as count FROM crypta_nostalgica.Jogo j
JOIN 
  crypta_nostalgica.jogo_genero jg ON j.titulo_jogo = jg.titulo_jogo
JOIN 
  crypta_nostalgica.Genero g ON jg.id_genero = g.id_genero
JOIN
  crypta_nostalgica.Jogo_plataforma jp ON j.titulo_jogo = jp.titulo_jogo
JOIN
  crypta_nostalgica.Plataforma p ON jp.id_plataforma = p.id_plataforma
WHERE
  p.nome_plataforma = ?
GROUP BY
  g.nome_genero;

--Consulta 4: Top 5 jogos mais bem avaliados pela critica
SELECT
  j.* FROM crypta_nostalgica.Jogo j 
ORDER BY
  j.nota_critica DESC LIMIT 5;