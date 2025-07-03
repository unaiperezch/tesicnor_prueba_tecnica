# Prueba Técnica - Programador Jr. TESICNOR

## 📋 Cuestionario 📋

### Si te asignan una tarea y ves que la funcionalidad no está definida al 100%, ¿qué haces? 

```
Lo primero que hay que hacer cuando una funcionalidad no está completamente definida es revisar
absolutamente todo lo que tengas que haga referencia a la misma, ya sea las tarjetas de un Jira/Trello,
documentaciones... De esta forma tendremos claro qué es lo que falta por definir y poder
preguntarlo con claridad a la persona responsable. Siempre podemos sugerir algún tipo
de comportamiento pero jamás tenemos que asumir las cosas, siempre hay que consultarlo.
```

### 2. ¿Has utilizado algún sistema de control de versiones? ¿Cómo lo usabas?

```
He utilizado Git y como plataforma para consultar los commits, merge requests, etc, GitLab.
De esta forma es como trabajo con Git:

* Nos clonamos el repositorio que queremos trabajar
* Obtenemos la última versión del proyecto antes de ponernos con una tarea,
queremos evitar conflictos
* Desde la rama principal, creamos una rama a parte para nuestra tarea,
tiene que tener un nombre descriptivo y con una ID, suele ser la tarjeta del Jira/Trello
* Actualizamos el progreso con commits, también tienen que ser descriptivos y
 han de tener la ID de la rama
* Abrimos una Pull Request cuando completemos la tarea y esperamos a su revisión
* Una vez la tarea es apta, volvemos a obtener la última versión del proyecto,
así podemos o bien evitar conflictos, o bien hacer un git rebase si es necesario
* Mergeamos nuestra rama con main
* Si la plataforma cuenta con tests, pasaremos los comandos pertinentes para
ver que todo se haya subido correctamente y no se haya estropeado nada por el camino
```

## 💻 Tecnologías usadas y como ejecutar el proyecto 💻 ##

```
He utilizado Java 21 en Backend, Angular 17 en Frontend y MySQL Workbench como BBDD.

También, adjunto en el proyecto el script de creación de la base de datos
y de la tabla en MySQL Workbench.

➡️ Usuario BBDD: root Passwd: 18396400a

Nos clonaremos el repositorio, yo personalmente utilizo las IDEs de IntelliJ para
Java y Trae para Angular. El front está en el puerto 4200 y el back en el 8080. La
BBDD está alojada en el 3306.

Para ejecutar el backend, simplemente le daremos a "Run Project" desde la IDE, o como
atajo, al menos en IntelliJ, control + f5.

De lo contrario, para el frontend, necesitaremos escribir en la terminal lo siguiente:

➡️ ng serve

He de comentar, que al hacer la siguiente llamada, no obtengo ningún tipo de
parámetro llamado "plot" de las películas de Star Wars, por ello, no aparece ningún dato
en esa columna de la tabla. ⬇️⬇️

```

![image](https://github.com/user-attachments/assets/28d23ff3-02fc-4751-9675-7b5c614d8819)
