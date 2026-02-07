pipeline {
  agent any
  stages {
    stage('Build') {
      steps{
        echo 'Building the application...'
      }
    }
    stage('Test') {
      when {
        expression {
         BRANCH_NAME == 'Test'
        }
      }
      steps{
        echo 'Running tests...'
      }
    }
    stage('Deploy') {
      steps{
        echo 'Deploying the application...'
      }
    }
  }
}
