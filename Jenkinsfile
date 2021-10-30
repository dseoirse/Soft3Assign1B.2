
pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'javac Main.java'
                sh 'java Main'
            }
        }
    }
}
