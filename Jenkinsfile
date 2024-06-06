pipeline {
    agent any

    tools {
        maven 'MAVEN'
    }

    stages {
        stage('Test') {
            steps {
                sh "mvn test"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                   publishHTML([
                       allowMissing: false,
                       alwaysLinkToLastBuild: false,
                       keepAll: false,
                       reportDir: '',
                       reportFiles: 'index.html',
                       reportName: 'HTML Report',
                       reportTitles: '',
                       useWrapperFileDirectly: true])
                }
            }
        }
    }
}