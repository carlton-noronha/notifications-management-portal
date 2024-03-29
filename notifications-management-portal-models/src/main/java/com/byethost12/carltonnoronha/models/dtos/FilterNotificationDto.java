package com.byethost12.carltonnoronha.models.dtos;

import java.util.Date;

public class FilterNotificationDto {
	private int notificationCategoryId;
	private Date startDate;
	private Date endDate;

	public int getNotificationCategoryId() {
		return notificationCategoryId;
	}

	public void setNotificationCategoryId(int notificationCategoryId) {
		this.notificationCategoryId = notificationCategoryId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
