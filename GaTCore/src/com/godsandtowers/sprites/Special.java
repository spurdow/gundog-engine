/**
 * Copyright (C) 2013 Gundog Studios LLC.
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
package com.godsandtowers.sprites;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import com.gundogstudios.gl.Actions;
import com.gundogstudios.gl.Sprite;

public class Special implements Sprite, Externalizable {

	private static final int TIME_TO_LIVE = 1000;
	private BaseSpecial baseSpecial;
	private int id;

	public Special() {
	}

	public Special(BaseSpecial baseSpecial) {
		this.baseSpecial = baseSpecial;
		this.id = IDGenerator.getNextID();
	}

	public int getTimeToLive() {
		return TIME_TO_LIVE;
	}

	@Override
	public int getID() {
		return id;
	}

	@Override
	public int getLevel() {
		return 0;
	}

	@Override
	public int getAction() {
		return Actions.IDLE;
	}

	@Override
	public String getModel() {
		return baseSpecial.getName();
	}

	@Override
	public float getX() {
		return 0;
	}

	@Override
	public float getY() {
		return 0;
	}

	@Override
	public float getZ() {
		return 0;
	}

	@Override
	public Sprite getTarget() {
		return null;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(baseSpecial);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = in.readInt();
		baseSpecial = (BaseSpecial) in.readObject();
	}

}
