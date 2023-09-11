package demo

import spock.lang.Specification
import spock.lang.Unroll

class DemoParamSpec extends Specification {

    @Unroll
    def "parameterized calculator test for addition using tabular format"() {
        given: "a calculator instance"
        //act
        var calc = new Calculator()

        when: "two integer numbers are added"
        //arrange
        var result = calc.add(left, right)

        then: "assert expected value is correct"
        //assert
        result == expected

        where: "using the following test parameters"
        //test parameters
        left | right | expected
        10   | 20    | 30
        -20  | 50    | 30
    }

    @Unroll
    def "parameterized calculator test for subtraction using list format"() {
        given: "a calculator instance"
        //act
        var calc = new Calculator()

        when: "two integer numbers are subtracted"
        //arrange
        var result = calc.subtract(left, right)

        then: "assert expected value is correct"
        //assert
        result == expected

        where: "using the following test parameters"
        //test parameters
        left << [10, 20]
        right << [-20, 50]
        expected << [30, -30]
    }

    def '#x plus #y should be #z'(){
        expect:
        x + y == z

        where:
        x   |   y   ||  z
        -1  |   4   ||  3
        11  |   -5  ||  6
        71  |   12  ||  83
    }
}
