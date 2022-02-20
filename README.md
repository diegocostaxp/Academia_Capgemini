# Processo seletivo para Academia Capgemini

## INSTRUÇÕES DE ACESSO:


#### 1° Possibilidade 

#### Clone o projeto da seguinte forma: abra o prompt de comando e digite a seguinte informação: <code>git clone https://github.com/diegocostaxp/Academia_Capgemini.git</code>. Através da sua IDE de preferência, clique na classe correspondente e execute o código através do botão "Run Java".

### OU

#### 2° Possibilidade

#### Baixe o arquivo através do botão verde chamado "CODE" e clique no último item (Download ZIP). Através da sua IDE de preferência, clique na classe correspondente e execute o código através do botão "Run Java".

<hr/>

## TECNOLOGIAS UTILIZADAS:

1 - IDE Eclipse;

2 - Java v.11 LTS.

<hr/>

## QUESTÕES A SEREM AVALIADAS:

#### 1° Questão - Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

Exemplo:

Entrada: <code>n = 6 </code>

Saída: <code>
          *\n
        **\n
      ***\n
    ****\n
  *****\n
****** </code>


#### 2° Questão - Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios: Possui no mínimo 6 caracteres. Contém no mínimo 1 digito. Contém no mínimo 1 letra em minúsculo. Contém no mínimo 1 letra em maiúsculo. Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+.  Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.


Exemplo:

Entrada: <code>Ya3</code>

Saída: <code>3</code>


**Explicação:
Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.

#### 3° Questão - Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

Exemplo:

Entrada: <code>ovo</code>

Saída: <code>2</code>

**Explicação:
A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0], [2]], [[0, 1], [1, 2]] respectivamente. 
