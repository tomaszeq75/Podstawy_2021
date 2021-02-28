package zadania0222;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    // JUnit jupiter & lambda
    @Test
    void shouldThrowFullExcepion() {
        // given
        Basket basket = new Basket(10);
        // when
        BasketFullException thrown = assertThrows(
                BasketFullException.class,
                () -> basket.addToBasket());

        // then
        assertSame(thrown.getMessage(), Messages.FULL.getMessage());
    }

    @Test
    void shouldNotThrowFullExcepion() {
        // given
        Basket basket = new Basket(9);
        // then
        assertDoesNotThrow(() -> basket.addToBasket());
    }

    @Test
    void shouldBeIncreased() throws BasketFullException {
        // given
        Basket basket = new Basket(9);
        // when
        basket.addToBasket();
        // then
        assertEquals(10, basket.getAmountOfItems());
    }

    // assertJ & method reference
    @Test
    void shouldThrowEmptyExcepion() {
        // given
        Basket basket = new Basket();
        // then
        assertThatExceptionOfType(BasketEmptyException.class)
                .isThrownBy(basket::removeFromBasket);
    }

    @Test
    void shouldNotThrowEmptyExcepion() {
        // given
        Basket basket = new Basket(1);
        // then
        assertThatNoException()
                .isThrownBy(basket::removeFromBasket);
    }

    @Test
    void shouldBeDecreased() throws BasketEmptyException {
        // given
        Basket basket = new Basket(9);
        // when
        basket.removeFromBasket();
        // then
        assertThat(basket.getAmountOfItems())
                .isEqualTo(8);
    }
}