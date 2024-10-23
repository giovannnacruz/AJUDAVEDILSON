package senaidev.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



	@Entity 
	@Table(name="tb_telefone")

	public class Telefone {

		
		@Id 
		@GeneratedValue( strategy = GenerationType.IDENTITY)
		
		private Long id_telefone;
		
		@Column(name="telefone")
		private int telefone;
		

		@ManyToOne
		@JoinColumn (name = "USUARIO_id_telefone")
		private Usuario id_usuario;


		public Long getId_telefone() {
			return id_telefone;
		}


		public void setId_telefone(Long id_telefone) {
			this.id_telefone = id_telefone;
		}


		public int getTelefone() {
			return telefone;
		}


		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}


		public Usuario getId_usuario() {
			return id_usuario;
		}


		public void setId_usuario(Usuario id_usuario) {
			this.id_usuario = id_usuario;
		}	
		
		
	}
