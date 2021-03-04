package br.com.alura.loja.http;

import java.net.URL;
import java.util.Map;

import sun.net.www.URLConnection;

public class JavaHttpClient implements HttpAdapter {

	@Override
	public void post(String url, Map<String, Object> dados) {
		try {
			URL urlDaApi = new URL(url);
			java.net.URLConnection connection = urlDaApi.openConnection();
			connection.connect();
		} catch (Exception e) {
			throw new RuntimeException("Erro ao enviar requisicao HTTP", e);
		}

	}

}
