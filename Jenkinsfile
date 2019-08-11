pipeline {
    agent any
    stages {
        stage('Run Unit Tests') {
            agent { docker 'aaronyunan/jdk8-awscli' }
            steps {
                sh './auto/run-unit-tests'
            }
        }
        stage('Package') {
        agent { docker 'aaronyunan/jdk8-awscli' }
            steps {
                sh './auto/package'
            }
        }
    }
}
