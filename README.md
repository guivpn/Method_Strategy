ALUNOS:

- Guilherme Vinícius - RA: 4231925652
- Leonardo Gabriel - RA: 4231921808

#

PRÁTICA - ORDENAÇÃO




Você foi contratado para desenvolver um sistema que ordene uma lista de números de diferentes maneiras, dependendo da escolha do usuário. Para isso, você deve implementar o padrão Strategy, garantindo flexibilidade para adicionar novos algoritmos de ordenação no futuro.

Requisitos:

1. Crie uma interface EstrategiaOrdenacao com o método ordenar(List<Integer> numeros) que cada estratégia de ordenação implementará.
2. Crie classes concretas que representem diferentes estratégias de ordenação:
- OrdenacaoBubbleSort
- OrdenacaoSelectionSort
- OrdenacaoInsertionSort
3. Cada uma deve implementar o método ordenar(List<Integer> numeros) da interface EstrategiaOrdenacao.
4. Crie uma classe ContextoDeOrdenacao que terá uma referência para um objeto do tipo EstrategiaOrdenacao. Esta classe deverá ter os métodos:
- setEstrategia(EstrategiaOrdenacao estrategia): para definir qual estratégia será utilizada.
- executarOrdenacao(List<Integer> numeros): que executa o método ordenar() da estratégia definida.
5. Na classe Principal, permita ao usuário escolher qual algoritmo de ordenação será usado e aplique a ordenação à lista fornecida.
