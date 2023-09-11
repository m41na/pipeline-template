package demo

import spock.lang.Specification

class DemoSetupSpec extends Specification {

    def "setupSpec"(){
        println "Inside setup spec - like static setup"
    }

    def "setup"(){
        println "Inside setup"
    }

    def "cleanup"(){
        println "Inside cleanup"
    }

    def "cleanupSpec"(){
        println "Inside cleanup spec - like static teardown"
    }

    def "assert city info using given-when-then"(){
        given: "a list for cities"
        def cityList = new LinkedList<CityData>()

        when: "names of cities are added"
        cityList.add(new CityData("Nairobi", 4.7))
        cityList.add(new CityData("New York", 13.9))
        cityList.add(new CityData("Mexico City", 9.3))

        then: "assert that they exist"
        cityList.get(0).name == "Nairobi"
        cityList.get(1).name == "New York"
        cityList.get(2).name == "Mexico City"
    }

    def "assert city info alternative using given-when-then"(){
        given: "a list for cities"
        def cityList = new LinkedList<CityData>()

        when: "names of cities are added"
        cityList.add(new CityData("Nairobi", 4.7))
        cityList.add(new CityData("New York", 13.9))
        cityList.add(new CityData("Mexico City", 9.3))

        then: "assert that they exist"
        cityList*.name == ["Nairobi", "New York", "Mexico City"]
    }
}
