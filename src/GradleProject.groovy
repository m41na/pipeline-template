

class GradleProject extends Workspace{

    @Override
    String buildTool() {
        return "gradle"
    }

    @Override
    void init(String workspaceDir){
        super.init(workspaceDir)
        println("initializing...")
    }

    @Override
    void cloneRepo() {
        println("cloning...")
    }

    @Override
    void build() {
        println("building...")
    }

    @Override
    void test() {
        println("testing...")
    }

    @Override
    void bundle() {
        println("bundling...")
    }

    @Override
    void clean() {
        println("cleaning up...")
    }
}
