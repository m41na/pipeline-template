package demo

import spock.lang.Specification

class DemoThrownSpec extends Specification{

    def "should throw exception" (){
        when:
        var i = 4 / 0

        then:
        thrown(RuntimeException)
    }
}
