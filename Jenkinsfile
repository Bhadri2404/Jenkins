pipeline {
  agent any
  stages {
    stage("run script"){
      steps{
        sh 'chmod 777 script.sh'
        sh './script.sh'
      }
    }
  }
}
