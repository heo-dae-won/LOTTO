package com.heo.lotto.service;

import java.util.*;

public class LottoService {

    public LottoNumbers createNumber(){
        LottoNumbers lottoNumbers = new LottoNumbers(createNonDuplicateNumbers());
        return lottoNumbers;
    }

    private List<Long> createNonDuplicateNumbers() {
        List<Long> lotto;

        Long[] numbers = {1L,2L,3L,4L,5L,6L};

        lotto = Arrays.asList(numbers);

        return lotto;
    }



}
