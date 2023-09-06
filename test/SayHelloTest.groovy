import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.Before
import org.junit.Test

class SayHelloTest extends BasePipelineTest{

    def sayHello

    @Before
    void setup(){
        super.setUp()
        sayHello = loadScript("vars/sayHello.groovy")
    }

    @Test
    void testCall(){
        // create mock echo step
        helper.registerAllowedMethod("echo", [ String ]) { "Hello Jamie" }

        //call library function
        sayHello("Jamie")
    }
}
