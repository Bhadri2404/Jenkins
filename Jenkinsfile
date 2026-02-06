pipeline {
  agent any
  stages {
    stage("run script"){
      steps{
        sh 'chmod 755 script.sh'
        sh './script.sh'
      }
    }
  }
}
