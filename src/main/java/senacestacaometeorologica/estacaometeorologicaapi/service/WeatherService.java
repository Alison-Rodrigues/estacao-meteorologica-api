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
		Integer temperatura = weatherDto.getTemperatura();
		Double pressao = weatherDto.getPressao();
		Integer umidade = weatherDto.getUmidade();
		String chuva = weatherDto.getChuva();
		String radUv = weatherDto.getRadUv();
		
		weatherData.setDataHora(LocalDateTime.now());
		weatherData.setTemperatura(temperatura);
		weatherData.setPressao(pressao);
		weatherData.setUmidade(umidade);
		weatherData.setChuva(chuva);
		weatherData.setRadUv(radUv);
		
		weatherRepository.save(weatherData);
	}
}
