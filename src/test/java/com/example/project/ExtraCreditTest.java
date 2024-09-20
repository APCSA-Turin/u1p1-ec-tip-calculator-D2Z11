package com.example.project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExtraCreditTest {
    @Test
    void testExtraCredit(){
        ExtraCredit calculator = new ExtraCredit();
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        
        String items = "salmon\npizza\nsalad\nfrench fries\nmilkshake\n";
        String expectedOutput = "-------------------------------\n" +
                                "Total bill before tip: $52.27\n" +
                                "Total percentage: 25%\n" +
                                "Total tip: $13.07\n" +
                                "Total Bill with tip: $65.34\n" +
                                "Per person cost before tip: $8.71\n" +
                                "Tip per person: $2.18\n" +
                                "Total cost per person: $10.89\n" +
                                "-------------------------------\n"+
                                "Items ordered:\n"+
                                "salmon\npizza\nsalad\nfrench fries\nmilkshake\n";
        String studentOutput = calculator.calculateTip(people,percent, cost, items);
        assertEquals(expectedOutput,studentOutput);
    }
    
    
}
