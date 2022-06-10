package senacestacaometeorologica.estacaometeorologicaapi.service;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import senacestacaometeorologica.estacaometeorologicaapi.dtos.WeatherDto;
import senacestacaometeorologica.estacaometeorologicaapi.model.WeatherData;
import senacestacaometeorologica.estacaometeorologicaapi.repository.WeatherRepository;


@Service
public class WeatherService {
	
	@Autowired
	private WeatherRepository weatherRepository;
	
	public void save(WeatherDto weatherDto) {
		WeatherData weatherData = new WeatherData();
		Double temperatura = weatherDto.getTemperatura();
		Double pressao = weatherDto.getPressao();
		Double umidade = weatherDto.getUmidade();
		Double chuva = weatherDto.getChuva();
		
		weatherData.setDataHora(LocalDateTime.now());
		weatherData.setTemperatura(temperatura);
		weatherData.setPressao(pressao);
		weatherData.setUmidade(umidade);
		weatherData.setChuva(chuva);
		weatherData.setRadUv(weatherDto.getRadUv());
		
		weatherRepository.save(weatherData);
	}
}
