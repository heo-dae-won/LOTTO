package com.heo.lotto;

import com.heo.lotto.service.LottoNumbers;
import com.heo.lotto.service.LottoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class LottoServiceTest {

    @Test
    void lottoNumberTest(){
        LottoService service = new LottoService();
        LottoNumbers lottoNumbers = service.createNumber();
    }

    @Test
    void validSizeTest(){
        List<Long> list = new ArrayList<>();
        Long[] longArr = {1L,2L,3L,4L,5L,6L,7L};
        list = Arrays.asList(longArr);

        List<Long> finalList = list;
        assertThrows(IllegalArgumentException.class, ()->{
            LottoNumbers lottoNumbers = new LottoNumbers(finalList);
        });
    }
}
