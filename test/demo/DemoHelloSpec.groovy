package demo

import spock.lang.Specification

class DemoHelloSpec extends Specification{

    def "validate concatenating #string1 and #string2" (){
        given:
        //act
        var string1 = "hello"
        var string2 = " world"

        when:
        //arrange
        var concatResult = string1.concat(string2)

        then:
        //assert
        concatResult == "hello world"
    }
}
