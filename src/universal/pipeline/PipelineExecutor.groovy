package universal.pipeline

interface PipelineExecutor extends Serializable{

    void mergeConfig(PipelineEnv env);
    void state(PipelineEnv env)
    void onStart(Closure closure)
    void stage(String name, Closure config)
    String stage();
    executeStage(PipelineEnv env)
    void echo(String message)
    void log(String message)
    void error(String message)
    terminate(PipelineEnv env)
    onCompletion(Closure closure)
    sendNotification(PipelineConfig config)
    String sh(String command)
}