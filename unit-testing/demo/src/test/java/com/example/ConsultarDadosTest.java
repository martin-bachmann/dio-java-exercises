package com.example;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConsultarDadosTest {
  @BeforeAll
  static void configuraConexao() {
    BancoDeDados.iniciarConexao();
  }

  @BeforeEach
  void insereDadosParaTeste() {
    BancoDeDados.insereDados(new Pessoa("João", LocalDate.of(2000, 1, 1)));
  }

  @AfterEach
  void removeDadosParaTeste() {
    BancoDeDados.removeDados(new Pessoa("João", LocalDate.of(2000, 1, 1)));
  }

  @DisplayName("Valida os dados")
  @Test
  void validarDados() {
    Assertions.assertTrue(true);
    System.out.println("Teste 1");
  }

  @Test
  void validarDados2() {
    Assertions.assertTrue(true);
    System.out.println("Teste 2");
  }

  @AfterAll
  static void finalizarConexao() {
    BancoDeDados.finalizarConexao();
  }
}
