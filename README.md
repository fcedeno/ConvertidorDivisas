# Currency Converter

Este es un convertidor de divisas por consola escrito en Java 17 que utiliza programación orientada a objetos. Convierte entre el dólar estadounidense (USD) y otras divisas específicas: real brasileño (BRL), peso colombiano (COP) y peso dominicano (DOP). Utiliza la librería Gson para manejar JSON y la API [ExchangeRate-API](https://v6.exchangerate-api.com/v6/b0873e3439c19ca019dd1a15/latest/USD) para obtener las tasas de cambio.

## Requisitos


- Java 17
- Libreria Gson

## Estructura del proyecto

- CurrencyConverter: Clase que contiene la lógica para convertir entre divisas.
- ExchangeRateService: Clase que obtiene las tasas de cambio desde la API.
- Main: Clase que maneja la interacción con el usuario por consola.



### Ejemplo de Ejecucion

Cuando ejecutes el programa, se te presentará un menú en la consola:

```java

Seleccione la dirección de la conversión:
1. USD a otra moneda
2. Otra moneda a USD
3. Salir
Opción:

```
En este ejemplo seleccionaremos la opcion numero 1

```java

Seleccione la dirección de la conversión:
1. USD a otra moneda
2. Otra moneda a USD
3. Salir
Opción: 1
Seleccione la moneda:
1. Real brasileño (BRL)
2. Peso colombiano (COP)
3. Peso dominicano (DOP)
Opción: 

```
Aca podras elegir tu opcion a convertir del USD como moneda base a las siguientes monedas del menu, en este ejemplo seleccionaremos la opcion 1 para convertir al Real brasileño (BRL)

```java

Seleccione la dirección de la conversión:
1. USD a otra moneda
2. Otra moneda a USD
3. Salir
Opción: 1
Seleccione la moneda:
1. Real brasileño (BRL)
2. Peso colombiano (COP)
3. Peso dominicano (DOP)
Opción: 1
Ingrese la cantidad en USD: 

```
Luego sale opcion para colocar la cantidad a convertir, en este ejemplo pondremos 200usd

```java

Seleccione la dirección de la conversión:
1. USD a otra moneda
2. Otra moneda a USD
3. Salir
Opción: 1
Seleccione la moneda:
1. Real brasileño (BRL)
2. Peso colombiano (COP)
3. Peso dominicano (DOP)
Opción: 1
Ingrese la cantidad en USD: 200
200,00 USD es igual a 1028,38 BRL
¿Desea realizar otra conversión? (s/n):  

```

Al dia de la prueba 200usd equivale a 1028,38 Real brasileño.

Si desea realizar otra conversion se coloca la letra "s" afirmando que si o "n" para no, en este ejemplo seleccionaremos "n" para salir.

```java

Seleccione la dirección de la conversión:
1. USD a otra moneda
2. Otra moneda a USD
3. Salir
Opción: 1
Seleccione la moneda:
1. Real brasileño (BRL)
2. Peso colombiano (COP)
3. Peso dominicano (DOP)
Opción: 1
Ingrese la cantidad en USD: 200
200,00 USD es igual a 1028,38 BRL
¿Desea realizar otra conversión? (s/n): n

Process finished with exit code 0
 

```







********************************************************************************************************************************************************************************
