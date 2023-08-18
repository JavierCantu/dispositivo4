# dispositivo4
a) Análisis del problema dado:

El análisis del problema se centra en identificar dos áreas de oportunidad en la empresa SEGURYTEC relacionadas con el diseño de sistemas de detección y notificación de incendios. Estas áreas son el cálculo de la cantidad de sensores por cuarto y el cálculo de baterías para dispositivos. Actualmente, ambos procesos se realizan manualmente utilizando herramientas como Excel y calculadoras, lo que puede ser propenso a errores y consume tiempo significativo. Por lo tanto, se busca implementar un software que automatice ambos cálculos para ahorrar tiempo, aumentar la precisión y mejorar la eficiencia en el diseño de sistemas.

b) Diagnóstico:

El diagnóstico revela que la empresa SEGURYTEC enfrenta problemas de eficiencia y precisión en sus procesos de diseño debido a la falta de herramientas automatizadas para realizar los cálculos requeridos. El uso de hojas de cálculo y calculadoras manuales puede resultar en errores humanos y retrasos en los proyectos. El tiempo promedio de 15 a 20 minutos para el cálculo de baterías puede reducirse significativamente a 5 minutos o menos mediante la implementación de un software adecuado. Lo mismo ocurre con el cálculo de la cantidad de sensores por cuarto, donde una automatización podría mejorar la rapidez y precisión en la planificación.

c) Planteamiento de mejora/solución:

El objetivo del proyecto es desarrollar un software personalizado para la empresa SEGURYTEC que aborde las dos áreas de oportunidad identificadas. El software proporcionará las siguientes características:

1.	Cálculo automatizado de la cantidad de sensores por cuarto: El software permitirá a los diseñadores ingresar las medidas lineales de los cuartos y, según la norma NFPA 72, calculará la cantidad exacta de sensores necesarios, así como las separaciones adecuadas entre ellos.
 

2. Cálculo automatizado de baterías: El software permitirá a los usuarios agregar o eliminar dispositivos y sus valores de consumo de energía. Al ingresar la descripción del dispositivo, el software realizará los cálculos necesarios para determinar el tipo y cantidad de baterías requeridas para cada dispositivo.


Arquitectura de la aplicación.
1. PostgreSQL: Se utiliza para almacenar los datos(cálculos) de la aplicación. 
2. Backend: Actúa de intermediario entre la base de datos y las endpoint con sprint boot, aquí se procesan todas las solicitudes del administrador.  
3. Frontend: La aplicación que interactúa con el administrador de la aplicación y envía solicitudes al servidor backend a través de la capa peticiones, se encarga de actuar como intermediario entre el usuario y los datos en el servidor. 
La arquitectura de la aplicación SEGURYTEC se compone de una base de datos PostgreSQL para almacenar los datos de los dispositivos, un backend desarrollado con Spring Boot que procesa las solicitudes del administrador y un frontend que actúa como interfaz para que el administrador interactúe con la aplicación y realice los cálculos necesarios. 
