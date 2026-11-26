# Práctica 5 — SIS-211

Modalidad: en pareja.

Java 21. Ejercicios independientes con datos ficticios. Desde cada carpeta: `javac -encoding UTF-8 *.java` y `java Main`. Las salidas obtenidas están en `Pruebas.txt`. En el ejercicio 9: `javap -c -p LoginValidator.class` y `javap -c -p LoginRevisado.class`.

## Reflexión final

En el ejercicio 1 protegemos el saldo de la cuenta digital mediante atributos privados y métodos que validan los depósitos y retiros. Así evitamos que el saldo cambie de forma incorrecta.

En el ejercicio 3 aplicamos polimorfismo para calcular las tarifas de entrega. Usar un método común para las distintas entregas facilita la lectura del código y evita repetir condiciones para cada tipo de entrega.

Los ejercicios que consideramos más difíciles son el 8 y el 9, por las condiciones de validación de contraseñas y la interpretación del bytecode de Java.

Pregunta pendiente: ¿cómo se puede mantener un límite de intentos de acceso aunque se cierre y vuelva a ejecutar el programa?

## Uso de IA

Se utilizó ChatGPT como apoyo en la preparación y revisión técnica del código y la documentación. Los ejercicios 7, 8 y 9 incluyen observaciones técnicas y consultas propuestas. La revisión personal de ambos integrantes debe confirmarse antes de la entrega.
