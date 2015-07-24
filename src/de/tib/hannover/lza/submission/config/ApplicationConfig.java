/**
 * 
 */
package de.tib.hannover.lza.submission.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import de.tib.hannover.lza.submission.ActivityManager;
import de.tib.hannover.lza.submission.IeCreation;
import de.tib.hannover.lza.submission.SipStatusChecker;

/**
 * @author hamanf
 * 
 */
@Configuration
@ComponentScan(basePackages = {"de.tib.hannover.lza"})
@ImportResource("WEB-INF/applicationContext.xml")
public class ApplicationConfig {
	
	
	
	@Bean
	public IeCreation eiCreation () {
		return new IeCreation();
	}
	@Bean
	public ActivityManager activityManager() {
		ActivityManager am = new ActivityManager();
	return am;
	} 
	
	@Bean
	public SipStatusChecker sipStatusChecker () {
		return new SipStatusChecker();
	}
	
}