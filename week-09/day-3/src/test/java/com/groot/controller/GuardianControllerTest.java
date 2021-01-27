package com.groot.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype()
            );

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void grootEndpointTestWithParameterGiven() throws Exception{
        mockMvc.perform(get("/groot")
                .param("message", "something"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.received", is("something")))
                .andExpect(jsonPath("$.translated", is("I am Groot!")));
    }

    @Test
    public void grootEndpointTestWithParameterMissing() throws Exception{
        mockMvc.perform(get("/groot"))
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("I am Groot!")));
    }

    @Test
    public void yonduEndpointDivideByZero() throws Exception{
        mockMvc.perform(get("/yondu")
                .param("distance", "100.0")
                .param("time", "0"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.error", is("I am Groot!")));

    }

    @Test
    public void yonduEndpointWithParamsMissing() throws Exception{
        mockMvc.perform(get("/yondu"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.error", is("I am Groot!")));
    }

    @Test
    public void yonduEndpointHappyCase() throws Exception{
        mockMvc.perform(get("/yondu")
                .param("distance", "100.0")
                .param("time", "10.0"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.distance", is(100.0)))
                .andExpect(jsonPath("$.time", is(10.0)))
                .andExpect(jsonPath("$.speed", is(10.0)));
    }

}
