package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entities.Contact;
import com.crm.services.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/listallContacts")
	public String getAllContact(ModelMap model) {
		List<Contact> contacts = contactService.getAllContact();
		model.addAttribute("contacts", contacts);
		return "contact_result";
	}
	
	@RequestMapping("/getContactById")
	public String getContactById(ModelMap model,@RequestParam("id") long id) {
		Contact contacts = contactService.getContactById(id);
		model.addAttribute("contacts", contacts);
		return "generate_bill";
	}
}
