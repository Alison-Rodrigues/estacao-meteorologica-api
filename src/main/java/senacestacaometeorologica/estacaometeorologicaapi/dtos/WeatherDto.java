package senacestacaometeorologica.estacaometeorologicaapi.dtos;


public class WeatherDto {
	private Integer temperatura;
	private Double pressao;
	private Integer umidade;
	private String chuva;
	private String radUv;
	
	public Integer getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(Integer temperatura) {
		this.temperatura = temperatura;
	}
	public Double getPressao() {
		return pressao;
	}
	public void setPressao(Double pressao) {
		this.pressao = pressao;
	}
	public Integer getUmidade() {
		return umidade;
	}
	public void setUmidade(Integer umidade) {
		this.umidade = umidade;
	}
	public String getChuva() {
		return chuva;
	}
	public void setChuva(String chuva) {
		this.chuva = chuva;
	}
	public String getRadUv() {
		return radUv;
	}
	public void setRadUv(String radUv) {
		this.radUv = radUv;
	}
	
	

	
}
