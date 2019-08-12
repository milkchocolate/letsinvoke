package org.mad.letsinvoke

import io.kotlintest.shouldBe
import io.kotlintest.specs.BehaviorSpec

class InvokerSpec : BehaviorSpec({
    given("the method is called") {
        `when`("everything work fine") {
            then("returns Invoke1") {
                val invoker = Invoker()
                invoker.invoke() shouldBe "Invoke1"
            }
        }
    }
})