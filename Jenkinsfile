pipeline {
  agent any
  stages {
    stage('Compilar') {
      steps {
        withMaven(globalMavenSettingsFilePath: 'C:\\Users\\alumno.40\\Desktop\\Jenkins - Alumno\\maven\\conf\\settings.xml', jdk: 'JDK', maven: 'Maven', mavenSettingsFilePath: 'C:\\Users\\alumno.40\\Desktop\\Jenkins - Alumno\\maven\\conf\\settings.xml') {
          bat 'mvn clean install -DskipTests'
        }

      }
    
    stage('Test') {
      steps {
        withMaven(globalMavenSettingsFilePath: 'C:\\Users\\alumno.40\\Desktop\\Jenkins - Alumno\\maven\\conf\\settings.xml', mavenSettingsFilePath: 'C:\\Users\\alumno.40\\Desktop\\Jenkins - Alumno\\maven\\conf\\settings.xml', jdk: 'JDK', maven: 'Maven') {
          bat 'mvn test -Dmaven.test.failure.ignore=true'
        }

      }
      stage('Cobertura') {
        steps {
    cobertura autoUpdateHealth: false, autoUpdateStability: false, coberturaReportFile: 'target\\surefire-reports\\cobertura\\coverage.xml', conditionalCoverageTargets: '70, 0, 0', failUnhealthy: false, failUnstable: false, lineCoverageTargets: '80, 0, 0', maxNumberOfBuilds: 0, methodCoverageTargets: '80, 0, 0', onlyStable: false, sourceEncoding: 'ASCII', zoomCoverageChart: false      
        }
      }
      
    }
  }
}
}
