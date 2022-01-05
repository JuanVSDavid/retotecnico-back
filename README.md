# Back
Diseñe una API RESTful, con diferentes entidades para el manejo de persistencia y envio de los datos.
El Back ya tiene vinculada una base de datos en la nube (MySql), en el caso de que se borren los datos de esta,
dejo la estructura de los JSON, para hacer peticiones post para persistir en la base de datos de manera local:

End-point: http://localhost:8080/api/savePregunta

# pregunta
{<br>
  "enunciado": "¿Cual es el pais mas poblado de la tierra?",<br> 
  "points": 60,<br>
  "level": "super",<br>
  "options": {<br>
    "option1": "EEUU",<br>
    "option2": "China",<br>
    "option3": "Rusia",<br>
    "option4": "Japon",<br>
    "answer": "China"<br>
  }<br>
}<br>

# aplication.properties de forma local
Para acceder al archivo, tienen que entrar a src/main/java/com/sofkat/api/resources

spring.jpa.hibernate.ddl-auto=update <br>
spring.datasource.url=jdbc:mysql://localhost:3306/db_example <br>
spring.datasource.username=springuser <br>
spring.datasource.password=ThePassword <br>

La API RESTful manda preguntas aleatorias respecto a los niveles de complejidad:
"facil, normal, intermedio, dificil y super" En el caso de hacer peticiones POST al endpoint,
escribir de manera exacta con respecto a los ejemplos de los niveles en el campo de "level"
