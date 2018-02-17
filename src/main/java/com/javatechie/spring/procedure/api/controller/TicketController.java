package com.javatechie.spring.procedure.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.procedure.api.dao.TicketDao;
import com.javatechie.spring.procedure.api.model.Ticket;

@RestController
public class TicketController {

	@Autowired
	private TicketDao dao;

	@GetMapping("/findTicket")
	public List<Ticket> findTickets() {
		return dao.getTicketInfo();
	}

	@GetMapping("/findTicketByCatagory/{catagory}")
	public List<Ticket> findTicketsByCataogory(@PathVariable String catagory) {
		return dao.getTicketInfoByCatagory(catagory);
	}
}
