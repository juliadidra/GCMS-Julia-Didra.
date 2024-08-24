package br.edu.ifpe.recife.gcms.WebApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebAppApplicationTests {
	
@Test
    public void shouldReturnjulia() throws Exception {
        this.mockMvc.perform(get("/julia"))
                        .andDo(print()).andExpect(status().isOk())
                        .andExpect(content()
                                        .string(containsString("Hello, Julia Didra!"));
}

@Test
public void shouldReturnclone() throws Exception {
        this.mockMvc.perform(get("/clone"))
                        .andDo(print()).andExpect(status().isOk())
                        .andExpect(content()
                                        .string(containsString("Hello, clone!"));
}

@Test
public void shouldReturnhotfix() throws Exception {
        this.mockMvc.perform(get("/hotfix"))
                        .andDo(print()).andExpect(status().isOk())
                        .andExpect(content()
                                        .string(containsString("Hello, hotfix!"));
}




}
