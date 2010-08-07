/*
 * Copyright 2010 the original author or authors.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.schildbach.pte;

import java.util.Date;
import java.util.List;

/**
 * @author Andreas Schildbach
 */
public final class QueryDeparturesResult
{
	public static final QueryDeparturesResult NO_INFO = new QueryDeparturesResult(null, 0, null, null, null);
	public static final QueryDeparturesResult SERVICE_DOWN = new QueryDeparturesResult(null, 0, null, null, null);

	public final String uri;
	public final int locationId;
	public final String location;
	public final Date currentTime;
	public final List<Departure> departures;

	public QueryDeparturesResult(final String uri, final int locationId, final String location, final Date currentTime,
			final List<Departure> departures)
	{
		this.uri = uri;
		this.locationId = locationId;
		this.location = location;
		this.currentTime = currentTime;
		this.departures = departures;
	}
}