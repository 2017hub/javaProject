package com.documendation.designpatterns;

import com.documendation.designpatterns.common.ArraySort;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignpatternsApplicationTests {

    @Test
    public void contextLoads() {
      //  ArraySort.arrSort();
        ArraySort.quiteSort();
    }

}
