def gv

pipeline {
  agent any

  parameters {
    choice(
      name: 'VERSION',
      choices: ['1.12', '1.13', '1.14'],
      description: 'Select the version to deploy'
    )
  }

  stages {

    stage('Init') {
      steps {
        echo 'Initializing the pipeline...'
        script {
          gv = load 'script.groovy'
        }
      }
    }

    stage('Build') {
      steps {
        script {
          gv.build()
        }
      }
    }

    stage('Test') {
      when {
        branch 'main'
      }
      steps {
        script {
          gv.test()
        }
      }
    }

    stage('Deploy') {
      steps {
        script {
          def userInput = input(
            message: 'Select the environment to deploy',
            ok: 'Deploy',
            parameters: [
              choice(
                name: 'ENV',
                choices: ['dev', 'staging', 'prod'],
                description: 'Select the environment to deploy to'
              )
            ]
          )

          gv.deploy(params.VERSION, userInput)
        }
      }
    }
  }
}
