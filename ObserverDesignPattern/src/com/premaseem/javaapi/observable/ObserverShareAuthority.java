package com.premaseem.javaapi.observable;

import java.util.Observable;
import java.util.Observer;

public class ObserverShareAuthority implements Observer{

	private ObservableShare subject = null;
	
	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("Share Authority got the notification for share price update ");
		if (subject != null){
			System.out.println("Latest price of share is recieved by Authority  "+ subject.getShareprice());
		}
	}

	public ObservableShare getSubject() {
		return subject;
	}

	public void setSubject(ObservableShare subject) {
		this.subject = subject;
	}

}