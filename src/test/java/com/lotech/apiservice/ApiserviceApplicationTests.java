package com.lotech.apiservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloWorldController.class)
class ApiserviceApplicationTests {
    @Autowired
    MockMvc mvc;

    @Test
    void contextLoads() {
    }

    @Test
    void getHelloWorld() throws Exception {
        mvc.perform(get("/"))
                .andExpect(status().isOk());
    }

}
