# Currency Converter

Este es un convertidor de divisas por consola escrito en Java 17 que utiliza programación orientada a objetos. Convierte entre el dólar estadounidense (USD) y otras divisas específicas: real brasileño (BRL), peso colombiano (COP) y peso dominicano (DOP). Utiliza la librería Gson para manejar JSON y la API [ExchangeRate-API](https://v6.exchangerate-api.com/v6/b0873e3439c19ca019dd1a15/latest/USD) para obtener las tasas de cambio.

## Requisitos


- Java 17
- Maven (opcional, pero recomendado para la gestión de dependencias)

## Configuración del Proyecto

### Usando Maven

Si estás utilizando Maven, añade la siguiente dependencia de Gson en tu archivo `pom.xml`:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.8</version>
</dependency> 


********************************************************************************************************************************************************************************

#Uso


Clona este repositorio en tu máquina local.
Asegúrate de que las clases están correctamente organizadas y compílalas.
Ejecuta la clase Main.

#Estructura del Proyecto

CurrencyConverter: Clase que contiene la lógica para convertir entre divisas.
ExchangeRateService: Clase que obtiene las tasas de cambio desde la API.
Main: Clase que maneja la interacción con el usuario por consola.



# Ejemplo de Ejecución
Cuando ejecutes el programa, se te presentará un menú en la consola:













