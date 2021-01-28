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

    @Test
    public void rocketEndpointHappyCase() throws Exception{
        mockMvc.perform(get("/rocket"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.caliber25", is(0)))
                .andExpect(jsonPath("$.caliber30", is(0)))
                .andExpect(jsonPath("$.caliber50", is(0)))
                .andExpect(jsonPath("$.ready", is(false)))
                .andExpect(jsonPath("$.shipstatus", is("empty")));
    }

    @Test
    public void fillEndpointFillSomeStuff() throws Exception{
        mockMvc.perform(post("/rocket/fill")
                .param("caliber", ".25")
                .param("amount", "5000"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.received", is(".25")))
                .andExpect(jsonPath("$.amount", is(5000)))
                .andExpect(jsonPath("$.ready", is(false)))
                .andExpect(jsonPath("$.shipstatus", is("40%")));
    }

    @Test
    public void fillEndpointFillZeroStuff() throws Exception{
        mockMvc.perform(post("/rocket/fill")
                .param("caliber", ".25")
                .param("amount", "0"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.received", is(".25")))
                .andExpect(jsonPath("$.amount", is(0)))
                .andExpect(jsonPath("$.ready", is(false)))
                .andExpect(jsonPath("$.shipstatus", is("empty")));
    }

    @Test
    public void fillEndpointFillToFull() throws Exception{
        mockMvc.perform(post("/rocket/fill")
                .param("caliber", ".25")
                .param("amount", "12500"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.received", is(".25")))
                .andExpect(jsonPath("$.amount", is(12500)))
                .andExpect(jsonPath("$.ready", is(true)))
                .andExpect(jsonPath("$.shipstatus", is("full")));
    }

    @Test
    public void fillEndpointFillMoreThanFull() throws Exception{
        mockMvc.perform(post("/rocket/fill")
                .param("caliber", ".25")
                .param("amount", "12600"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.received", is(".25")))
                .andExpect(jsonPath("$.amount", is(12600)))
                .andExpect(jsonPath("$.ready", is(false)))
                .andExpect(jsonPath("$.shipstatus", is("overloaded")));
    }

    @Test
    public void fillEndpointWithErrorMessage() throws Exception{
        mockMvc.perform(post("/rocket/fill"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.error", is("I am Groot!")));
    }

}
    /*
        That without giving a parameter the status is not ok,
        and the given error response is the same as expected*/