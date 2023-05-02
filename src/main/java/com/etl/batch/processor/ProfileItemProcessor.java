package com.etl.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.etl.batch.domain.Profile;
import com.etl.batch.domain.User;

public class ProfileItemProcessor implements ItemProcessor<User, Profile> {
	
	@Override
	public Profile process(User user) throws Exception {
		
		Profile transformedProfile = new Profile();
		transformedProfile.setUserId(user.getId());
		transformedProfile.setFullName(user.getFirstName()+" "+user.getLastName());
		return transformedProfile;
	}

}
