pipeline {
  agent any
  stages {
    stage("run script"){
      steps{
        sh 'sudo chmod 777 script.sh'
        sh './script.sh'
      }
    }
  }
}
