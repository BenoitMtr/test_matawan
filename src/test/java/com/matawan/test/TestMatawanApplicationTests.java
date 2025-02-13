package com.matawan.test;

import com.matawan.test.api.SoccerAPI;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class TestMatawanApplicationTests {

    @Autowired
    private SoccerAPI soccerAPI;

    @Test
    void contextLoads() {
        assertThat(soccerAPI).isNotNull();
    }
}
