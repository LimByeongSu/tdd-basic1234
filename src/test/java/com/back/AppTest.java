package com.back;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
   @Test
   @DisplayName("1과 2를 더하면 3이 나와야한다.")
   void t1(){
       App app = new App();
       int result = app.plus(1,2);

       assertThat(result).isEqualTo(3);

   }

   @Test
   @DisplayName("10+20==30")
   void t2(){
       App app = new App();
       int result = app.plus(10,20);

       assertThat(result).isEqualTo(30);
   }

    @Test
    @DisplayName("5+5=10")
    void t3(){
        App app = new App();
        int result = app.plus(5,5);

        assertThat(result).isEqualTo(10);
    }
}
