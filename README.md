1. Pour compiler
mvn clean compile exec:java

2. N'oublie pas d'ajouter les env variables in configuration
export USER_Runtime=jouanotf
export URL_Runtime=jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag
export PASSWORD_Runtime=c976d43602

3. Pour tests
mvn clean test
