package br.com.mena.screen_match.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);

}
