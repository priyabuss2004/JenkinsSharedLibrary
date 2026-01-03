def call(String dockerHubUserName, String dockerHubPassword){
  sh """
    echo "----Docker Login----"
    docker login -u ${dockerHubUserName} --password ${dockerHubPassword}
    echo "----Login Success---"
   """ 
}
