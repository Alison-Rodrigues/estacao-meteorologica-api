package senacestacaometeorologica.estacaometeorologicaapi.dtos;

import senacestacaometeorologica.estacaometeorologicaapi.model.RadiacaoUv;

public class WeatherDto {
	private Double temperatura;
	private Double pressao;
	private Double umidade;
	private Double chuva;
	private RadiacaoUv radUv;
	
	public Double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}
	public Double getPressao() {
		return pressao;
	}
	public void setPressao(Double pressao) {
		this.pressao = pressao;
	}
	public Double getUmidade() {
		return umidade;
	}
	public void setUmidade(Double umidade) {
		this.umidade = umidade;
	}
	public Double getChuva() {
		return chuva;
	}
	public void setChuva(Double chuva) {
		this.chuva = chuva;
	}
	public RadiacaoUv getRadUv() {
		return radUv;
	}
	public void setRadUv(RadiacaoUv radUv) {
		this.radUv = radUv;
	}
	
}
