package universal.pipeline

interface PipelineCIExecutor extends PipelineExecutor{

    void checkoutRepo()

    compileProject()

    runTests()

    scanCodeQuality()

    scanCodeVulnerability()

    executeCustomService(Closure closure)

    tagBranch(String buildNumber)

    bundleArtifact(String artifactName)

    publishArtifact(artifactName)

    buildImage(String imageName)

    publishImage(String imageName)

    publishBuildEvidence()
}
