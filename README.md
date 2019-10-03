## IWVG. EF. Trabajo práctico: DOO [Sergio Cabrero Fernández]
> Problemas y mejoras al proyecto de Irati Casi Klondike
### Problema 1
**Principio de única responsabilidad** en MoveController: Indicaba si había finalizado el juego, de esta manera tenía dos responsabilidades, los movimientos y la finalización del juego. 
> Solución: Creamos FinishController y le asignamos la responsabilidad de todos los temas de finalizar el juego.
### Problema 2
Strings asignados directamente en código en la clase IO, sin uso de constantes para asignarlos.
> Solución: Creamos variables globales y les asignamos las constantes, provocando legibilidad en el código.
### Problema 3
Problema de unica responsabilidad en IO (lee y escribe), además depende directamente de librerías de terceros, sin encapsulación.
> Solución: Creamos interfaces Reader y Writer para cambiar la librería de lectura escritura basándonos en la ley del cambio continuo. Así, cambiar la librería con la que lee o escribe afectaría minimamente.
### Problema 4
Demasiada responsabilidad de la clase Game, se encarga de limpiar, decidir si el juego ha terminado, mover cartas, etc.
> Solución: No he conseguido llegar a una solución óptima.
### Problema 5
Algunos smell codes y código muerto (método 'clear()' en clase 'IO')

### Problema 6
No respeta el principio kiss, innecesaria herencia de Command en el paquete utils con Command en el paquete menú.
> Solución: Eliminamos la herencia y hacemos directamente la dependencia de Command con menú.


**RAMA MASTER (Original mvp-pm) - RAMA DEVELOP (Modificaciones)**
