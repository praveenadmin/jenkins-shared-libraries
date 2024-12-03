def call(string url, string branch){
  echo "This is cloning stage"
  git url: "${url}", branch: "${branch}"
  echo "Code is cloned"
}
