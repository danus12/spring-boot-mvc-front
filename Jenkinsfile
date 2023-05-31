pipeline {
	agent any
	tools {
		maven 'maven-3.9.2'
	}
	stages{
		stage('Get maven version') {
			steps {
				sh 'mvn --version'
			}
		}
	}
}
