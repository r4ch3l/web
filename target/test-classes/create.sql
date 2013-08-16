DROP database IF EXISTS aWebsite;
create database aWebsite  default character set utf8;
use aWebsite;

DROP TABLE IF EXISTS d_user;
CREATE TABLE d_user (
  id int(12) NOT NULL auto_increment,
  email varchar(50) NOT NULL,
  username varchar(50) default NULL,
  password varchar(50) NOT NULL,
  user_integral int(12) NOT NULL default '0',
  is_email_verify char(3),
  email_verify_code varchar(50) default NULL,
  last_login_time bigint default NULL,
  last_login_ip varchar(15) default NULL,
  PRIMARY KEY  (id),
  UNIQUE KEY email (email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS d_aboutUs_page;
CREATE TABLE d_aboutUs_page (
  id int(12) NOT NULL auto_increment,
  title varchar(50) NOT NULL,
  paragraph varchar(1000) default NULL,
  paragraph_1 varchar(1000) default NULL,
  paragraph_2 varchar(1000) default NULL,
  paragraph_3 varchar(1000) default NULL,
  publish_time bigint default NULL,
  PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS d_businessRelation_page;
CREATE TABLE d_businessRelation_page (
id int(12) NOT NULL auto_increment,
  title varchar(50) NOT NULL,
  paragraph varchar(1000) default NULL,
  paragraph_1 varchar(1000) default NULL,
  paragraph_2 varchar(1000) default NULL,
  paragraph_3 varchar(1000) default NULL,
  publish_time bigint default NULL,
  PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS d_introduction_page;
CREATE TABLE d_introduction_page (
 id int(12) NOT NULL auto_increment,
  title varchar(50) NOT NULL,
  paragraph varchar(1000) default NULL,
  paragraph_1 varchar(1000) default NULL,
  paragraph_2 varchar(1000) default NULL,
  paragraph_3 varchar(1000) default NULL,
  publish_time bigint default NULL,
  PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS d_offices_page;
CREATE TABLE d_offices_page (
  id int(12) NOT NULL auto_increment,
  title varchar(50) NOT NULL,
  paragraph varchar(1000) default NULL,
  paragraph_1 varchar(1000) default NULL,
  paragraph_2 varchar(1000) default NULL,
  paragraph_3 varchar(1000) default NULL,
  publish_time bigint default NULL,
  PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS d_ourGroup_page;
CREATE TABLE d_ourGroup_page (
  id int(12) NOT NULL auto_increment,
  title varchar(50) NOT NULL,
  paragraph varchar(1000) default NULL,
  paragraph_1 varchar(1000) default NULL,
  paragraph_2 varchar(1000) default NULL,
  paragraph_3 varchar(1000) default NULL,
  publish_time bigint default NULL,
  PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS d_feedback;
CREATE TABLE d_feedback (
  id int(12) NOT NULL auto_increment,
  name varchar(50) NOT NULL,
  email varchar(50) default NULL,
  message varchar(1000) default NULL,
  message_about varchar(200) default NULL,
  submit_time bigint default NULL,
  PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert into d_feedback(name,email,message,message_about,submit_time) values("tester","ca7erina@gmail.com","testing message left","test catagory",1364533972556);
insert into d_feedback(name,email,message,message_about,submit_time) values("tester1","ca71@gmail.com","testing message 12312312 left","test catagory2",1364533976656);
insert into d_feedback(name,email,message,message_about,submit_time) values("tester2","ca72@gmail.com","testing message 1111111111111111111111left","test catagory3",1364533952556);





insert into d_aboutUs_page(title,paragraph, paragraph_1, paragraph_2, paragraph_3,publish_time) values("About US","CCC’s origins go back to 1952 when three talented young entrepreneurs, the late Kamel Abdul-Rahman, the late Hasib Sabbagh, and Said Khoury, joined forces to create one of the first Arab construction companies.","After decades of growth, CCC continues to practice the same style of management incorporated at its founding, a style based on mutual trust with clients, ease of communication, and smooth collaboration across locations and departments. Since the company’s humble beginnings, the CCC Group has expanded to include several subsidiaries, augmenting CCC’s regional and international status. Today, CCC leads the industry in the adoption of new technology to improve construction efficiency and enhance project controls.","To learn more about CCC, please browse a more detailed company Introduction, meet our Key Personnel, explore our Offices & Projects around the world, learn some Company Facts & Statistics, find our Group members, and see our many Partners with whom we have successfully collaborated during the past half century in the construction industry.","",1364533972556);
insert into d_businessRelation_page(title,paragraph, paragraph_1, paragraph_2, paragraph_3,publish_time) 
values("Business Relation",
"Business relations are relations between stakeholders in the business process, such as employer-employee, the employer/employee and business partner, employer/employee-outsourced employee relations, etc. First you have to establish a relationship (channels: phone call, personal contact, email, etc..), later you have to properly maintain and deepen them (channels: phone call, personal contact, electronic mail, informal meetings, etc.). The relations are managed.",
"The aim of business relationships within the company's commitment are motivation to work and loyalty, the objective of business relationships with external stakeholders are increasing business performance and company image.",
"",
"",1364533972556);

insert into d_introduction_page(title,paragraph, paragraph_1, paragraph_2, paragraph_3,publish_time) 
values("Introduction","You may want to think about using the first paragraph to introduce your company and want to include:The year your company was establishedYour company’s locationIf you are a member of a group companyWhat products/services you offerAny Foreign investment that you may haveSimply state the year in which your company was established. As for your company’s location, the city and state/province are sufficient so don’t waste valuable screen space writing a historical overview of your surrounding area. People want to read about your company, not where you live.If you are a member of a group company, telling readers which group you belong to can be helpful, but remember this is your company’s introduction and not that of your group.",
"After introducing your company in paragraph one, the second paragraph would be an ideal place to establish your:Product range,services offered,Machinery and technology used,Production experience,Number of staff ,and foreign language speakers if you have them,How orders are handled,Share significant achievements that would be meaningful to buyers,When introducing your products, avoid lengthy descriptions as they belong in your product description section. Certain industries will be interested in knowing what machinery and technology you use and your production experience as well.Stating the number of people that you employ will give your reader an indication of your company’s size.Making buyers aware of significant achievements that your company has made is another effective way to differentiate your company from your competitors.",
"Many companies use the final paragraph of their company introductions to state their corporate values and invite buyers to contact them."," ",1364533972557);
insert into d_offices_page(title,paragraph, paragraph_1, paragraph_2, paragraph_3,publish_time)values("Adress","434 Cannon HOB","Washington, DC 20515",",Phone: 202 225-2511","Fax: 202225-5444",1364533972556);
insert into d_ourGroup_page(title,paragraph, paragraph_1, paragraph_2, paragraph_3,publish_time) values("Our Group","Our Group enables people like you to Come Together, Organize, Volunteer, Raise Money, to better the communities we live in and to ultimately Change The World Today!TM","After decades of growth, CCC continues to practice the same style of management incorporated at its founding, a style based on mutual trust with clients, ease of communication, and smooth collaboration across locations and departments. Since the company’s humble beginnings, the CCC Group has expanded to include several subsidiaries, augmenting CCC’s regional and international status. Today, CCC leads the industry in the adoption of new technology to improve construction efficiency and enhance project controls.","To learn more about CCC, please browse a more detailed company Introduction, meet our Key Personnel, explore our Offices & Projects around the world, learn some Company Facts & Statistics, find our Group members, and see our many Partners with whom we have successfully collaborated during the past half century in the construction industry.","",1364533972556);


insert into d_user(email,username,password) values("ca7erina@gmail.com","admin",123456);
select * from d_user;
select * from d_aboutUs_page;
select * from d_user;
select * from d_user;
show tables;

desc d_home_page;



