package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class NotesController {

	@Autowired
	private NotesService notesService;

	@RequestMapping(value = "/Getnotes", method = RequestMethod.GET)
	public List getAllReservations() {
		return notesService.getAllReservations();
	}

	@RequestMapping(value = "/Getnotes/{id}", method = RequestMethod.GET)
	public Notes getReservation(@PathVariable String id) {
		return notesService.getReservation(id);
	}

	@RequestMapping(value = "/Postnotes", method = RequestMethod.POST)
	public void addReservation(@RequestBody Notes notes) {
		System.out.println("----------------"+notes.getNotes());
		notesService.addReservation(notes);

	}

	@RequestMapping(value = "/Putnotes/{id}", method = RequestMethod.PUT)
	public void updateReservation(@RequestBody Notes notes, @PathVariable Long id) {
		notesService.updateReservation(id, notes);
	}

	@RequestMapping(value = "/Deletenotes/{id}", method = RequestMethod.DELETE)
	public void deleteReservation(@PathVariable String id) {
		notesService.deleteReservation(id);
	}

	
	
}
