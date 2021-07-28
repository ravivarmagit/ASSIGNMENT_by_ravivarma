INSERT INTO users(username,password,enabled)
values('ravivarma',
	'ravi',
	true);
	
INSERT INTO users(username,password,enabled)
values('johnny',
	'john',
	true);
	
	INSERT INTO authorities(username,authority)
values('johnny','ROLE_USER');

	INSERT INTO authorities(username,authority)
values('ravivarma','ROLE_ADMIN');