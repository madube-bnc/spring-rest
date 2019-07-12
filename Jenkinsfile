pipeline {

    agent {
        docker {
            image "maven:3.6.1-jdk-8-slim"
            args "-v /root/.m2:/root/.m2"
        }
    }

    stages {

        stage("checkout") {
            steps {
                git url: "https://github.com/{{gi.goalEvent.repo.owner}}/{{gi.goalEvent.repo.name}}.git"
            }
        }

        stage("build") {
            steps {
                sh "mvn -B -DskipTests clean package"
            }
        }

        stage("test") {
            steps {
                sh "mvn test"
            }
            post {
                always {
                    junit "target/surefire-reports/*.xml"
                }
            }
        }
    }
}
