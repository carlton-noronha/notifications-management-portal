package com.byethost12.carltonnoronha.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.byethost12.carltonnoronha.models.dtos.FilterNotificationDto;

@Controller
public class NotificationsManagementPortalController {
	@RequestMapping("/")
	public String notificationsManagementPortal(Model model) {
		model.addAttribute("filterNotification", new FilterNotificationDto());
		return "/index";
	}
}
