package com.snkit.cloudbusconfigclient;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

	@Value("${query:config server is not available}")
	private String query;

	@Value("${name:config server is not available}")
	private String name;

	@GetMapping(value = "/configClient")
	public Map<String, String> getExternalData() {
		Map<String, String> map = new HashMap<String, String>();

		map.put("name", name);
		map.put("query", query);

		return map;
	}

}
