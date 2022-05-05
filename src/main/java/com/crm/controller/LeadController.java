package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entities.Contact;
import com.crm.entities.Lead;
import com.crm.services.ContactService;
import com.crm.services.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/view")
	public String viewCreateLeadPage() {
		return"create_lead";
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead") Lead lead) {
		leadService.saveLead(lead);
		return "create_lead";
	}
	
	@RequestMapping("/listall")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return "lead_result";
	}
	
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.getleadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}

	@RequestMapping("/convert")
	public String convertLeadById(@RequestParam("id") long id, ModelMap model) {
	 Lead lead = leadService.getleadById(id);
	 
	 Contact contact = new Contact();
	 contact.setFirstName(lead.getFirstName());
	 contact.setLastName(lead.getLastName());
	 contact.setEmail(lead.getEmail());
	 contact.setLeadSource(lead.getLeadSource());
	 contact.setMobile(lead.getMobile());
	 contactService.saveContact(contact);
	 
	 leadService.deleteLeadById(id);

	 List<Contact> contacts = contactService.getAllContact();
	 model.addAttribute("contacts", contacts);
		return "contact_result";
	}
}
