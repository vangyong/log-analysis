package cn.segema.learn.loganalysis.api;

import java.util.List;

/**
 * 
 * @author wangyong
 *
 */
public interface LogPlugin {
    List<String> parseLog(String param);
}
