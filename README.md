# SpringSecurity example


-----query for login--
select APP_USER.id, USER_PROFILE.type, sso_id, password from APP_USER left join (APP_USER_USER_PROFILE, US
ER_PROFILE) on (APP_USER_USER_PROFILE.user_id=APP_USER.id AND APP_USER_USER_PROFILE.user_profile_id=USER_PROFILE.
id);

<<<<<<< HEAD
insert into XML_CHECK values ( 1,'asdf', 123, 321, 222, '2000-04-12', '2000-04-13', 'ff', 'dd', 'empresao', 'empresad');
=======

>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
------------------------------------------------------------------
----------------------SQL SCRIPT FOR LOGIN------------------------
------------------------------------------------------------------


/*All User's are stored in APP_USER table*/
create table APP_USER (
   id BIGINT NOT NULL AUTO_INCREMENT,
   sso_id VARCHAR(30) NOT NULL,
   password VARCHAR(100) NOT NULL,
   first_name VARCHAR(30) NOT NULL,
   last_name  VARCHAR(30) NOT NULL,
   email VARCHAR(30) NOT NULL,
   state VARCHAR(30) NOT NULL,
   PRIMARY KEY (id),
   UNIQUE (sso_id)
);

/* USER_PROFILE table contains all possible roles */
create table USER_PROFILE(
   id BIGINT NOT NULL AUTO_INCREMENT,
   type VARCHAR(30) NOT NULL,
   PRIMARY KEY (id),
   UNIQUE (type)
);

/* JOIN TABLE for MANY-TO-MANY relationship*/
CREATE TABLE APP_USER_USER_PROFILE (
    user_id BIGINT NOT NULL,
    user_profile_id BIGINT NOT NULL,
    PRIMARY KEY (user_id, user_profile_id),
    CONSTRAINT FK_APP_USER FOREIGN KEY (user_id) REFERENCES APP_USER (id),
    CONSTRAINT FK_USER_PROFILE FOREIGN KEY (user_profile_id) REFERENCES USER_PROFILE (id)
);

/* Populate USER_PROFILE Table */
INSERT INTO USER_PROFILE(type)
VALUES ('USER');

INSERT INTO USER_PROFILE(type)
VALUES ('ADMIN');

INSERT INTO USER_PROFILE(type)
VALUES ('DBA');

/* Populate APP_USER Table */
INSERT INTO APP_USER(sso_id, password, first_name, last_name, email, state)
VALUES ('bill','abc123', 'Bill','Watcher','bill@xyz.com', 'Active');

INSERT INTO APP_USER(sso_id, password, first_name, last_name, email, state)
VALUES ('danny','abc124', 'Danny','Theys','danny@xyz.com', 'Active');

INSERT INTO APP_USER(sso_id, password, first_name, last_name, email, state)
VALUES ('sam','abc125', 'Sam','Smith','samy@xyz.com', 'Active');

INSERT INTO APP_USER(sso_id, password, first_name, last_name, email, state)
VALUES ('nicole','abc126', 'Nicole','warner','nicloe@xyz.com', 'Active');

INSERT INTO APP_USER(sso_id, password, first_name, last_name, email, state)
VALUES ('kenny','abc127', 'Kenny','Roger','kenny@xyz.com', 'Active');

/* Populate JOIN Table */
INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
  SELECT user.id, profile.id FROM app_user user, user_profile profile
  where user.sso_id='bill' and profile.type='USER';

INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
  SELECT user.id, profile.id FROM app_user user, user_profile profile
  where user.sso_id='danny' and profile.type='USER';

INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
  SELECT user.id, profile.id FROM app_user user, user_profile profile
  where user.sso_id='sam' and profile.type='ADMIN';

INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
  SELECT user.id, profile.id FROM app_user user, user_profile profile
  where user.sso_id='nicole' and profile.type='DBA';

INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
  SELECT user.id, profile.id FROM app_user user, user_profile profile
  where user.sso_id='kenny' and profile.type='ADMIN';

INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
  SELECT user.id, profile.id FROM app_user user, user_profile profile
  where user.sso_id='kenny' and profile.type='DBA';



------------------------------------------------------------------
----------------------SQL SCRIPT FOR XML--------------------------
------------------------------------------------------------------

create table XML_CHECK(
    id BIGINT NOT NULL AUTO_INCREMENT,
    user_name VARCHAR(60) NOT NULL,
    valor_mercadoria INT NOT NULL,
    peso_bruto INT NOT NULL,
    peso_liquido INT NOT NULL,
    data_embarque DATE NOT NULL,
    data_chegada DATE NOT NULL,
    local_origem VARCHAR(255) NOT NULL,
    local_destino VARCHAR(255) NOT NULL,
    empresa_origem VARCHAR(255),
    empresa_destino VARCHAR(255),
    PRIMARY KEY (id)
    );
