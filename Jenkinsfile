pipeline {
  agent any
  stages {
    stage('docker-login'){
      steps{
        echo "Logging in to Docker Hub..."
        withCredentials([usernamePassword(credentialsId: 'Docker', usernameVariable: 'DOCKERHUB_USERNAME', passwordVariable: 'DOCKERHUB_PASSWORD')]) {
          sh "echo $DOCKERHUB_PASSWORD | docker login -u $DOCKERHUB_USERNAME --password-stdin"
        }
      }
    }
    stage('docker pull'){
      steps{
        echo "Pulling Docker image..."
        sh "docker pull hello-world:latest"
      }
    }
  }
}
