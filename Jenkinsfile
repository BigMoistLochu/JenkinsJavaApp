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
                mvn compile
                java -cp target/classes app.Main
                '''
            }
        }
        
    }
}
