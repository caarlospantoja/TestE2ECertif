pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/caarlospantoja/TestE2ECertif.git'
            }
        }

        stage('Install Dependencies') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                sh ' mvn test -Denv=test'
            }
        }
    }

    post {
        always {
            publishTestNGResults failedTestsMarkBuildAsFailure: true, unstableThreshold: 0
        }
    }
}