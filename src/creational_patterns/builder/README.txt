Builder Design Pattern

Problama:
	
Como vamos criar um objeto que requer vários valores sendo setados no seu construtor na hora de instanciar?

Solução:

- Usar métodos setters ao invés do construtor para configurar o objeto, mas isso não funciona para Immutable Object,
por ele não permitir modificação depois de criado. 
- Para objetos mutáveis, isso poderia também levar a classe ficar temporariamente quebrada. Vc poderia ter esquecido de 
configurar as no construtor.  

