# Chain of Responsability

Este exemplo mostra como uma solicitação que contém dados do usuário passa por uma cadeia sequencial de manipuladores que executam várias tarefas, como autenticação, autorização, e validação.

Este exemplo é um pouco diferente da versão canônica do padrão fornecida por vários autores. A maioria dos exemplos do padrão é construída com a noção de procurar o handler correto, iniciá-lo, e sair da cadeia depois disso. Mas aqui executamos todos os handlers até que um que não possa lidar com uma solicitação seja encontrado. Esteja ciente de que esse ainda é o padrão Chain of Responsibility, mesmo que o fluxo seja um pouco diferente.