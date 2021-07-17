package com.generation.Loja.de.games.model;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.validation.constraints.NotNull;

	@Entity
	public class Categoria {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		
		@NotNull
	    public String descricao;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getDescricao() {
			return descricao;
		}
        
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		} 
		
		
		
}
