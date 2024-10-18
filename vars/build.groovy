
def call(String Project, String Imagetag, String dockerhubuser){
  sh "docker build -t ${"dockerhubuser"}/${"project"}:${"Imagetag"}
}
