package senacestacaometeorologica.estacaometeorologicaapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Weather")
public class WeatherData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "data_hora")
	private LocalDateTime dataHora;
	
	@Column
	private Double temperatura;
	
	@Column
	private Double pressao;
	
	@Column
	private Double umidade;
	
	@Column
	private Double chuva;
	
	@Enumerated(EnumType.STRING)
	private RadiacaoUv radUv;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
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
