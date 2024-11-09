def call(String projectname){
  sh " docker build -t notes-app . "
}
