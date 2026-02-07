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
      input(
        message: "select the env to deploy",
        ok: "Done"
        parameters{
            choice(name: 'ENV', choices: ['dev', 'staging', 'prod'], description: 'Select the environment to deploy to')
        }
      )
        
    }
      steps{
        script {
        gv.deploy(params.VERSION)
      }
    }
  }
}

}

