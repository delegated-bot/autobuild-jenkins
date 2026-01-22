@Library('jenkins-lib-test-run') _

pipeline {
    agent any

    stages {
        stage('Exec') {
            steps {
                Util()
                Util(message: "Library smoke test")
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t alpine:latest .'
            }
        }
    }
}
