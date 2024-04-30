package com.example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.Passanger;
import com.example.response.Ticket;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class TicketRestController {

	@PostMapping("/ticket")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger psinfo)
	{
		Ticket ticket=new Ticket();
		ticket.setName(psinfo.getFname()+""+psinfo.getLname());
		ticket.setFrom(psinfo.getFrom());
		ticket.setTo(psinfo.getTo());
		ticket.setTrainNum(psinfo.getTrainNum());
		ticket.setJourneyDate(psinfo.getJourneyDate());
		ticket.setPrice("4500");
		ticket.setTrainStatus("confirmed");
		
		
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	
	
}
