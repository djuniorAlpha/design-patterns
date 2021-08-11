# Command

O editor de texto neste exemplo cria novos objetos comando sempre que um usuário interage com ele. Após executar suas ações, um comando é enviado para a pilha do histórico.

Agora, para executar a operação desfazer, o aplicativo obtém o último comando executado do histórico e executa uma ação inversa ou restaura o estado passado do editor, salvo por esse comando.