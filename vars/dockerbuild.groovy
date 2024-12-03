def call(String appname,String tag,String DockerHubUsr){
  sh "docker build -t "$(DockerHubUsr)"/"$(appname)":"$(tag)" ."
}
