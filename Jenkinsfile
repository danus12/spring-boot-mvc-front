pipeline {
	agent any
	tools {
		maven 'maven-3.9.2'
	}
	stages {
		stage('Echo test & unit tests'){
			parallel {
				stage('Echo test'){
					steps {
						echo 'Le step de test'
						sh 'mvn --version'
					}
				}
				stage('Unit tests'){
					steps {
						sh 'mvn test'
					}
				}
			}
		}
		stage('Packaging'){
			steps {
				sh 'mvn package -DskipTest'
				}
		}
	}
}
