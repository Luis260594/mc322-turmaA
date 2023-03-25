package laboratorio2;

public class Main {

	public static void main(String[] args) {
		
		
		
		Seguradora seguradora1 = new Seguradora("Seguradora1", "95959595", "seguradora1@gmail.com",
				"Avenida Zeferino Vaz");
		
		System.out.println("Seguradora:");
		
         
		System.out.println(seguradora1.getNome() );
		
		System.out.println(seguradora1.getTelefone() );
		
		System.out.println(seguradora1.getEmail() );
		
		System.out.println(seguradora1.getEndereco() );
		
		
		Cliente cliente1 = new Cliente("João", "43278575852", "01011990", "Avenida Zeferino Vaz", 33);
		
		
		System.out.println(cliente1.toString());
		
		
		System.out.println(cliente1.validarCPF("43278475852"));
		
		
		Veiculo veiculo1 = new Veiculo("ABC1234", "Gol", "ModeloA");
		
		System.out.println("Veículo:");
 
		
        System.out.println(veiculo1.getPlaca() );
		
		System.out.println(veiculo1.getMarca() );
		
		System.out.println(veiculo1.getModelo() );
		
		
		
		Sinistro acidente1 = new Sinistro("01012023", "Avenida Zeferino Vaz");
		
		System.out.println("Sinistro:");
		
        System.out.println("ID: " + acidente1.getId() );
		
		System.out.println(acidente1.getData() );
		
		System.out.println(acidente1.getEndereco() );
		
		
		
		
		
	}

}
