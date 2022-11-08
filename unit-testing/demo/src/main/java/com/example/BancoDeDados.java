package com.example;

import java.util.logging.Logger;

public class BancoDeDados {
  private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

  public static void iniciarConexao() {
    LOGGER.info("Iniciar");
  }

  public static void finalizarConexao() {
    LOGGER.info("Finalizou");
  }

  public static void insereDados(Pessoa pessoa) {
    LOGGER.info("Inseriu dados");
  }

  public static void removeDados(Pessoa pessoa) {
    LOGGER.info("Removeu dados");
  }
}
