import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.Before
import org.junit.Test

class JenkinsUnitTest extends BasePipelineTest{

    @Override
    @Before
    void setUp(){
        super.setUp()
        binding.setVariable('scm', [
                $class                              : 'GitSCM',
                branches                            : [[name: 'main']],
                doGenerateSubmoduleConfigurations   : false,
                extensions                          : [],
                submoduleCfg                        : [],
                useRemoteConfigs                    : [[url: "/var/git-repo"]]
        ])
    }

    @Test
    void should_execute_jenkinsfile_without_issues() throws Exception{
        runScript ('jenkins/Jenkinsfile-unit')
        printCallStack()
    }
}
