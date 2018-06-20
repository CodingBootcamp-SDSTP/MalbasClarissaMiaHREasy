DROP TABLE IF EXISTS tblemployment;
DROP TABLE IF EXISTS tblemployee;

CREATE TABLE tblemployee (
	employeeid INT(11) NOT NULL auto_increment,
	firstname VARCHAR(50) NOT NULL,
	middlename VARCHAR(50) NOT NULL,
	lastname VARCHAR(50) NOT NULL,
	emailadd VARCHAR(50) NOT NULL,
	birthdate date NOT NULL,
	religion VARCHAR(50) NOT NULL,
	gender text NOT NULL,
	age INT(3) NOT NULL,
	civilstatus VARCHAR(50) NOT NULL,
	address VARCHAR(50) NOT NULL,
	PRIMARY KEY(employeeid)
);

INSERT INTO tblemployee (firstname, middlename, lastname, emailadd, birthdate, religion, gender, age, civilstatus, address) VALUES ("Richard", "S", "Hendricks", "rhendricks@siliconvalley.com", "1989-09-19", "Catholic", "male", '25', "Single", "California");

CREATE TABLE tblemployment (
	employmentid INT(11) NOT NULL auto_increment,
	employeeAssign INT(11) NOT NULL,
	experience INT(11) NOT NULL, 
	qualification VARCHAR(50) NOT NULL,
	skills VARCHAR(50) NOT NULL,
	dateHired date NOT NULL,
	status VARCHAR(50) NOT NULL,
	designation VARCHAR(50) NOT NULL,
	department VARCHAR(50) NOT NULL,
	project VARCHAR(50) NOT NULL,
	PRIMARY KEY(employmentid),
	FOREIGN KEY(employeeAssign) REFERENCES tblemployee(employeeid)
);

INSERT INTO tblemployment (employeeAssign, experience, qualification, skills, dateHired, status, designation, department, project) VALUES ((SELECT employeeid
FROM tblemployee WHERE firstname="Richard" AND middlename="S" AND lastname="Hendricks"), '5', "Bachelor Degree", "Java Programming", "2014-09-23", "Regular", "Senior Developer", "IT Department", "Google Website");



