package cn.segema.learn.loganalysis.engine.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.segema.learn.loganalysis.api.LogPlugin;

public class PluginManager {
	private final static Logger logger = LoggerFactory.getLogger(PluginManager.class);

//	private URLClassLoader urlClassLoader;
//
//	public PluginManager(List<LogPlugin> plugins) throws MalformedURLException {
//		init(plugins);
//	}
//
//	// 将所有插件动态加载至JVM中
//	private void init(List<LogPlugin> plugins) throws MalformedURLException {
//		int size = plugins.size();
//		URL[] urls = new URL[size];
//		for (int i = 0; i < size; i++) {
//			LogPlugin plugin = plugins.get(i);
////			String filePath = plugin.getJar();
////			urls[i] = new URL("file:" + filePath);
//		}
//		urlClassLoader = new URLClassLoader(urls);
//	}

//	public LogPlugin getInstance(String className)
//			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		// 插件实例化对象，得到每一个插件具体的对象
//		Class<?> clazz = urlClassLoader.loadClass(className);
//		Object instance = clazz.newInstance();
//		return (LogPlugin) instance;
//	}

	public List<String> parseLog(String param){
		List<String> retList = new ArrayList<String>();
		ServiceLoader<LogPlugin> logPlugins  = ServiceLoader.load(LogPlugin.class);

		Iterator<LogPlugin> logPluginIterator = logPlugins.iterator();
		while(logPluginIterator.hasNext()) {
			LogPlugin logPlugin = logPluginIterator.next();
			logPlugin.parseLog(param);
			retList.add("plugin: "+logPlugin.getClass().getName()+" sucess!");
		}
		
		return retList;
	}
}
