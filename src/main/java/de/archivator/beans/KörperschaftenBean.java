/*
 * This file is part of archivator, a software system for managing
 * and retrieving archived items.
 *
 * Copyright (C) 2013  burghard.britzke bubi@charmides.in-berlin.de
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

package de.archivator.beans;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import de.archivator.entities.Körperschaft;

/**
 * Die KoerperschaftenBean dient der Bearbeitung von
 * Koerperschaften der Eigenschaft aktuellesArchivale aus der
 * {@link DetailBean}.
 * 
 * @author burghard.britzke bubi@charmides.in-berlin.de
 */
@Named
@RequestScoped
public class KörperschaftenBean extends
		MultiSelectionListBean<Körperschaft> {

	/**
	 * Initialisiert die Körperschaften mit einer Liste aller
	 * Koerperschaften, die in der Datenbank vorhanden sind.
	 */
	@PostConstruct
	public void init() {
		queryForAllItems = "select o from Körperschaften o order by o.name";
		archivaleItems = aktuellesArchivale.getKörperschaften();

		super.init();
	}

	@Override
	protected void refreshArchivaleItems() {
		archivaleItems = aktuellesArchivale.getKörperschaften();
	}

	@Override
	protected void resizeSelectedItems() {
		selectedItems = new Körperschaft[archivaleItems.size()];
	}
}
