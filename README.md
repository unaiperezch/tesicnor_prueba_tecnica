# Prueba Técnica - Programador Jr. TESICNOR

## 📋 Cuestionario 📋

### Si te asignan una tarea y ves que la funcionalidad no está definida al 100%, ¿qué haces? 

```
Lo primero que hay que hacer cuando una funcionalidad no está completamente definida es revisar absolutamente todo lo que tengas que haga referencia a la misma, ya sea las tarjetas de un Jira/Trello, documentaciones ... De esta forma tendremos claro qué es lo que falta por definir y poder preguntarlo con claridad a la persona responsable. Siempre podemos sugerir algún tipo de comportamiento pero jamás tenemos que asumir las cosas, siempre hay que consultarlo.
```

### 2. ¿Has utilizado algún sistema de control de versiones? ¿Cómo lo usabas?

```
He utilizado Git y como plataforma para consultar los commits, merge requests, etc, GitLab. De esta forma es como trabajo con Git:

* Nos clonamos el repositorio que queremos trabajar
* Obtenemos la última versión del proyecto antes de ponernos con una tarea, queremos evitar conflictos
* Desde la rama principal, creamos una rama a parte para nuestra tarea, tiene que tener un nombre descriptivo y con una ID, suele ser la tarjeta del Jira/Trello
* Actualizamos el progreso con commits, también tienen que ser descriptivos y han de tener la ID de la rama
* Abrimos una Pull Request cuando completemos la tarea y esperamos a su revisión
* Una vez la tarea es apta, volvemos a obtener la última versión del proyecto, así podemos o bien evitar conflictos, o bien hacer un git rebase si es necesario
* Mergeamos nuestra rama con main
* Si la plataforma cuenta con tests, pasaremos los comandos pertinentes para ver que todo se haya subido correctamente y no se haya estropeado nada por el camino
```
