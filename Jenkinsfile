pipeline {
	agent any
	tools {
		maven 'maven-3.9.2'
	}
	stages {
		stage('Unit tests'){
			steps {
				sh 'mvn test'
				junit 'target/surefire-reports/*.xml'
			}
		}
		stage('Packaging'){
			steps {
				sh 'mvn package -DskipTests'
				archiveArtifacts artifacts: 'target/*.jar'
			}
		}
	}
}
