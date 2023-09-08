def call(Map config = [:]){
    git branch: config.branch, credentialsId: config.user, url: config.url
    sh "ls -lat"
}
