package org.agoncal.book.javaee7.chapter21.ex09;

import org.agoncal.book.javaee7.chapter21.ex10.CardValidator10;
import org.agoncal.book.javaee7.chapter21.ex10.CreditCard10;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 7 with Glassfish 4
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
public class CardValidator09Test {

  @Test
  public void shouldCheckCreditCardValidity() {

    CreditCard10 creditCard = new CreditCard10("12341234", "10/10", 1234, "VISA");

    CardValidator10 cardValidator = new CardValidator10();
    assertFalse("Credit card should be valid", cardValidator.validate(creditCard));
    creditCard.setNumber("2");
    assertFalse("Credit card should be valid", cardValidator.validate(creditCard));

    creditCard.setNumber("12341233");
    assertTrue("Credit card should not be valid", cardValidator.validate(creditCard));
    creditCard.setNumber("1");
    assertTrue("Credit card should not be valid", cardValidator.validate(creditCard));
  }
}