pipeline {
  agent any
  options {
    timeout(time: 2, unit: 'MINUTES')
  }

  environment {
    SONAR_TOKEN = credentials('sonar-token')
  }

  stages {
    stage('Checkout') {
      steps {
        checkout scm
      }
    }

    stage('Validate Branch Name') {
      when {
        not { branch pattern: "feature/.*|bugfix/.*|master|dev", comparator: "REGEXP" }
      }
      steps {
        error("Branch name does not follow allowed pattern. Only 'feature/', 'bugfix/', and 'master' branches are allowed.")
      }
    }

    stage('Build & Test') {
      steps {
        sh 'mvn clean verify'
      }
    }

    stage('SonarQube Analysis') {
      when {
        branch 'dev'
      }
      steps {
        sh """
          mvn sonar:sonar \
            -Dsonar.projectKey=invoice-manager \
            -Dsonar.projectName='invoice-manager' \
            -Dsonar.host.url=http://sonarqube:9000 \
            -Dsonar.token=$SONAR_TOKEN \
            -Dsonar.coverage.jacoco.xmlReportPaths=target/site/jacoco/jacoco.xml
        """
      }
    }
  } 
}