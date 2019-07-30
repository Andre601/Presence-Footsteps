package eu.ha3.presencefootsteps.engine.implem;

import java.util.HashMap;
import java.util.Map;

import eu.ha3.presencefootsteps.engine.interfaces.Options;

public class ConfigOptions implements Options {
	private Map<String, Object> map;
	
	public ConfigOptions() {
		map = new HashMap<String, Object>();
	}
	
	public Map<String, Object> getMap() {
		return map;
	}
	
	@Override
	public boolean hasOption(String option) {
		return map.containsKey(option);
	}
	
	@Override
	public Object getOption(String option) {
		return map.get(option);
	}
	
	public ConfigOptions withOption(String option, Object value) {
		map.put(option, value);
		return this;
	}
}
