pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://bitbucket.org/usuario/repo.git'
            }
        }

        stage('Install Dependencies') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            publishTestNGResults failedTestsMarkBuildAsFailure: true, unstableThreshold: 0
        }
    }
}