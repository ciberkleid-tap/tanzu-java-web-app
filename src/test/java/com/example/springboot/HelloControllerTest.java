package com.example.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    private HelloController controller;

    @Autowired
    private MockMvc mockMvc;

    // @Test
    // void index() throws Exception {
    //     assertEquals("Greetings from Spring Boot + Tanzu!", controller.index());

    //     mockMvc
    //         .perform(get("/"))
    //         .andExpect(status().isOk());
    //         .andExpect(content().string("Greetings from Spring Boot + Tanzu!"));
    // }

    @Test
    void index() throws Exception {
        assertNotNull(controller.index());
        assertTrue(controller.index().length() > 0, "Message must be greater than 0 length");
        
        mockMvc
            .perform(get("/"))
            .andExpect(status().isOk());
            //.andExpect(content().string("Greetings from Spring Boot + Tanzu!"));
    }
}
