pipeline {
	agent any
	tools {
		maven 'maven-3.9.2'
	}
	stages {
		stage('Unit tests'){
			steps {
				sh 'mvn test'
			}
			post {
				always {
					junit 'target/surefire-reports/*.xml'
				}
			}
		}
		stage('Packaging'){
			steps {
				sh 'mvn package -DskipTests'
			}
			post {
				always {
					archiveArtifacts artifacts: 'target/*.jar'
				}
			}
		}
	}
}
