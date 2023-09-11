def call(Map config = [:]){
    checkout scmGit(
            branches: [[name: 'v4.9.x']],
            userRemoteConfigs: [[credentialsId: ${config.credentialsId},
                                 url: "https://github.com/${config.orgName}/${config.repoName}.git"]])
}
