pipeline {
    agent any
    stages {
        stage("Checkout") {
            steps {
                git url: 'https://github.com/BigMoistLochu/JenkinsJavaApp', branch: 'main'
            }
        }
        stage("Compile and Build") {
            steps {
                sh '''
                ls
                '''
            }
        }
        
    }
}
