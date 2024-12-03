def call(string appname,string tag,string DockerHubUsr){
  docker build -t "$(DockerHubUsr)"/"$(appname)":"$(tag)" .
}
