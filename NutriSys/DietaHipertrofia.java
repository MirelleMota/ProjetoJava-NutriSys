package NutriSys;

public class DietaHipertrofia extends Dieta {

	public DietaHipertrofia(String nome, int duracao, String refeicao1, String refeicao2, String refeicao3,
			String refeicao4, String descricao) {
		super("DietaHipertrofia", 8,
				"\nCafé da Manhã: 5 fatias de pão branco + 4/5 ovos e queijo + 1 banana + 1 maça + xícara de café com leite", 
				"\nAlmoço: 360g arroz + 280g de frango + salada a vontade + 1 fruta sobremesa + 500ml suco de laranja",
				"\nLanche da tarde: 80g de aveia + leite integral + 1 maça + 1 banana + 2 porção de whey", 
				"\nJantar: 360g macarrão + 250g de tilapia + 140g de legumes + 1 fruta sobremesa + 500ml suco de laranja", 
				"\nDescricao: Dieta baseada em superavit calórico, feita com altas quantidades de carboidratos e proteinas.");

	}

}