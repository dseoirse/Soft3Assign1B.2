pipeline {
    agent any 
    stages {
        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }
        stage('Run'){  
            steps{
                 sh './gradlew war'
            }
        }

        stage('Deploy') {
            steps {
                sh './gradlew deploy'
            }
        }
    
    }
        post {
        always {
            archiveArtifacts artifacts: 'build/libs/*.war', fingerprint: true
        }
    }
        
        
}
