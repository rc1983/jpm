package com.jpm.interfaces.challenge.saveable.solution;

import java.util.List;

public interface ISavable
{
	List<String> write();
	void read(List<String> savedValues);
}
