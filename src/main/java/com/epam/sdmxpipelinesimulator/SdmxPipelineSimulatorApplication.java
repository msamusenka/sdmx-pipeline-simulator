package com.epam.sdmxpipelinesimulator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Console;

@SpringBootApplication
public class SdmxPipelineSimulatorApplication {

	private final static Logger LOGGER = LoggerFactory.getLogger(SdmxPipelineSimulatorApplication.class);


	public static void main(String[] args) {
		LOGGER.info("Starting SDMX pipeline");

		SpringApplication.run(SdmxPipelineSimulatorApplication.class, args);
	}

}
