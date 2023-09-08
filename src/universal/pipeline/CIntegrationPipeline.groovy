package universal.pipeline

class CIntegrationPipeline implements PipelineCIExecutor {

    @Delegate BasePipeline basePipeline

    @Override
    void checkoutRepo() {

    }

    @Override
    def compileProject() {
        return null
    }

    @Override
    def runTests() {
        return null
    }

    @Override
    def scanCodeQuality() {
        return null
    }

    @Override
    def scanCodeVulnerability() {
        return null
    }

    @Override
    def executeCustomService(Closure closure) {
        return null
    }

    @Override
    def tagBranch(String buildNumber) {
        return null
    }

    @Override
    def bundleArtifact(String artifactName) {
        return null
    }

    @Override
    def publishArtifact(Object artifactName) {
        return null
    }

    @Override
    def buildImage(String imageName) {
        return null
    }

    @Override
    def publishImage(String imageName) {
        return null
    }

    @Override
    def publishBuildEvidence() {
        return null
    }
}
