# Binary Tree 
###### REST API para crear Crear un arbol binario y Dado un arbol binario y dos nodos retornar el ancestro común más cercano.

### Prerequisitos
- JDK 1.8+  
- GlassFish Server 4.1.1

### Tecnologias stack:
* Java

### Services:
 - [getAncestors](https://github.com/damoviz/TreeApiRest/blob/master/src/java/api/GenericResource.java#L33) 
  ![movieapp-screenshots_big_iphone_](https://github.com/damoviz/TreeApiRest/blob/master/Captura%20de%20Pantalla%202019-06-28%20a%20la(s)%205.22.58%20p.%20m..png)
  
 - [createTree](https://github.com/damoviz/TreeApiRest/blob/master/src/java/api/GenericResource.java#L48)  
 ![movieapp-screenshots_big_iphone_](https://github.com/damoviz/TreeApiRest/blob/master/Captura%20de%20Pantalla%202019-06-28%20a%20la(s)%205.22.39%20p.%20m..png)

### IDE'S:
* NetBeans 8.2

## Pruebas
Se puede usar el mismo Ide de NetBeans mediante Test RESTful Web Services o a través de Postman:
<br>
<li><strong>getAncestors</strong> : Este metodo lo que hace es crear el arbol segun el ejemplo que colocaron en la prueba.</li>
<li><strong>createTree</strong> : Con este metodo dado dos nodos devuelve el ancestro más cercano. Ejemplo (83, 87)</li>
