package com.mycareer.api.resource;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycareer.api.event.ResourceCreatedEvent;
import com.mycareer.api.model.Alerts;
import com.mycareer.api.repository.AlertsRepository;

@RestController
@RequestMapping("/alertsweb")
public class AlertsWebResource {

	@Autowired
	private AlertsRepository alertsRepository;
	

	@Autowired
	private ApplicationEventPublisher publisher;

	
	@PostMapping
	public ResponseEntity<Alerts> save(@Valid @RequestBody Alerts alert, HttpServletResponse response) {
		Alerts saveAlert = alertsRepository.save(alert);
		publisher.publishEvent(new ResourceCreatedEvent(this, response, saveAlert.getCode()));
		return ResponseEntity.status(HttpStatus.CREATED).body(saveAlert);
	}

}