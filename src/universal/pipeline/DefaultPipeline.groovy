package universal.pipeline

class DefaultPipeline  implements PipelineExecutor{

    final script;

    DefaultPipeline(script) {
        this.script = script
    }

    @Override
    void stage(String name, Closure config) {
        script.stage(name, config)
    }

    @Override
    String sh(String command) {
        script.sh(script: command, returnStdout: true)
    }

    @Override
    void echo(String message) {
        script.echo(message)
    }
}
