package com.example;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class PessoaTest {

  @Test
  void deveCalcularIdadeCorretamente() {
    Pessoa jessica = new Pessoa("Jéssica", LocalDate.of(2000, 1, 1));
    Assertions.assertEquals(22, jessica.getIdade());
  }

  @Test
  void deveRetornarSeEhMaiorDeIdade() {
    Pessoa jessica = new Pessoa("Jéssica", LocalDate.of(2000, 1, 1));
    Assertions.assertTrue(jessica.ehMaiorDeIdade());

    Pessoa joao = new Pessoa("João", LocalDate.of(2018, 1, 1));
    Assertions.assertFalse(joao.ehMaiorDeIdade());
  }
}
