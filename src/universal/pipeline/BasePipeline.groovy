package universal.pipeline

class BasePipeline implements PipelineExecutor{

    final script
    PipelineEnv env
    PipelineConfig config

    BasePipeline(script) {
        this.script = script
    }

    @Override
    void mergeConfig(PipelineEnv env) {

    }

    @Override
    void state(PipelineEnv env) {

    }

    @Override
    void onStart(Closure closure) {

    }

    @Override
    void stage(String name, Closure config) {
        script.stage(name, config)
    }

    @Override
    String stage() {
        return null
    }

    @Override
    def executeStage(PipelineEnv env) {
        return null
    }

    @Override
    String sh(String command) {
        script.sh(script: command, returnStdout: true)
    }

    @Override
    void echo(String message) {
        script.echo(message)
    }

    @Override
    void log(String message) {

    }

    @Override
    void error(String message) {

    }

    @Override
    def terminate(PipelineEnv env) {
        return null
    }

    @Override
    def onCompletion(Closure closure) {
        return null
    }

    @Override
    def sendNotification(PipelineConfig config) {
        return null
    }
}
