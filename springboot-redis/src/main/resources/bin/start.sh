ENV=$1
if [ $ENV == '' ]
then
$ENV = "dev";
fi
java -Xms256m -Xmx512m -server -Dspring.config.location=../config/application.properties
        -jar ../lib/springboot-redis-0.0.1-SNAPSHOT.jar