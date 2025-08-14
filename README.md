this directory is for the study of the design patern of Prototype

EL OBJETIVO PRINCIPAL de este patron de diseno es clonar un objeto

Principalmente se usa cuando tenemos objetos repetitivos, cuando necesitamos crear un objeto de forma muy repetitiva, con componentes similares
    esto hace referencia no a dos o tres objetos si no a una cantidad mayor, El clonar un objeto permite ahorrar recursos de procesamiento y es mas rapido
    Desde algun punto se puede suponer que el prototype es lo opuesto a un constructor, 
    Permite partir la obtencion de un nuevo objeto a partir de uno preestablecido, evitando de esta manera subclases, y setear valores espeficos de cada objeto sin embargo todo desde una misma base

Desventajas:
    La clonacion es repetitiva
    Es necesario agregar clonacion pensando en la gerarquia de prototipos

COMO TRABAJA
    -Cliente         -Prototype         -Prototype Concreto
    El prototype debe tener cliente, prototype y prototype concreto


1-  Es necesaria una clase abstracta lo cual es una clase normal pero con almenos un objeto abstracto, que en pocas palabras se refiere a que no tenga codigo o no este implementado, La clase y el metodo abstracto, que se dentro de item siempre o por conveniencia se llamara clone, ademas de almenos 3 propiedades con sus getters ans setters

    *un uso comun de este patron de diseno es para conexiones
2- Es necesario tener al menos un prototipo concreto (ItemA e ItemB) y no hay un limite para estos

3- Por cliente no es necesario pero en este caso se hara dentro del main, en si es quien recibira los clones
