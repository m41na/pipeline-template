package features

import org.junit.Test

class SwitchExpressionTest  {

    @Test
    void test_switch_expression() {
        assert SwitchExpression.test(0) == 'zero'
        assert SwitchExpression.test(1) == 'one'
        assert SwitchExpression.test([]) == 'an empty list'
        assert SwitchExpression.test([1,'a',true]) == 'a list'
        assert SwitchExpression.test(null) == 'just a null'
        assert SwitchExpression.test('007') == 'James Bond'
        assert SwitchExpression.test([map: true]) == 'Unknown'
    }
}
