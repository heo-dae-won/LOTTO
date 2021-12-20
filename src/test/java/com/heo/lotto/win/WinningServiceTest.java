package com.heo.lotto.win;

import com.heo.lotto.domain.Lotto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class WinningServiceTest {

    @Test
    void 특정회차_조회후_Lotto_반환(){
        WinningService service = new WinningService();
        Lotto lotto = service.getWinningNumber(994);

        assertEquals(1,lotto.getDrwtNo1());
        assertEquals(3,lotto.getDrwtNo2());
        assertEquals(8,lotto.getDrwtNo3());
        assertEquals(24,lotto.getDrwtNo4());
        assertEquals(27,lotto.getDrwtNo5());
        assertEquals(35,lotto.getDrwtNo6());
    }

    @Test
    void 존재하지않는_회차_조회(){
        WinningService service = new WinningService();
        Lotto lotto = service.getWinningNumber(99999);

        assertEquals("fail",lotto.getReturnValue());
    }
}
