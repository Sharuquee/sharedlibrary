def call(String projectname, String dockerhubuser){
  withDockerRegistry(credentialsid: docker, toolname: Docker)
    sh " docker image tag ${projectname} ${dockerhubuser}/${pojectname}:$BUILD_ID "
    sh " docker push ${dockerhubuser}/${projectname}:$BUILD_ID "
  }
