package com.uplus.eureka;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(
        properties = {"spring.config.location=classpath:application.properties"
        }
)
@ComponentScan(basePackages = {"com.uplus.eureka"})
class SpringBootTestApplicationTests {
    private Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private DataSource ds;

    @Test
    public void dsTest() {
        //null 체크 함수
        assertNotNull(ds);
    }

}
