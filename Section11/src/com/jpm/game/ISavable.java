package com.jpm.game;

import java.util.List;

public interface ISavable
{
	List<String> write();
	void read(List<String> savedValues);
}
