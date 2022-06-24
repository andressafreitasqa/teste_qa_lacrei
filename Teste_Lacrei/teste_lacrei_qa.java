TESTE / TORRADEIRA - Lacrei

Analista de Teste:	Andressa Caroline Miranda de Freitas

Data de In�cio:	10/05/2022

Prioridade:	Alta
Severidade:	Alta

Prop�sito:	O prop�sito � registrar o projeto e as estrat�gias utilizadas para testar o produto.
P�blico Alvo:	Aplic�vel aos respons�veis pelo teste da Lacrei e, ainda, aos poss�veis consumidores do produto.
Escopo:	Detalhamento de testes e os planos aplic�veis com a respectiva estrat�gia.
Refer�ncias	[1] Formul�rio disponibilizado pelo portal Lacrei para avalia��o. . [2]Localiza��o.  https://lacrei.notion.site/Desafio-Como-voc-testaria-uma-Torradeira-d8d65639ab3b403b940dbb107325b0ca

Estrat�gia de teste (est�gio): 	Teste de Sistema

Estrat�gia de teste (tipos):	Funcional, Seguran�a, Desempenho, Usabilidade.

Objetivo:	Validar os crit�rios necess�rio para implementa��o do produto e verificar se foram bem aplicados.

CT - 1:
Dado: colocar o p�o na torradeira
Quando: ligar na tomada
Ent�o: o p�o dever� ser tostado

CT - 2:
Dado: o acionamento do bot�o ligar
quando: a luz vermelha acender
ent�o: a torradeira dever� iniciar o processo de tostagem.

CT - 3:
Dado: a torradeira estar em funcionamento
quando: o p�o atingir a temperatura ideal
ent�o: acender luz verde e parar de aquecer

CT - 4:
Dado: a torradeira for acionada sem p�o
Quando: e n�o for desligada em 30 segundos
Ent�o: ativar modo hibernar e resfriar a temperatura

CT - 5:
Dado que a torradeira for ligada
Quando estiver em tens�o diferente de 220w
Ent�o ativar fun��o bivolt
