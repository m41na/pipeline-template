def call(remoteUrl) {
    loadLinuxScript(name: 'githubUrlProtocol.sh')
    sh "./githubUrlProtocol.sh ${remoteUrl}"
    return "$tail -n 1"
}
