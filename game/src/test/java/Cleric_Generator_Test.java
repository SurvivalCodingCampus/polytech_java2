import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Cleric_Generator_Test {

    @Test
    @DisplayName("이름을 입력하면 최대 hp, mp로 초기화")
    void name() {
        //given(준비)
        //when(실행)
        final Cleric cleric = new Cleric("나서스");
        //then(검증)
        assertEquals("나서스",cleric.name);
        assertEquals(50,cleric.hp);
        assertEquals(10, cleric.mp);
    }
}