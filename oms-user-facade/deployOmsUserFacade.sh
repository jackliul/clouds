#!/bin/sh
# sh /cygdrive/d/openCodes/clouds/oms-user-facade/deployOmsUserFacade.sh
echo $1 &&
cd /cygdrive/d/openCodes/clouds/oms-user-dao && 
gradle clean build install -x test &&
cd /cygdrive/d/openCodes/clouds/oms-tcore && 
gradle clean build install -x test &&
cd /cygdrive/d/openCodes/clouds/oms-user-facade && 
sed -i "s/127.0.0.1/$1/g" src/main/resources/bootstrap.yml && 
gradle clean deploy -DrealHost=$1 -x test && 
cd /cygdrive/d/openCodes/clouds/oms-user-facade && 
sed -i "s/$1/127.0.0.1/g" src/main/resources/bootstrap.yml &&
