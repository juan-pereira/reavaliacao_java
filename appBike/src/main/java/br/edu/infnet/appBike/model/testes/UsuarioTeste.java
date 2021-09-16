package br.edu.infnet.appBike.model.testes;

import br.edu.infnet.appBike.model.negocio.Usuario;

public class UsuarioTeste {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.setId(1);
		u1.setNome("Juan Pablo");
		u1.setEmail("juan.pereira@al.infnet.com");
		System.out.println("Usuário: " + u1);
		
		Usuario u2 = new Usuario("Maria", "maria@maria.com");
		u2.setId(2);
		System.out.println("Usuário: " + u2);
	}
}