def call(String dockerhubuser, String projectname String imagetag){
  sh " docker build -t sharuquee/notes-app:latest . "
}
