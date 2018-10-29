#!/bin/bash
cd `dirname $0`
basepath=$(cd `dirname $0`; pwd)
profile=$1
port=9002

pid=`ps -ef|grep "power-bank-0.0.1-SNAPSHOT.jar --server.port=${port}"|grep -v "grep"|awk -F ' ' '{print $2}'`
kill $pid

git pull

sh mvnw install -Dmaven.test.skip

echo "killing process..."
sleep 5s
echo "kill process successful!"
nohup java -Xms128m -Xmx512m -jar target/power-bank-0.0.1-SNAPSHOT.jar --server.port=${port} >/dev/null 2>&1 &

echo "releasing... pls read the log!"