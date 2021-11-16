import org.junit.Test

import org.junit.Assert.*
import ru.netology.payAdditional

class MainKtTestForVkPay {

    @Test
    fun payAdditional_shouldReturn0ForVkPay() {
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

    @Test
    fun payAdditional_shouldReturn0_75PercentsForVisaAndMir() {
        //arrange
        val cardType1 = "Visa"
        val cardType2 = "Мир"
        val amount = 100000
        val transferBefore = 0

        //act
        val result1 = payAdditional(
            amount = amount,
            cardType = cardType1,
            transferBefore = transferBefore


        )

        val result2 = payAdditional(
            amount = amount,
            cardType = cardType2,
            transferBefore = transferBefore


        )
        //assert
        assertEquals(750, result1)
        assertEquals(750, result2)
    }

    @Test
    fun payAdditional_shouldReturnNotLessThan3500ForVisaAndMir() {
        //arrange
        val cardType1 = "Visa"
        val cardType2 = "Мир
        val amount = 1000
        val transferBefore = 0

        //act
        val result1 = payAdditional(
            amount = amount,
            cardType = cardType1,
            transferBefore = transferBefore


        )

        val result2 = payAdditional(
            amount = amount,
            cardType = cardType2,
            transferBefore = transferBefore


        )
        //assert
        assertEquals(3500, result1)
        assertEquals(3500, result2)
    }

    @Test
    fun payAdditional_cardIsMasterCardOrVisa_shouldReturnZeroForTotalTransferBetween300And75000() {
        //arrange
        val cardType1 = "MasterCard"
        val cardType2 = "Maestro"
        val amount = 100
        val transferBefore = 500

        //act
        val result1 = payAdditional(
            amount = amount,
            cardType = cardType1,
            transferBefore = transferBefore


        )

        val result2 = payAdditional(
            amount = amount,
            cardType = cardType2,
            transferBefore = transferBefore


        )
        //assert
        assertEquals(0, result1)
        assertEquals(0, result2)
    }


    @Test
    fun payAdditional_cardIsMasterCardOrVisa_shouldReturn0_6PercentPlus2000FromAmountForTotalTransferLessThan30000() {
        //arrange
        val cardType1 = "MasterCard"
        val cardType2 = "Maestro"
        val amount = 50
        val transferBefore = 150

        //act
        val result1 = payAdditional(
            amount = amount,
            cardType = cardType1,
            transferBefore = transferBefore


        )

        val result2 = payAdditional(
            amount = amount,
            cardType = cardType2,
            transferBefore = transferBefore


        )
        //assert
        assertEquals(2000, result1)
        assertEquals(2000, result2)
    }

    @Test
    fun payAdditional_cardIsMasterCardOrVisa_shouldReturn0_6PercentPlus2000FromAmountForTotalTransferMoreThan7500000() {
        //arrange
        val cardType1 = "MasterCard"
        val cardType2 = "Maestro"
        val amount = 7500000
        val transferBefore = 1

        //act
        val result1 = payAdditional(
            amount = amount,
            cardType = cardType1,
            transferBefore = transferBefore


        )

        val result2 = payAdditional(
            amount = amount,
            cardType = cardType2,
            transferBefore = transferBefore


        )
        //assert
        assertEquals(47000, result1)
        assertEquals(47000, result2)
    }



}