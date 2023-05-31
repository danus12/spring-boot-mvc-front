pipeline {
	agent any
	tools {
		maven 'maven-3.9.2'
	}

	stages {
		stage('Unit tests'){
			steps {
				echo 'Le step de test'
				sh 'mvn --version'
				sh 'mvn test'
			}
		}
	}
}
