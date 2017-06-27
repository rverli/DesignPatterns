Facade Design Pattern

Propósito:
	
- Provê uma interface unificada de um conjunto de interfaces de um subsistema complexo.
- Encapsula um complicado subsistema em uma simples interface.
- Mesmo com uma interface simples de um subsistema complexo, ainda é possível acessar as funcionalidades diretamente do subsistema.

- Diferente do Design Adapter que utiliza duas interfaces antigas com um adaptador, Facade cria uma nova interface para facilitar o uso de um subsistema complexo.

=============================================================================================================================================================================================

Facade Design Pattern

Intent

Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
Wrap a complicated subsystem with a simpler interface.
Problem

A segment of the client community needs a simplified interface to the overall functionality of a complex subsystem.

Discussion

Facade discusses encapsulating a complex subsystem within a single interface object. This reduces the learning curve necessary to successfully leverage the subsystem. It also promotes decoupling the subsystem from its potentially many clients. On the other hand, if the Facade is the only access point for the subsystem, it will limit the features and flexibility that "power users" may need.

The Facade object should be a fairly simple advocate or facilitator. It should not become an all-knowing oracle or "god" object.

