import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    @Test
    @DisplayName("mp 5를 쓰고 hp가 50이 된다")
    void selfAid() {
        //given(준비)
        final Cleric cleric = new Cleric("아서스");
        cleric.name="dyd";
        cleric.hp=5;
        cleric.mp=5;
        //when(실행)
        cleric.selfAid();
        //then(검증)
        assertEquals(50,cleric.hp);
        assertEquals(0, cleric.mp);
    }

    @Test
    @DisplayName("3초뒤에 mp가 3~5 회복 된다")
    void pray() {
    //given
    Cleric cleric = new Cleric("아서스");
    cleric.mp = 0;
    //when
    int result=cleric.pray(3);
    //then
    assertTrue(result >= 3);
    assertTrue(result <= 5);
    assertEquals(result, cleric.mp);
    }
}