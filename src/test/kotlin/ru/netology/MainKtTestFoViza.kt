package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTestFoViza {

    @Test
    fun payAdditional_shouldReturnForVkPayViza() {
        //arrange
        val cardType = "Viza"
        val amount = 30
        val transferBefore = 45000
        //act
        val result = payAdditional(
            amount = amount,
            cardType = cardType,
            transferBefore = transferBefore

        )
        //assert
        assertEquals(100, result)
    }
}