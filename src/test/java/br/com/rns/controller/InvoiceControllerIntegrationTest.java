package br.com.rns.controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class InvoiceControllerIntegrationTest {


    @Test
    public void runTest() {
        System.out.println("passed");
    }
}
