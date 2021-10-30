
pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'javac Main.java'
                bat 'java Main'
            }
        }
    }
}
