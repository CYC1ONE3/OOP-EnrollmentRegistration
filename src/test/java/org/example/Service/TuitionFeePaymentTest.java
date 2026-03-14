package org.example.Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


import static org.junit.jupiter.api.Assertions.*;

class TuitionFeePaymentTest {
    private TuitionFeePayment tuitionFeePayment;

    @BeforeEach
    void setup(){
        tuitionFeePayment = new TuitionFeePayment();

    }
    @Test
    @DisplayName("Calculation of Tuition Fee")
    void shouldReturnCorrectCalculationOfTuitionFee(){
        //Act


        assertEquals(3000, tuitionFeePayment.calculateTuitionFee(3,0.10));
    }
    @Test
    void shouldreturnCirrectCalculationOfTuitionFeeWithTenPercentDiscount(){
        tuitionFeePayment.calculateTuitionFee(3,0.10);
             assertEquals(2700, tuitionFeePayment.calculateTuitionFee(3,0.10));

    }
    @Test
    void shouldMakeAPayment(){
        tuitionFeePayment.calculateTuitionFee(3,0.10);
        tuitionFeePayment.makePayment(1000);

        assertEquals(1700, tuitionFeePayment.getRemainingBalance());
    }


    @Test
    void shouldCheckIfTheTuitionFeeIsNotFullyPaid(){
        tuitionFeePayment.calculateTuitionFee(3,0.10);
        tuitionFeePayment.makePayment(1000);

        assertFalse(tuitionFeePayment.isFullyPaid());
    }

    @Test
    void shouldCheckIfTheTuitionFeeIsFullyPaid(){
        tuitionFeePayment.calculateTuitionFee(3,0.10);
        tuitionFeePayment.makePayment(2700);

        assertTrue(tuitionFeePayment.isFullyPaid());
    }
}

