package cn.segema.learn.loganalysis.engine.controller;

import java.util.List;

import org.springframework.boot.Banner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.segema.learn.loganalysis.engine.manager.PluginManager;

@RestController
@RequestMapping("/engine")
public class EngineController {

	@GetMapping("/{bannerId}")
	public ResponseEntity findById(@PathVariable String bannerId) {

		return new ResponseEntity(null, HttpStatus.OK);
	}

	@GetMapping("/list")
	public ResponseEntity findList(Banner banner) {
		return new ResponseEntity(null, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity add(@RequestBody String param) {
		PluginManager pluginManager = new PluginManager();
		List<String> parsed = pluginManager.parseLog(param);
		return new ResponseEntity(parsed, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity edit(@RequestBody String param) {
		return new ResponseEntity(null, HttpStatus.OK);
	}

	@DeleteMapping("/{bannerId}")
	public ResponseEntity delete(@PathVariable String bannerId) {

		return new ResponseEntity(null, HttpStatus.OK);
	}

}
