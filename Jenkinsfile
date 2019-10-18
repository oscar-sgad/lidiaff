pipeline {
  agent any
  stages {
    stage('Compilar') {
      steps {
        withMaven(globalMavenSettingsFilePath: 'C:\\Users\\alumno.40\\Desktop\\Jenkins - Alumno\\maven\\conf\\settings.xml', jdk: 'JDK', maven: 'Maven', mavenSettingsFilePath: 'C:\\Users\\alumno.40\\Desktop\\Jenkins - Alumno\\maven\\conf\\settings.xml') {
          bat 'mvn clean install -DskipTests'
        }

      }
    }
    stage('Deploy') {
      steps {
        deploy adapters: [tomcat7(credentialsId: 'b9767272-39bc-4147-916b-5f3ba58c2042', path: '', url: 'http://localhost:8082/')], contextPath: 'web_curso', war: 'target\\ *.war'
        }
      }
  }
}
