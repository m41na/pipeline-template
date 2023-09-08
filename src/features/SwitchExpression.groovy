package features

class SwitchExpression {

    static String test(Serializable value){
        switch(value) {
            case null -> 'just a null'
            case 0 -> 'zero'
            case 1 -> 'one'
            case { it instanceof List && it.empty } -> 'an empty list'
            case List -> 'a list'
            case '007' -> 'James Bond'
            case ~/\d+/ -> 'a number'
            default -> 'Unknown'
        }
    }
}
