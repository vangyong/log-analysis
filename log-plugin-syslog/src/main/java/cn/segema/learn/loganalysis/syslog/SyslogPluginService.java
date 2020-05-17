package cn.segema.learn.loganalysis.syslog;

import java.util.List;

import cn.segema.learn.loganalysis.api.LogPlugin;

/**
 * 
 * @author wangyong
 *
 */
public class SyslogPluginService implements LogPlugin{
	@Override
	public List<String> parseLog(String param) {
		System.out.println(" parse mysql log ");
		return null;
	}
}
