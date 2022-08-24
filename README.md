# MenorNumeroFora
PARTE 1:
Tem algum malandro tentando hackear nosso site >:(
Mas como sou amigo do tio Celso (um cara que trabalha numa companhia de internet ai) eu descobri que a internet do infeliz talvez seja dessa companhia que o Celso trabalha.

O tio Celso me deu uma lista com intervalos de IP's em formato decimal (o input do problema) e me GARANTE que os IP's que estão nos intervalos dessa lista são de pessoas bondosas e legais que nunca fariam mal para o próximo. Então a fim de testes seria interessante bloquear o menor IP que não esteja nessa lista de IP's legais (imagina se junto com esse teste a gente já não acerta na lata o IP do invasor).

Falando mais sobre o input, ele é uma lista de intervalos fechados de IP's parecido com a pequena lista abaixo:

5-8
0-2
4-7

Ou seja, com o primeiro intervalo sendo "5-8" significa que os IP's 5, 6, 7 e 8 são de pessoas legais e não podem ser do invasor.

A mesma coisa vale pro intervalo "0-2" que engloba os IP's 0, 1 e 2. E pro intervalo "4-7" que engloba os IP's 4, 5, 6 e 7.

Intuitivamente pode-se perceber que nesse input teste o menor IP que não está contido em nenhum intervalo da lista é o IP 3, sendo a resposta para o exemplo.
Então, com o input do tio Celso, qual é o menor IP que não está em nenhum intervalo da lista?
----------------------------------------------------------------------------------------------------------------------------------------------------
PARTE 2:
Achando o menor IP fora da lista e bloquando o acesso dele foi descoberto algumas coisas:

1) Ele usava exatamente esse IP para os ataques (que sorte!);
2) Porém o ataque ainda continua :( então o invasor provavelmente está mudando de IP;
3) Mas a gente sabe que o provedor de internet dele é esse que o tio Celso trabalha.

Então acho que a ideia mais "go horse" (<-- google it) a se fazer é simplesmente descobrir todos os IP's
que não estão em nenhum intervalo da lista fornecida pelo tio Celso :)

É possível descobrir isso olhando para a lista, mas o tio Celso é legal e nos contou que os IP's só podem ir de
0 até 2³²-1

Então, nesse intervalo mínimo e máximo de IP's, quantos IP's será necessário bloquear para que o invasor
chore e não consiga mais invadir o site?




Formato do input: (input no repositório, arquivo .txt)
numero inicial do intervalo-numero final do intervalo
numero inicial do intervalo-numero final do intervalo
...
