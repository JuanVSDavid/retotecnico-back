# Back
Diseñe una API RESTful, con diferentes entidades para el manejo de persistencia y envio de los datos.
El Back ya tiene vinculada una base de datos en la nuebe (MySql), en el caso de que se borren los datos de esta,
dejo la estrctura de los JSON, para hacer peticiones post para persistir en la base de datos:

End-point: http://localhost:8080/api/savePregunta

# pregunta
{
  "enunciado": "¿Cual es el pais mas poblado de la tierra?", 
  "points": 60,
  "level": "super",
  "options": {
    "option1": "EEUU",
    "option2": "China",
    "option3": "Rusia",
    "option4": "Japon",
    "answer": "China"
  }
}

La API RESTful manda preguntas aleatorias respecto a los niveles de complejidad:
"facil, normal, intermedio, dificil y super" En el caso de hacer peticiones POST al endpoint,
escribir de manera exacta a los ejemplos en el campo de "level"
