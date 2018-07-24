/**
 * 
 */
package com.cr7.springdemo;

import org.springframework.stereotype.Component;

/**
 * @author GameS
 *
 */
@Component
public class RandomService implements FortuneService {

	/* (non-Javadoc)
	 * @see com.cr7.springdemo.FortuneService#getFortune()
	 */
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Here we go no not that way its random pattern";
	}

}
