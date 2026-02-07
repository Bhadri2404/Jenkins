pipeline {
  agent any
  parameters {
    choice(name: 'VERSION', choices: ['1.12', '1.13', '1.14'], description: 'Select the version to deploy')
  }
  stages {
    stage('Init') {
      steps{
        echo 'Initializing the pipeline...'
        script {
        gv = load 'script.groovy'
      }
    }
    }
    stage('Build') {
      steps{
        script {
        gv.build()
      }
    }
   }
    stage('Test') {
      when {
        expression {
         env.BRANCH_NAME == 'main'
        }
      }
      steps{
        script {
        gv.test()
      }
    }
    }
    stage('Deploy') {
      steps{
        script {
        gv.deploy(params.VERSION)
      }
    }
  }
}

}

