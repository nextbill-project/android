/*
 * NextBill Android client application
 *
 * @author Michael Roedel
 * Copyright (c) 2020 Michael Roedel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package de.nextbill.client.enums;

public enum DiagrammCategoryEnum {
	TIME_RANGE("Zeitverlaufs-Diagramm"), TIME_RANGE_DAYS("Monatsverlauf-Diagramm"), CATEGORY("Kategorien-Vergleich"), PAYMENT_RECIPIENT("Zahlungsempfänger-Vergleich"), COST_PAYER("Träger-Vergleich")
	;

	String displayName;

	DiagrammCategoryEnum(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}

	@Override
	public String toString(){
		return displayName;
	}
}
