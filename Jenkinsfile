pipeline {
  agent any
  stages {
    stage('Compilar') {
      steps {
        withMaven(globalMavenSettingsFilePath: 'C:\\Users\\alumno.40\\Desktop\\Jenkins - Alumno\\maven\\conf\\settings.xml', jdk: 'JDK', maven: 'MAVEN', mavenSettingsFilePath: 'C:\\Users\\alumno.40\\Desktop\\Jenkins - Alumno\\maven\\conf\\settings.xml') {
          bat 'mvn clean install -DskipTests'
        }

      }
    }
    stage('Deploy') {
      steps {
        deploy(adapters: [tomcat7(credentialsId: '297299a1-67b0-4642-8fed-800c1c12072c', path: '', url: 'http://localhost:8082/')], contextPath: 'web_curso', war: 'target\\*.war')
      }
    }
    stage('Test') {
      steps {
        withMaven(jdk: 'JDK', maven: 'MAVEN', globalMavenSettingsFilePath: 'C:\\Users\\alumno.40\\Desktop\\Jenkins - Alumno\\maven\\conf\\settings.xml', mavenSettingsFilePath: 'C:\\Users\\alumno.40\\Desktop\\Jenkins - Alumno\\maven\\conf\\settings.xml') {
          bat 'mvn test cobertura:cobertura -Dmaven.test.failure.ignore=true'
        }

      }
    }
    stage('Cobertura') {
      steps {
        cobertura autoUpdateHealth: false, autoUpdateStability: false, coberturaReportFile: 'target\\surefire-reports\\cobertura\\coverage.xml', conditionalCoverageTargets: '70, 0, 0', failUnhealthy: false, failUnstable: false, lineCoverageTargets: '80, 0, 0', maxNumberOfBuilds: 0, methodCoverageTargets: '80, 0, 0', onlyStable: false, sourceEncoding: 'ASCII', zoomCoverageChart: false
      }
    }
  }
}

