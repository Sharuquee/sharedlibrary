def call(String credentialsid, String toolname, String projectname, String dockerhubuser) {
    withDockerRegistry(credentialsId: credentialsid) { 
        sh "docker image tag ${projectname}:latest ${dockerhubuser}/${projectname}:${BUILD_ID}"
        sh "docker push ${dockerhubuser}/${projectname}:${BUILD_ID}"
    }
}
