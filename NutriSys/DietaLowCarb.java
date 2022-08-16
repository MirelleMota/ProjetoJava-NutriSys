package NutriSys;

public class DietaLowCarb extends Dieta {

	public DietaLowCarb(String nome, int duracao, String refeicao1, String refeicao2, String refeicao3,
			String refeicao4, String descricao) {
		super("DietaLowCarb", 6, "\nCafé da Manhã: 1 tapioca de frango e queijo + 2 ovos + 1 copo de leite Desnatado + 1 fruta", 
				"\nAlmoço: 100g de Arroz Integral + 120g de frango + 100g de Legumes + 1 maça sobremesa",
				"\nLanche da tarde: 3 ovos sendo 3 claras e 1 gema + 1 banana com 25g de aveia + 1 porção de whey", 
				"\nJantar: 100g de batata inglesa + 120g de frango + salada a vontade", 
				"\nDescricao: Dieta baseada em defict calorico e diminuição de carboidratos.");
	}
}
