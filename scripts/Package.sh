#echo off
export workspace=/Users/Cori/eclipse/workspace/corina.cabrera.SVC.miw.upm.es
#set PATH=%PATH%C:\Program Files\Java\jdk1.8.0_40\bin;C:\Archivos_de_programa_Portables\apache-maven-3.3.1\bin
#set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_40
echo -----------------------------------------
echo ". (C) MIW"
echo -----------------------------------------
echo .
echo Workspace --- $workspace
echo .
echo .

cd $workspace
echo "============ mvn clean test (profile: develop) + mvn package (profile preproduction) ==================================================================="
echo .
mvn clean test -Denvironment.type=develop
mvn package -Denvironment.type=preproduction
echo .
