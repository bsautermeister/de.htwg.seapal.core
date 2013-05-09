package de.htwg.seapal.controller.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.controller.IPersonController;
import de.htwg.seapal.database.IPersonDatabase;
import de.htwg.seapal.model.IPerson;
import de.htwg.seapal.utils.observer.Observable;
import de.htwg.seapal.utils.logging.ILogger;

@Singleton
public class PersonController extends Observable implements IPersonController {

	protected IPersonDatabase db;
	private final ILogger logger;

	@Inject
	public PersonController(IPersonDatabase db, ILogger logger) {
		this.db = db;
		this.logger = logger;
	}

	@Override
	public UUID newPerson() {
		return db.create();
	}

	@Override
	public void deletePerson(UUID personId) {
		db.delete(personId);
	}

	@Override
	public String getPersonFirstname(UUID personId) {
		IPerson person = db.get(personId);
		if (person == null)
			return null;
		return person.getFirstname();
	}

	@Override
	public void setPersonFirstname(UUID personId, String firstname) {
		IPerson person = db.get(personId);
		if (person == null)
			return;
		person.setFirstname(firstname);
		db.save(person);
		notifyObservers();
	}

	@Override
	public String getPersonLastname(UUID personId) {
		IPerson person = db.get(personId);
		if (person == null)
			return null;
		return person.getLastname();
	}

	@Override
	public void setPersonLastname(UUID personId, String lastname) {
		IPerson person = db.get(personId);
		if (person == null)
			return;
		person.setLastname(lastname);
		db.save(person);
		notifyObservers();
	}

	@Override
	public long getPersonBirth(UUID personId) {
		IPerson person = db.get(personId);
		if (person == null)
			return 0;
		return person.getBirth();
	}

	@Override
	public void setPersonBirth(UUID personId, long birth) {
		IPerson person = db.get(personId);
		if (person == null)
			return;
		person.setBirth(birth);
		db.save(person);
		notifyObservers();
	}

	@Override
	public long getPersonRegistration(UUID personId) {
		IPerson person = db.get(personId);
		if (person == null)
			return 0;
		return person.getRegistration();
	}

	@Override
	public void setPersonRegistration(UUID personId, long registration) {
		IPerson person = db.get(personId);
		if (person == null)
			return;
		person.setRegistration(registration);
		db.save(person);
		notifyObservers();
	}

	@Override
	public int getPersonAge(UUID personId) {
		IPerson person = db.get(personId);
		if (person == null)
			return -1;
		return person.getAge();
	}

	@Override
	public void setPersonAge(UUID personId, int age) {
		IPerson person = db.get(personId);
		if (person == null)
			return;
		person.setAge(age);
		db.save(person);
		notifyObservers();
	}

	@Override
	public String getPersonNationality(UUID personId) {
		IPerson person = db.get(personId);
		if (person == null)
			return null;
		return person.getNationality();
	}

	@Override
	public void setPersonNationality(UUID personId, String nationality) {
		IPerson person = db.get(personId);
		if (person == null)
			return;
		person.setNationality(nationality);
		db.save(person);
		notifyObservers();
	}

	@Override
	public String getPersonEmail(UUID personId) {
		IPerson person = db.get(personId);
		if (person == null)
			return null;
		return person.getEmail();
	}

	@Override
	public void setPersonEmail(UUID personId, String email) {
		IPerson person = db.get(personId);
		if (person == null)
			return;
		person.setEmail(email);
		db.save(person);
		notifyObservers();
	}

	@Override
	public String getPersonTelephone(UUID personId) {
		IPerson person = db.get(personId);
		if (person == null)
			return null;
		return person.getTelephone();
	}

	@Override
	public void setPersonTelephone(UUID personId, String telephone) {
		IPerson person = db.get(personId);
		if (person == null)
			return;
		person.setTelephone(telephone);
		db.save(person);
		notifyObservers();
	}

	@Override
	public String getPersonMobile(UUID personId) {
		IPerson person = db.get(personId);
		if (person == null)
			return null;
		return person.getMobile();
	}

	@Override
	public void setPersonMobile(UUID personId, String mobile) {
		IPerson person = db.get(personId);
		if (person == null)
			return;
		person.setMobile(mobile);
		db.save(person);
		notifyObservers();
	}

	@Override
	public String getPersonStreet(UUID personId) {
		IPerson person = db.get(personId);
		if (person == null)
			return null;
		return person.getStreet();
	}

	@Override
	public void setPersonStreet(UUID personId, String street) {
		IPerson person = db.get(personId);
		if (person == null)
			return;
		person.setStreet(street);
		db.save(person);
		notifyObservers();
	}

	@Override
	public int getPersonPostcode(UUID personId) {
		IPerson person = db.get(personId);
		if (person == null)
			return -1;
		return person.getPostcode();
	}

	@Override
	public void setPersonPostcode(UUID personId, int postcode) {
		IPerson person = db.get(personId);
		if (person == null)
			return;
		person.setPostcode(postcode);
		db.save(person);
		notifyObservers();
	}

	@Override
	public String getPersonCity(UUID personId) {
		IPerson person = db.get(personId);
		if (person == null)
			return null;
		return person.getCity();
	}

	@Override
	public void setPersonCity(UUID personId, String city) {
		IPerson person = db.get(personId);
		if (person == null)
			return;
		person.setCity(city);
		db.save(person);
		notifyObservers();
	}

	@Override
	public String getPersonCountry(UUID personId) {
		IPerson person = db.get(personId);
		if (person == null)
			return null;
		return person.getCountry();
	}

	@Override
	public void setPersonCountry(UUID personId, String country) {
		IPerson person = db.get(personId);
		if (person == null)
			return;
		person.setCountry(country);
		db.save(person);
		notifyObservers();
	}

	@Override
	public String getPersonString(UUID personId) {
		IPerson person = db.get(personId);
		if (person == null)
			return null;
		return person.getString();
	}

	@Override
	public List<UUID> getPersons() {
		List<IPerson> persons = db.getAll();
		List<UUID> list = new ArrayList<UUID>();
		for (IPerson person : persons) {
			list.add(person.getUUID());
		}
		return list;
	}
}