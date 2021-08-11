# Strategy

Neste exemplo, o padrão Strategy é usado para implementar os vários métodos de pagamento em uma aplicação de e-commerce. Depois de selecionar um produto para comprar, o cliente escolhe uma forma de pagamento: Paypal ou cartão de crédito.

Strategies concretos não apenas executam o pagamento real, mas também alteram o comportamento do formulário de pagamento, fornecendo campos apropriados para registrar os detalhes do pagamento.