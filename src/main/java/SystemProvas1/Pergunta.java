package SystemProvas1;

public class Pergunta {

	private String enunciado;
	private String alternativaA;
	private String alternativaB;
	private String alternativaC;
	private String alternativaD;
	private static String gabarito;
	private static Boolean respostaDoUsuario;

	public Pergunta() {
		super();
	}

	public Pergunta(String enunciado, String alternativa1, String alternativa2, String alternativa3,
			String alternativa4, String gabarito) {
		super();
		this.enunciado = enunciado;
		this.alternativaA = alternativa1;
		this.alternativaB = alternativa2;
		this.alternativaC = alternativa3;
		this.alternativaD = alternativa4;
		this.gabarito = gabarito;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getAlternativaA() {
		return alternativaA;
	}

	public void setAlternativaA(String alternativaA) {
		this.alternativaA = alternativaA;
	}

	public String getAlternativaB() {
		return alternativaB;
	}

	public void setAlternativaB(String alternativaB) {
		this.alternativaB = alternativaB;
	}

	public String getAlternativaC() {
		return alternativaC;
	}

	public void setAlternativaC(String alternativaC) {
		this.alternativaC = alternativaC;
	}

	public String getAlternativaD() {
		return alternativaD;
	}

	public void setAlternativaD(String alternativaD) {
		this.alternativaD = alternativaD;
	}

	public static String getGabarito() {
		return gabarito;
	}

	public void setGabarito(String gabarito) {
		Pergunta.gabarito = gabarito;
	}

	public static Boolean getRespostaDoUsuario() {
		return respostaDoUsuario;
	}

	public void setRespostaDoUsuario(Boolean respostaDoUsuario) {
		Pergunta.respostaDoUsuario = respostaDoUsuario;
	}

	@Override
	public String toString() {
		return enunciado + "\n\n" + "A) " + alternativaA + "\n" + "B) " + alternativaB + "\n" + "C) " + alternativaC
				+ "\n" + "D) " + alternativaD;
	}

}
