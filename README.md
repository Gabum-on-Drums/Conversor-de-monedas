# Conversor de monedas

## Estado del proyecto: 
Finalizado según lo solicitado en el desafío, en desarrollo de funciones extras sugeridas.

## Descripción:

Primer challenge de especialización en el área de back-end en el bootcamp de Alura Latam. 
Desarrollado en Java implementando los conocimientos de:

- Variables
- Cadenas de texto
- Clases
- Instanciación
- Orientación a Objetos
- Consultas de API con HTTPRequest
- Manipulación de la respuesta mediante biblioteca Gson para archivos JSON.
- Manejo de posibles excepciones
- Bucles de código
- Switch case
- Interacción con el usuario mediante la clase Scanner
- Conversión de valores

## Guia básica sobre el uso del conversor de monedas.

Para este desafío se nos solicitó crear una aplicación la cual ofrezca como mínimo 6 tipos de conversión al usuario. 
Luego a elegír una, sugerir que ingrese el valor que desea convertir, esto almacenarlo en una variable, y mostrarlo en un mensaje de respuesta junto al equivalente de la moneda de destino.

Los valores que ofrece actualmente son:

1) USD -> ARS
2) ARS -> USD
3) USD -> BRL
4) BRL -> USD
5) USD -> CLP
6) CLP -> USD

<img width="561" height="449" alt="Respaldo conversión exitosa" src="https://github.com/user-attachments/assets/8da0fc3b-d363-4798-8cb8-ac307d23d037" />


La aplicación realiza una consulta a la API de exchangerate-api.com concatenando los valores de moneda de inicio y tipo de moneda de destino y obtiene su respuesta en tiempo real junto con la tasa de conversión para realizar la operación.

Cuenta con filtro para que en el caso que la opción ingresada no corresponda a las opciones mencionadas y encamine a la correcta elección del menú. Esto ayuda a que la aplicación siga funcionando sin problemas.


<img width="671" height="401" alt="Respaldo opción incorrecta" src="https://github.com/user-attachments/assets/e9ee15d3-3636-4ef9-b930-6406b058b016" />


La aplicación se ofrece en el menú la opción salir, la cual finaliza el bucle y muestra un mensaje al finalizar.


<img width="642" height="458" alt="Respaldo mensaje de salida" src="https://github.com/user-attachments/assets/14540dfd-88ce-4525-afa6-66999b2793a9" />


## Solicitudes y mejoras para la aplicación:

Como extra se desarrollarán funciones como:

- Historial de conversiones: Agrega la capacidad de rastrear y mostrar el historial de las últimas conversiones realizadas, brindando a los usuarios una visión completa de sus actividades.

- Soporte para más monedas: Amplía la lista de monedas disponibles para la elección, permitiendo a los usuarios convertir entre una variedad aun mayor de opciones monetarias.


