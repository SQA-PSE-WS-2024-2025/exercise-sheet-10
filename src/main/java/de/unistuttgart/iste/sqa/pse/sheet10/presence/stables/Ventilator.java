package de.unistuttgart.iste.sqa.pse.sheet10.presence.stables;

import java.util.Date;

/**
 * This class represents a ventilator which should be opened independent of the
 * current temperature.
 *
 * @version 1.0
 */
public class Ventilator {
	private final int id;
	private boolean on;
	private final int width;
	private final Date purchaseDate;
	private final int height;

	public Ventilator(final int id, final int width, final int height, final boolean on, final Date purchaseDate) {
		super();
		this.id = id;
		this.width = width;
		this.height = height;
		this.on = on;
		this.purchaseDate = purchaseDate;
	}

	void turnOn() {
		this.on = true;
	}

	protected void turnOff() {
		this.on = false;
	}

	protected boolean isOn() {
		return this.on;
	}

	public int getId() {
		return id;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}
}
