package com.mcaue.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {

	/**
	 * Gera senha cryptografada
	 * 
	 * @param senha
	 * @return String
	 */
	public static String gerarBCrypt(String senha) {
		if (senha == null) {
			return senha;
		}

		return new BCryptPasswordEncoder().encode(senha);
	}
	
	/**
	 * Verifica se a senha é valida
	 * 
	 * @param senha
	 * @param senhaEncode
	 * @return boolean
	 */
	public static boolean verificarSenhaValida(String senha, String senhaEncode) {
		return new BCryptPasswordEncoder().matches(senha, senhaEncode);
	}

}
