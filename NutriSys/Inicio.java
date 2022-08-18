package NutriSys;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {

	Scanner read = new Scanner(System.in);
	
	
	private String nome;
    private int idade;
    private String sexo;
    private float peso;
    private float altura;
    private double IMC;
    private ArrayList <String> comentario;


    public Inicio(String nome, int idade, String sexo, float peso, float altura, double IMC)
    {
        this.nome=nome;
        this.idade=idade;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
        this.IMC=IMC;
        comentario = new ArrayList<String>();
    }
    
    public ArrayList<String> getComentario() {
		return comentario;
	}
    String comment(){
        System.out.printf("Escreve um coment�rio sobre sua dieta: ");
        String s = read.next();
        //s = read.nextLine();
        return s;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
	
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public double getIMC() {
		return IMC;
	}

	public void setIMC(double iMC) {
		IMC = iMC;
	}

	public void setDados() {
		boolean loop = true;
		int gen = 0 ;
		do{
			try {
		
    	System.out.println("\n\n-----Cadastro de Dados-----");
        System.out.print("\nEntre com seu nome: ");
        String x = read.next();
        setNome(x);
        
        System.out.print("\nEntre com sua idade: ");
        int y = read.nextInt();
        setIdade(y);
       
        
        System.out.print("\nEscolha o seu g�nero: ");
        	System.out.println("\n1- Masculino");
        	
        	System.out.println("\n2- Feminino");
        	
        	System.out.println("\n3- Outro");
        	
        	gen = read.nextInt();
        	switch(gen) {
        	case 1:
        		System.out.println("\nMasculino");
        		setSexo("Masculino");
        		break;
        	case 2:
        		System.out.println("\nFeminino");
        		setSexo("Feminino");
        		break;
        	case 3:
        		System.out.println("\nOutros");
        		setSexo("Outros");
        		break;
        		
        	}
        	
        
        System.out.print("\nEntre com seu peso: ");
        float p= read.nextFloat();
        setPeso(p);
        
        System.out.print("\nEntre com sua altura: ");
        float a= read.nextFloat();
        setAltura(a);
        
        loop = false;
    	
    }catch(InputMismatchException e) {
    			//System.err.println("\nExcecao: " + e);
    			read.nextLine();
    			System.out.println("\nDigite novamente!");}
	}while(loop);
}
	private int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void visualizarDados() {
		System.out.println("Nome: "+ getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("Sexo: "+getSexo());
		System.out.println("Altura: "+getAltura());
		System.out.println("Peso: "+getPeso());
	    
	}
	
	public void alterarDados() {
		System.out.println("\n\n-----Altera��o de Dados-----");
		System.out.print("\nEntre com seu nome: ");
	        String x = read.next();
	        setNome(x);
	        
	        System.out.print("\nEntre com sua idade: ");
	        int y = read.nextInt();
	        setIdade(y);
	        
	        System.out.print("\nEscolha o seu g�nero: ");
        	System.out.println("\n1- Masculino");
        	
        	System.out.println("\n2- Feminino");
        	
        	System.out.println("\n3- Outro");
        	
        	int gen = read.nextInt();
        	switch(gen) {
        	case 1:
        		System.out.println("\nMasculino");
        		setSexo("Masculino");
        		break;
        	case 2:
        		System.out.println("\nFeminino");
        		setSexo("Feminino");
        		break;
        	case 3:
        		System.out.println("\nOutros");
        		setSexo("Outros");
        		break;
        		
        	}
	        
	        /*System.out.print("\nEntre com seu sexo: ");
	        String z= read.next();
	        setSexo(z);*/
	        
	        System.out.print("\nEntre com seu peso: ");
	        float p= read.nextFloat();
	        setPeso(p);
	        
	        System.out.print("\nEntre com sua altura: ");
	        float a= read.nextFloat();
	        setAltura(a);
	}
    
    public void MenuPrincipal() {
    	
           	 
    }

	public static void boasvindas() {
		 System.out.println("" +
					">=>>=>        >===>            >>         >=>>=>         >=>         >=> >=> >==>    >=> >====>           >>         >=>>=>\n" +
					">>   >=>    >=>    >=>        >>=>      >=>    >=>        >=>       >=>  >=> >> >=>  >=> >=>   >=>       >>=>      >=>    >=> \n" +
					">>    >=> >=>        >=>     >> >=>      >=>               >=>     >=>   >=> >=> >=> >=> >=>    >=>     >> >=>      >=>\n" +
					">==>>=>   >=>        >=>    >=>  >=>       >=>              >=>   >=>    >=> >=>  >=>>=> >=>    >=>    >=>  >=>       >=>\n" +
					">>    >=> >=>        >=>   >=====>>=>         >=>            >=> >=>     >=> >=>   > >=> >=>    >=>   >=====>>=>         >=>\n" +
					">>     >>   >=>     >=>   >=>      >=>  >=>    >=>            >===>      >=> >=>    >>=> >=>   >=>   >=>      >=>  >=>    >=> \n" +
					">===>>=>      >===>      >=>        >=>   >=>>=>               >=>       >=> >=>     >=> >====>     >=>        >=>   >=>>=>");
			System.out.println();
		
	}
}
