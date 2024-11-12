package de.unistuttgart.iste.sqa.pse.sheet10.presence.stables;

import java.util.Set;

/**
 * This class represents a technician who requests maintenance for the stable.
 *
 * @version 1.0
 */
public class Technician {
	private final int id;
	private final String firstName;
	private final String lastName;
	private final String phone;

	private final Set<Stable> cages;

	public Technician(
			final int id,
			final String firstName,
			final String lastName,
			final String phone,
			final Set<Stable> stables) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.cages = stables;
	}

	protected void maintenanceRequest(final Stable stable) {}

	public String getPhone() {
		return phone;
	}

	public Set<Stable> getStables() {
		return cages;
	}
}
