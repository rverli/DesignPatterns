Immutable Object Design Pattern

Propósito:
	
Quando se quer criar um simples objeto que pode ser compartilhado por multiplas classes, mas por razões de segurança seu conteúdo não deve ser modificado

Solução:

- Use um construtor para setar todos as propriedades do objeto;
- Marque todas as variáveis da instancia final e private;
- Não defina nenhum método set;
- Não permita referencia de objetos mutáveis serem modificadas or acessada diretamente;
- Previna métodos de sobrescrição;

===========

- Classe final;
- Atributos private e final;
- Valores passados pelo construtor;
- Sem sets;
 