pipeline {
  agent any
  parameters {
    choice(name: 'VERSION', choices: ['1.12', '1.13', '1.14'], description: 'Select the version to deploy')
  }
  stages {
    stage('Init') {
      steps{
        echo 'Initializing the pipeline...'
        gv = load 'script.groovy'
      }
    }
  stages {
    stage('Build') {
      steps{
        gv.build()
      }
    }
    stage('Test') {
      when {
        expression {
         env.BRANCH_NAME == 'main'
        }
      }
      steps{
        gv.test()
      }
    }
    stage('Deploy') {
      steps{
        gv.deploy(params.VERSION)
      }
    }
  }
}
