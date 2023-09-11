def call(Map config = [:]) {

    def content = libraryResource "works/hop/scripts/linux/${config.name}"
    // write file content to agent where pipeline is executing
    writeFile file: "${config.name}", text: content
    // make created file executable
    sh "chmod a+x ./${config.name}"
}
