package com.heo.lotto.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoNumbers {
    private static final int LOTTO_SIZE = 6;

    private final List<Long> lottoNumbers;

    public LottoNumbers(List<Long> lottoNumbers){
        validateSize(lottoNumbers);
        validateDuplicate(lottoNumbers);
        this.lottoNumbers = lottoNumbers;
    }

    public void validateSize(List<Long> lottoNumbers){
        if(lottoNumbers.size() > LOTTO_SIZE){
            lottoNumbers.forEach(System.out::println);
            throw new IllegalArgumentException("로또 번호는 6개보다 클수 없습니다. size : "
                    + lottoNumbers.size());
        }
    }

    private void validateDuplicate(List<Long> lottoNumbers){
        Set<Long> nonDuplicateNumbers = new HashSet<>(lottoNumbers);
        if(nonDuplicateNumbers.size() != LOTTO_SIZE){
            nonDuplicateNumbers.forEach(System.out::println);
            throw new IllegalArgumentException("로또 번호들은 중복될 수 없습니다. size : "
                    + nonDuplicateNumbers.size());
        }
    }

}
