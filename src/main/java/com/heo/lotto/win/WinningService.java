package com.heo.lotto.win;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.heo.lotto.domain.Lotto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WinningService {
    public Lotto getWinningNumber(int no){
        RestTemplate restTemplate = new RestTemplate();

        String url = "https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=" + no;

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

        ObjectMapper mapper = new ObjectMapper();

        Lotto result = null;

        try {
            result = mapper.readValue(responseEntity.getBody(), Lotto.class);

            System.out.println("result >> " + result.toString());
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return result;
    }
}
