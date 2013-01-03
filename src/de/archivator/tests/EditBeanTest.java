/*
 * This file is part of archivator, a software system for managing
 * and retrieving archived items.
 *
 * Copyright (C) 2012  burghard.britzke
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.archivator.tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.lang.reflect.Field;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Before;
import org.junit.Test;

import de.archivator.beans.EditBean;
import de.archivator.entities.Archivale;

/**
 * Testet die EditBean.
 * @author bubi
 */
public class EditBeanTest {

	private EditBean proband;
	private EntityManager entityManager;
	private EntityTransaction entityTransaction;
	private Archivale aktuellesArchivale;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		proband = new EditBean();
		entityManager =  mock(EntityManager.class);
		entityTransaction = mock(EntityTransaction.class);
		when(entityManager.getTransaction()).thenReturn(entityTransaction);
		aktuellesArchivale = mock(Archivale.class);
		
		// entityManager muss manuell injiziert werden
		Field f= proband.getClass().getDeclaredField("entityManager");
		f.setAccessible(true);
		f.set(proband, entityManager);
		// aktuellesArchivale muss manuell injiziert werden
		f=proband.getClass().getDeclaredField("aktuellesArchivale");
		f.setAccessible(true);
		f.set(proband, aktuellesArchivale);
	}

	/**
	 * Test method for {@link de.archivator.beans.EditBean#lösche()}.
	 */
	@Test
	public void testLösche() {
		String navigation = proband.lösche();
		assertEquals("lösche() muss auf die Index-Seite navigieren", "index", navigation);
		verify(entityManager).getTransaction();
		verify(entityTransaction).begin();
		verify(entityManager).remove(aktuellesArchivale);
		verify(entityTransaction).commit();
	}

	/**
	 * Test method for {@link de.archivator.beans.EditBean#speichere()}.
	 */
	@Test
	public void testSpeichere() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link de.archivator.beans.EditBean#erstelle()}.
	 */
	@Test
	public void testErstelle() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link de.archivator.beans.EditBean#loadNamen()}.
	 */
	@Test
	public void testLoadNamen() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link de.archivator.beans.EditBean#saveNamen()}.
	 */
	@Test
	public void testSaveNamen() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link de.archivator.beans.EditBean#loadOrganisationseinheiten()}.
	 */
	@Test
	public void testLoadOrganisationseinheiten() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link de.archivator.beans.EditBean#saveOrganisationseinheiten()}.
	 */
	@Test
	public void testSaveOrganisationseinheiten() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link de.archivator.beans.EditBean#loadSchlagworte()}.
	 */
	@Test
	public void testLoadSchlagworte() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link de.archivator.beans.EditBean#saveSchlagworte()}.
	 */
	@Test
	public void testSaveSchlagworte() {
		fail("Not yet implemented");
	}

}