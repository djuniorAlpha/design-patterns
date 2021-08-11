# Abstract Factory

Neste exemplo, botões e caixas de seleção atuarão como produtos. Eles têm duas variantes: macOS e Windows.

O Abstract Factory define uma interface para criar botões e caixas de seleção. Existem duas fábricas concretas, que retornam ambos os produtos em uma única variante.

O código cliente trabalha com fábricas e produtos usando suas interfaces abstratas. Ele faz com que o mesmo código cliente funcione com muitas variantes de produtos, dependendo do tipo de objeto fábrica.