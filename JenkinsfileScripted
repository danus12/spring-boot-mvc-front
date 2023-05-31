def mvn
node {
	stage('Get tools') {
		def maven_home = tool 'maven-3.9.2'
		mvn = "${maven_home}/bin/mvn"
	}
	stage('Get maven version') {
		sh "${mvn} --version"
	}
}
