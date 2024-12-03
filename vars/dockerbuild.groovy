def call(String appname,String tag,String DockerHubUser){
  sh "docker build -t "$(DockerHubUser)"/"$(appname)":"$(tag)" ."
}
