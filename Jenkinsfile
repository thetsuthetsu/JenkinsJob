pipeline {
    agent any
    stages { 
        stage('PWD') {
            steps {
                sh 'pwd'
            }
        }
        stage('LS') {
            steps {
                sh 'ls -l'
            }
        }
        stage('DETECT') {
            steps {
                hub_detect '''--blackduck.url=https://192.168.150.213 --blackduck.username=sysadmin --blackduck.password=blackduck --blackduck.trust.cert=true'''
            }
        }
    }
}
