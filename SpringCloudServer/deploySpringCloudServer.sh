#!/bin/sh
# sh /cygdrive/d/openCodes/clouds/SpringCloudServer/deploySpringCloudServer.sh
echo $1 &&
cd /cygdrive/d/openCodes/clouds/SpringCloudServer && 
sed -i "s/127.0.0.1/$1/g" src/main/resources/application.yml && 
gradle clean openBrowser -DrealHost=$1 -x test && 
cd /cygdrive/d/openCodes/clouds/SpringCloudServer && 
sed -i "s/$1/127.0.0.1/g" src/main/resources/application.yml &&
