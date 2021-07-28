INSERT INTO users(username,password,enabled)
values('ravivarma','$2a$10$5jsa36CX78CzEf4rI5BMtu3r43tgmh6YmZlNU52w/W.RGTxELIGFW',true);
	
INSERT INTO users(username,password,enabled)
values('johnny','$2a$10$HRBaHGNR9rTBzVnsZsDxLepZVA5unUTOk7usOOUsFraRMM.wmkNpG',true);
	
	INSERT INTO authorities(username,authority)
values('johnny','ROLE_USER');

	INSERT INTO authorities(username,authority)
values('ravivarma','ROLE_ADMIN');

