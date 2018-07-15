# dds-tp2018-entrega3-tips
Mini Pruebas de concepto para la entrega 3

## REST

En 2 ventanas separadas:

mvn clean package  exec:java -Dexec.mainClass="ar.edu.dds.ServerREST"

mvn clean package  exec:java -Dexec.mainClass="ar.edu.dds.ClientREST"

("clean package" pueden quitarse si no hubo cambios en el codigo)

## MQTT

1. Prerequisitos: instalar algun broker de mensajeria MQTT. 
Para hacer estas pruebas se utilizo Moquette y es muy sencillo de levantar.
⋅⋅*. descargar https://bintray.com/artifact/download/andsel/generic/moquette-distribution-0.11.tar
..*. descomprimirlo en alguna carpeta, por ejemplo $HOME/dds
..*. ir a $HOME/dds/moquette-distribution-0.11/
..*. crear la carpeta "config"
..*. dentro de la carpeta $HOME/dds/moquette-distribution-0.11/config/ descargar 
https://raw.githubusercontent.com/andsel/moquette/master/broker/config/moquette.conf
..*. iniciar el servidor con $HOME/dds/moquette-distribution-0.11/bin/moquette-distribution
(Hay un .bat para windows, aunque no lo probamos. Probablemente requiera alguna configuración extra) 
2. En 2 ventanas separadas 

mvn clean package  exec:java -Dexec.mainClass="ar.edu.dds.ServerMQTT"

mvn clean package  exec:java -Dexec.mainClass="ar.edu.dds.ClientMQTT"

Los ejemplos de MQTT se tomaron de:
https://github.com/tgrall/mqtt-sample-java



