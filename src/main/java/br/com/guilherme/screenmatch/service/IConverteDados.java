package br.com.guilherme.screenmatch.service;

public interface IConverteDados {
    <T>  T obterDados(String json, Class<T> classe);
}
