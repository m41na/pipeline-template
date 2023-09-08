def call(){
    def tag = sh(returnStdout: true, script: "git tag --contains | head -1").trim()
    if (tag) {
        stage("deploy") {
            sh('bin/build_and_publish.sh')
        }
    }}
