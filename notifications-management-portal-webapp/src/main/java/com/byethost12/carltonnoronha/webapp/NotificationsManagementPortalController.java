package com.byethost12.carltonnoronha.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NotificationsManagementPortalController {
	@RequestMapping("/")
	public String notificationsManagementPortal() {
		return "/index";
	}
}
