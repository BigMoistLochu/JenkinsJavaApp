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
                cd ./KodAplikacji
                mvn clean compile
                java -cp target/classes app.Main
                '''
            }
        }

        stage("Unit Tests") {
            steps {
                sh '''
                ls
                cd ./KodAplikacji
                mvn clean test
                '''
            }
        }
        
    }
}
