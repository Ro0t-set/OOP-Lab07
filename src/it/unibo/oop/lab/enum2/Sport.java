/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

	/*
	 * // * TODO // * // * Declare the following sports: // * // * - basket // * //
	 * * - volley // * // * - tennis // * // * - bike // * // * - F1 // * // * -
	 * motogp // * // * - soccer // * //
	 */

	/*
	 * TODO
	 * 
	 * [FIELDS]
	 * 
	 * Declare required fields
	 */

	BASKET(Place.INDOOR, 5, "Basketball"),

	VOLLEY(Place.INDOOR, 6, "Volleyball"),

	TENNIS(Place.OUTDOOR, 1, "Tennis"),

	BIKE(Place.OUTDOOR, 1, "Road biking"),

	F1(Place.OUTDOOR, 1, "Formula 1"),

	MOTOGP(Place.OUTDOOR, 1, "MotoGP"),

	SOCCER(Place.OUTDOOR, 11, "Football");

	private final Place place;
	private final Integer teamMembersCount;
	private final String actualName;

	Sport(final Place pl, final int teamMembers, final String realName) {
		this.place = pl;
		this.teamMembersCount = teamMembers;
		this.actualName = realName;
	}

	public boolean isIndividualSport() {
		return this.teamMembersCount == 1;

	}

	public boolean isIndoorSport() {
		return this.place == Place.INDOOR;
	}

	public Place getPlace() {
		return place;
	}

	public String toString() {
		return "" + this.place + "" + this.teamMembersCount + "" + this.actualName + "";

	}

	/*
	 * TODO
	 * 
	 * [CONSTRUCTOR]
	 * 
	 * Define a constructor like this:
	 * 
	 * - Sport(final Place place, final int noTeamMembers, final String actualName)
	 */

	/*
	 * TODO
	 * 
	 * [METHODS] To be defined
	 * 
	 * 
	 * 1) public boolean isIndividualSport()
	 * 
	 * Must return true only if called on individual sports
	 * 
	 * 
	 * 2) public boolean isIndoorSport()
	 * 
	 * Must return true in case the sport is practices indoor
	 * 
	 * 
	 * 3) public Place getPlace()
	 * 
	 * Must return the place where this sport is practiced
	 * 
	 * 
	 * 4) public String toString()
	 * 
	 * Returns the string representation of a sport
	 */
}
