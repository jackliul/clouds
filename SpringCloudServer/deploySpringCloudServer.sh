#!/bin/sh
# sh /cygdrive/d/openCodes/springCloud/SpringCloudServer/deploySpringCloudServer.sh 
echo "start deploy SpringCloudServer"
cd /cygdrive/d/openCodes/springCloud/SpringCloudServer && 


gradle build -Denv=test -x test && cd /cygdrive/d/openCodes/spring4MvcAndSwaggerWithGradle && 
gradle clean deployFileServer -DrealHost='47.89.10.238' -DrealPassword='FararFDe999()'







