def call(String projectname String dockerhubuser){
  withDockerRegistry(credentialsid: docker, toolname: Docker){
    sh " docker image tag notes-app sharuquee/notes-app:$BUILD_ID "
    sh " docker push sharuquee/notes-app:$BUILD_ID "
  }
