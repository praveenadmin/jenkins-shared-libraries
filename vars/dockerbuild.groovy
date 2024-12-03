def call(String appname,String tag,String DockerHubUsr){
  docker build -t "$(DockerHubUsr)"/"$(appname)":"$(tag)" .
}
