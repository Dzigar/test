package de.bitfork.jba.bean;

import org.apache.commons.lang3.math.NumberUtils;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChartValueBean {

	@JsonProperty("name")
	private String name;
		
	@JsonProperty("color")
	private String color;
	
	@JsonProperty("data")
	private double[] data;
	
	@Override
	public int compareTo(ChartValueBean o) {
		Integer thisName = NumberUtils.toInt(this.getName(), 0);
		Integer compareName = NumberUtils.toInt(o.getName(), 0);
		if (thisName == 0 || compareName == 0) {
			return 0;
		}
		return thisName < compareName ? -1 : 1;
	}

}
