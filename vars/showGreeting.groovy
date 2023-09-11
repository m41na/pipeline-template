def call(Map config = [:]) {
    sh "echo Greetings from ${config.remoteUrl}. Today is ${config.dayOfWeek}"
}
