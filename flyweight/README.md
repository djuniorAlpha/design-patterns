# Flyweight

Neste exemplo, vamos renderizar uma floresta (1.000.000 árvores)! Cada árvore será representada por seu próprio objeto que possui algum estado (coordenadas, textura e assim por diante). Embora o programa faça seu trabalho principal, naturalmente consome muita RAM.

O motivo é simples: muitos objetos árvore contêm dados duplicados (nome, textura, cor). É por isso que podemos aplicar o padrão Flyweight e armazenar esses valores em objetos separados de flyweight (a classe **TreeType**). Agora, em vez de armazenar os mesmos dados em milhares de objetos **Tree**, vamos fazer referência a um dos objetos flyweight com um conjunto específico de valores.

O código cliente não notará nada, pois a complexidade da reutilização de objetos flyweight está enterrada dentro de uma fábrica de flyweight.