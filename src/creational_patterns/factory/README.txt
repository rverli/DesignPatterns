Factory Design Pattern

Propósito:
	
Como escrevemos um código que cria objetos em que é preciso que o tipo do objeto não seja conhecido até a execução?

Solução:

- Vimos no Builder Pattern que a criação do objeto pode ser complexa. Gostaríamos algumas vezes de encapsular a cvriação do objeto 
de acordo com a complexidade da criação do objeto, incluindo selecionar qual subclasse usar.

- Creational Pattern baseado na idéia de usar uma fábrica de classes para produzir instancias dos objetos baseados no parametro informado.
 