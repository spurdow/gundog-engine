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
package com.godsandtowers.core.commands;

import com.godsandtowers.core.GridTouchListener;

public class GridTouchCommand implements Runnable {
	private GridTouchListener listener;
	private int column;
	private int row;

	public GridTouchCommand(GridTouchListener listener, int column, int row) {
		this.listener = listener;
		this.column = column;
		this.row = row;
	}

	@Override
	public void run() {
		listener.touched(column, row);
	}

}