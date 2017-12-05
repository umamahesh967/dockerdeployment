pipeline {
    agent any

    stages {
 
        stage('Build'){
            steps {
                sh 'printenv'
                sh 'mvn clean package'
 
            }
        }
        stage('Deploy') {
            steps {
                sh 'sudo docker-compose -f docker-compose.yml up -d --build --remove-orphans '
            }
        }
    }
}
