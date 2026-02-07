pipeline {
  agent any
  parameters {
    choice(name: 'VERSION', choices: ['1.12', '1.13', '1.14'], description: 'Select the version to deploy')
  }
  stages {
    stage('Build') {
      steps{
        echo 'Building the application...'
      }
    }
    stage('Test') {
      when {
        expression {
         env.BRANCH_NAME == 'main'
        }
      }
      steps{
        echo 'Running tests...'
      }
    }
    stage('Deploy') {
      steps{
        echo "Deploying the application version: ${params.VERSION}..."
      }
    }
  }
}
