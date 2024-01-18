## Tarea 1
Realizar una prueba funcional automatizada (Prueba E2E) de un flujo de compra en la página
https://www.saucedemo.com/ que incluya:
• Autenticarse con el usuario: standard_user y password: secret_sauce
• Agregar dos productos al carrito
• Visualizar el carrito
• Completar el formulario de compra
• Finalizar la compra hasta la confirmación: “THANK YOU FOR YOUR ORDER”


## Requisitos

Para ejecutar el proyecto es necesario tener instalado lo siguiente:

  - JDK versión correto 17 (debe estar en la variable de entorno)
  - Intellij-Idea
  - Gradle 8.0 (debe estar en la variable de entorno)



## Ejecucion
- Para ejecutar el proyecto
        1. Abrir el IDE IntellijIdea
        2. Ingresar en la opción File -> Open y ubicarse en el proyecto (abrir)
        3. Esperar unos minutos para que se descargen las despendencias (gradle)
        4. dentro del Intelij ubicarse sobre  la carpeta principal del proyecto y clic derecho sobre Run 'Test in Automatizacion'
        5. Reporte Serenity: Una vez finalizada la ejecución se crea el informe propio de Serenety (se añadio capturas de pantalla de cada paso)
            para visualizarlo ubicarse en la ruta target/serenity/index.html
