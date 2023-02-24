pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        
        stage('Run') {
            steps {
                script {
                    def output = sh(script: 'java -jar target\maven-0.0.1-SNAPSHOT.jar', returnStdout: true)
                    println output
                }
            }
        }
    }
}
