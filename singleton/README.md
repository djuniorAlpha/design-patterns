# Singleton

## Singleton ingênuo (thread única)
É muito fácil implementar um Singleton desleixado. Você só precisa ocultar o construtor e implementar um método de criação estático.

## Singleton ingênuo (multithreaded)
A mesma classe se comporta incorretamente em um ambiente multithread. Vários threads podem chamar o método de criação simultaneamente e obter várias instâncias da classe Singleton.

## Singleton seguro para threads com carregamento lento
Para corrigir o problema, você deve sincronizar os threads durante a primeira criação do objeto Singleton.