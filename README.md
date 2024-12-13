## RESPOSTAS

### Questão 07
 - Comando:
1 class Registro De Eleitor
2 {
3 /**
4 * Declaração dos campos desta classe
5 */
6 int tituloDeEleitor; // número do título do eleitor
7 String nome; // nome do eleitor
8 short zonaEleitoral; // número da zona eleitoral
9 } // fim da classe

- Nome da Clase não seguindo o padrão de CamelCase, nome com espaço.
- É necessário colocar o acesso desses atributos, se vai ser acessados por qualquer um, ou vai seguir a abstração de encapsulamento ou restrita ou protegida.
- Inserir os getters e setters para acessar os métodos e poder alterar seus valores.
- Contrutor de inicialização da classe.

### Questão 08
 - Comando:
 1 class Teste2
2 {
3 /**
4 * Declaração dos campos desta classe
5 */
6 int num1,num2;
7 /**
8 * Declaração dos métodos desta classe
9 */
10 int maior()
11 {
12 if (num1 > num2)
13 return true;
14 else return false;
15 }
16 void menor()
17 {
18 if (num1 < num2)
19 return num1;
20 else return num2;
21 }
22 } // fim da classe

- Não há uma restrição em colocar números no nome da classe, mas não é recomendado, seguindo as boas práticas de programação, utilizar número no nome não é considerado uma boa prática.
- Nome das variáveis, o clean code chora vendo tal coisa. Seria mais interessante nomear as variáveis de forma mais explicativa, e uma por vez, já que vão armazenar coisas distintas.
- int maior() : A princípio, espera que o método retorne um valor do Tipo Inteiro, mas de acordo com a lógica da função vê-se que ela retorna um booleano, então seria necessário trocar o retorno da função por boolean.
- void menor() : Menor, não assinatura de nenhum retorno mas pela lógica da função ela está retornando o menor número, contradizendo a assinatura da função.

### Questão 14
Resposta: Proteção dos atributos da classe, pois através dos getters and setters e a proteção dos atributos, você encapsula a classe, assim todas as mudanças e requisições dos valores podem ser controlados pelo seu critério, impedindo que consigam interagir diretamente com o atributo.
