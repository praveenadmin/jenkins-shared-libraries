def call(String appName, String dockerHubUser, String tag) {
    sh "docker build -t ${dockerHubUser}/${appName}:${tag} ."
}
