Informe del codigo recibido, por Matias Delgado.

Lo primero que veo y que me llama la atencion de la estructura del proyecto es que (aparte de no tener test) hay una
clase Program que contiene logica que al parecer trabaja para el ejercicio de fibo3, pero el nombre no es descriptivo
sobre lo que hace esta clase, de que se encarga? Program no tiene ningun nombre indicativo relacionado con fibo3.

------------------------------------------------------------------------------------------------------------------------

En cuanto al cumplimiento de la consigna.

para fibo3:
    java -jar fibo.jar -o=vd -f=salida.txt 5 funciona correctamente.    
    java -jar fibo.jar -o=hd -m=s 5 funciona correctamente.
    java -jar fibo.jar -o=vd -f=salida.txt -m=s 5 funciona correctamente.

para fibo 2:
    java -jar fibo.jar -o=vd 5 funciona correctamente pero me imprime 2 saltos de linea de mas.
    java -jar fibo.jar -o=hi 8 funciona correctamente pero me imprime un salto de linea.
    java -jar fibo.jar -o=vi 8  funciona correctamente pero me imprime 2 saltos de linea de mas.
    java -jar fibo.jar -o=xy 8 funciona correctamente con un salto de linea.
    java -jar fibo.jar 8 funciona correctamente con un salto de linea.

para fibo1:
    java -jar fibo.jar 5 funciona correctamente pero me imprime un salto de linea.
    java -jar fibo.jar 8 funciona correctamente pero me imprime un salto de linea.

En general habria que ver los saltos de linea, cuando la impresion es vertical queda mucho espacio en la consola.
Creo que los saltos de linea esta de mas pero cumple con todo.

------------------------------------------------------------------------------------------------------------------------

En cuanto a test, no tiene.

------------------------------------------------------------------------------------------------------------------------

En cuanto a las convenciones Java.

Se respeta que:
    - Las clases empiezan en mayuscula y continuan con minusculas.
    - Salvo la variable numerosaMostrar, todo esta escrito en CamelCase.
    - Los nombres de las clases son sustantivos.
    - Salvo 'sumatoria', todos los metodos son verbos

Salvo por el metodo 'sumatoria' que no es descrita por un verbo sino un sustantivo y salvo la variable
numerosaMostrar que no esta escrita en CamelCase, las convenciones basicas de java se respetan bien.

--------------------------------------------------------------------------------------------------------------------

En cuanto a los principios SOLID.

Single responsibility:
    -La clase Program parece tener muchas responsabilidades, se encarga de inicializar las opciones indicadas por el
    usuario, se encarga de ver si las opciones son validas, se fija si el usuario quiere un archivo de salida, se
    encarga de crear un archivo de salida, se encarga de escribir el archivo de salida, se encarga de crear los mensajes
    a mostrar en la consola y se encarga tambien de mostrar el resultado por consola. Muchas responsabilidades para una
    sola clase, no sigue la recomendacion que indica la 'S' de solid.
    -La clase Fibonacci parece estar un poco mejor estructurada, tiene los metodos como para poder calcular el resultado
    de la entrada, y se encarga de preparar todo lo necesario para mostrarlo correctamente. Se puede decir que Fibonacci
    tiene una unica responsabilidad que es encargarse de calcular todo lo necesario para poder mostrar la salida
    correcta. Tal vez esta bien decir que respecta la 'S' de solid pero hay que tener cuidado en no agregarle mas cosas
    porque si piden algo nuevo, esta clase va creciendo mucho en cuanto a metodos, y tal vez se pierde un poco la
    responsabilidad simple.
    
    Creo que estaria mejor renombrar la clase Program a un nombre mas descriptivo sobre lo que hace, sacarle un poco las
    responsabilidades que tiene y hacer que solo se ocupe de imprimir los resultados.

Open/Closed:
    - En la clase Program hay que tocar mucha logica con las nuevas funcionalidades que pidieron en fibo4 con lo cual
    concluyo que Program no es abierto a la extension de funcionalidades y cerrado al cambio del codigo existente.
    - La clase Fibonacci es un poco mas abierto a la extension ya que basta con agregar un par de metodos ahi para
    que el programa soporte las nuevas entradas, pero abria que meter mucho codigo nuevo y tal vez modificar algunas
    cosas para lograr esto.

    Creo que en lineas generales el codigo no es muy abierto a la extencion y cerrado al cambio del codigo. Si me piden una
    opcion, tengo que cambiar muchas cosas.

Liskov substitution:
    - No hay gerarquia de herencia en este ejercicio, o al menos en la solucion que plantearon en este codigo se
    considero que no era necesario.
     
    Tal vez una buena idea para este problema podria ser armar una jerarquia de herencia
    de Fibonaccis y que cada una de estas ramas de la jerarquia implemente su propia salida. Pero no esta mal tampoco
    llegar a una solucion sin esta jerarquia, con lo cual no hay mucho para decir para este principio 'L'.
    
Interface segregation:
    - No hay uso de interfaces en el codigo.
    
    No hay mucho para decir sobre este principio, tal vez no este mal que el autor no haya usado interfaces para 
    solucionareste problema.
    
Dependency inversion:
    - No hay muchas clases en el package, solo hay una depedencia que es que Program usa Fibonacci para tener un
     resultado y el Program lo muestra en el archivo o en la consola.
      
    No hay mucho para decir cobre la inversion de dependecia ya que en el package solo hay dos clases.
    El 'new' del Fibonacci dentro de Program se hace dentro del metodo main, tal vez seria mejor si la clase Program
    tuviese el Fibonacci como un atributo y este se instancie dentro de un constructor.
   
------------------------------------------------------------------------------------------------------------------------

En lineas generales el programa esta bastante bien, teniendo en cuenta que se hizo con poco tiempo, cumple con todas las
consignas. Hay muchas cosas mejorar y falta aplicar algunos principios vistos en la clase (corrigiendo este me di cuenta
 de muchos errores en mi fibo), sobre todo en la 'S' y la 'O'.