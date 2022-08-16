package NutriSys;

//mport java.util.ArrayList;
//import java.util.Scanner;

public abstract class Dieta {

	private String nome;
	private int duracao;
	private String refeicao1;
	private String refeicao2;
	private String refeicao3;
	private String refeicao4;
	private String descricao;

	//Scanner read = new Scanner(System.in);

	public Dieta(String nome, int duracao, String refeicao1,String refeicao2, String refeicao3, String refeicao4,String descricao)

	{
		this.nome=nome;
		this.duracao=duracao;
		this.refeicao1=refeicao1;
		this.refeicao2=refeicao2;
		this.refeicao3=refeicao3;
		this.refeicao4=refeicao4;
		this.descricao=descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getRefeicao1() {
		return refeicao1;
	}

	public void setRefeicao1(String refeicao1) {
		this.refeicao1 = refeicao1;
	}

	public String getRefeicao2() {
		return refeicao2;
	}

	public void setRefeicao2(String refeicao2) {
		this.refeicao2 = refeicao2;
	}

	public String getRefeicao3() {
		return refeicao3;
	}

	public void setRefeicao3(String refeicao3) {
		this.refeicao3 = refeicao3;
	}

	public String getRefeicao4() {
		return refeicao4;
	}

	public void setRefeicao4(String refeicao4) {
		this.refeicao4 = refeicao4;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/*public void apresentarInfo()

	{
		System.out.println("Filme: "+nome+"\nCategoria: "+categoria+"\nDuração: "+duracao
				+"\nClassificação indicativa: "+classificacaoIndicativa+"\n -----Descrição-----\n"+descricao);

		System.out.println();
		System.out.println();
		System.out.println();
	}*/
}
