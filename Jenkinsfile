pipeline {
    agent any
     tools { 
        maven 'Maven 3.3.9' 
        jdk 'jdk8' 
    }

    stages {
 
        stage('Build'){
            steps {
                sh 'printenv'
                sh 'mvn clean package'
 
            }
        }
        stage('Deploy') {
            steps {
                sh 'docker-compose -f docker-compose.yml up -d --build --remove-orphans '
            }
        }
    }
}
