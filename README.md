# Proyecto TFG TrustOS

Proyecto realizado para trabajo de fin de grado en la carrera de Ingeniería Informática en Ingeniería del software en la Universidad de Extremadura. Mayo 2023.

Este trabajo consiste en la realización de un metamodelado en Eclipse, para modelar las distintas cadenas de producción que existe, para luego generar una página web que podamos interactuar con esa cadena y lo más importante relizar una trazabilidad de los activos incluidos en ella.

Para realizar esta trazabilidad utilizaremos blockchain, a través de la API desarrollada por Telefonica, llamada trustOS, la cual se puede consultar la información de esta [en este enlace](https://trustos.readthedocs.io/en/latest/).


## Sobre esta rama
En esta rama se encuentra la base de una aplicación web realizada para poder interacturar con los modelos generados, para realizar un modelo de una cadena de producción consultar la rama *modeling*.

## Paginas dentro de la web

Una de las primeras págians que nos encontraremos al iniciar la aplicación es la de login y register.

![Login Screen](https://github.com/Pmcb04/TrustOS-TFG/blob/master/assets/img/login.png)
![Register Screen](https://github.com/Pmcb04/TrustOS-TFG/blob/master/assets/img/register.png)

En la pantalla de register podremos elegir el rol que queremos registrar e introducir los datos relativos a este, los cuales se guardarán en la blockchain.

Luego de esto, al logearse con el usuario creado, nos encontraremos con la pantalla que lista todos los assets que podemos visualizar.

![Assets Screen](https://github.com/Pmcb04/TrustOS-TFG/blob/master/assets/img/assets.png)

Y pinchando en uno de ellos veremos más información sobre él.

![Asset View Screen](https://github.com/Pmcb04/TrustOS-TFG/blob/master/assets/img/assetView.png)

Si pinchamos sobre el botón editar, podemos editar las propiedades del asset, si pinchamos sobre el botón trazabilidad, podemos ver un grafo sobre todo el camino recorrido hasta llegar a el asset que estamos visualizando.

![Traceability Screen](https://github.com/Pmcb04/TrustOS-TFG/blob/master/assets/img/trazceability.png)

Y si pinchamos sobre los demás botones que se muestran podremos realizar diferentes acciones sobre el asset que se está visualizando.

![Action 1 Screen](https://github.com/Pmcb04/TrustOS-TFG/blob/master/assets/img/assetAction1.png)
![Action 2 Screen](https://github.com/Pmcb04/TrustOS-TFG/blob/master/assets/img/assetAction2.png)

Al final nos aparecerá un desglose de como se van cerrando y abriendo nuevos asset en la cadena.

Otra pantalla que podemos ver en la aplicación es la relativa a la pantalla de usuario, en donde podremos editar, datos relativos al rol, datos relativos a su persona un poco más personales como es el nombre y el email y la contraseña del usuario para acceder a la aplicación.

![Profile 1 Screen](https://github.com/Pmcb04/TrustOS-TFG/blob/master/assets/img/profile1.png)
![Profile 2 Screen](https://github.com/Pmcb04/TrustOS-TFG/blob/master/assets/img/profile2.png)

## Sobre el desarrollo

Si se desea consultar como está realizado el desarrollo mirar el fichero README.jhipster.md