package org.david.task;

public enum EnumStatus {
	CREATED(0), REJECTED(1), ACCEPTED(2), INPROGRESS(3), SOLVED(4), REOPEN(5), FIXED(
			6);

	private int enumIndex;

	EnumStatus(int enumIndex) {
		this.enumIndex = enumIndex;
	}

	public int getStatus() {
		return this.enumIndex;
	}

}
