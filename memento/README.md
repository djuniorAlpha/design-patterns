# Memento

Este editor gráfico permite alterar a cor e a posição das formas na tela. No entanto, qualquer modificação pode ser desfeita e repetida.

O “desfazer” é baseado na colaboração entre os padrões Memento e Command. O editor rastreia um histórico dos comandos executados. Antes de executar qualquer comando, ele faz um backup e o conecta ao objeto de comando. Após a execução, ele adiciona o comando executado para o histórico.

Quando um usuário solicita o desfazer, o editor busca um comando recente do histórico e restaura o estado do backup mantido dentro desse comando. Se o usuário solicitar outro desfazer, o editor utilizará o próximo comando do histórico e assim por diante.

Os comandos revertidos são mantidos no histórico até que o usuário faça algumas modificações nas formas na tela. Isso é crucial para refazer comandos desfeitos.