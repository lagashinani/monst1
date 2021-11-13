import org.junit.Test

import org.junit.Assert.*
import ru.netology.payAdditional

class MainKtTestForVkPay {

    @Test
    fun payAdditional_shouldReturnForVkPay() {
        //arrange
        val cardType = "Vk Pay"
        val amount = 20000
        val transferBefore = 0

        //act
        val result = payAdditional(
            amount = amount,
            cardType = cardType,
            transferBefore = transferBefore


        )
        //assert
        assertEquals(0, result)
    }
}