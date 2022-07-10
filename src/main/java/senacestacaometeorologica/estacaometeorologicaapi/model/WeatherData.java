package senacestacaometeorologica.estacaometeorologicaapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@Column(name = "data_hora")
	private LocalDateTime dataHora;
	
	@Column
	private Integer temperatura;
	
	@Column
	private Double pressao;
	
	@Column
	private Integer umidade;
	
	@Column
	private String chuva;
	
	@Column(name = "rad_uv")
	private String radUv;
	
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
