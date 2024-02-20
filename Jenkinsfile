pipeline {
    agent any
    
    tools {
        maven 'MAVEN'
    }
 
    stages {
        stage('Test') {
            steps {
                sh "mvn clean test"
            }
 
            post {
                success {
                    publishHTML([
                        allowMissing: false, 
                        alwaysLinkToLastBuild: false, 
                        keepAll: false, 
                        reportDir: '', 
                        reportFiles: 'index.html', 
                        reportName: 'HTML Report', 
                        reportTitles: '', 
                        useWrapperFileDirectly: true
                    ])
                    emailext (
                        subject: "Pipeline Successful: ${currentBuild.fullDisplayName}",
                        body: "A sua pipeline foi executada com sucesso.",
                        to: 'testmulticert@yopmail.com',
                    )
                }
                
                failure {
                    emailext (
                        subject: "Pipeline Failed:",
                        body: "A sua pipeline falhou. Verifique os logs para mais informações.",
                        to: 'testmulticert@yopmail.com',
                    )
                }
            }
        }
    }
}