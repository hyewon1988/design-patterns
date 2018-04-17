package com.design.observer.subject;

import com.design.observer.observers.Observer;

public interface Subject {
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();
}
