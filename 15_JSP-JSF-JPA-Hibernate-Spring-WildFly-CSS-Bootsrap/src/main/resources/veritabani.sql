CREATE DATABASE IF NOT EXISTS `huseyin_aydin_db` 
				   DEFAULT CHARACTER SET utf8 ;

CREATE TABLE `huseyin_aydin_db`.`personel` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `adi` VARCHAR(45) NULL COMMENT '',
  `soyadi` VARCHAR(45) NULL COMMENT '',
  `cinsiyeti` VARCHAR(10) NULL COMMENT '',
  `eposta` VARCHAR(100) NULL COMMENT '',
  `numarasi` INT NULL COMMENT '',
  `parolasi` VARCHAR(100) NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '');
    
INSERT INTO `huseyin_aydin_db`.`personel` 
(`adi`, `soyadi`, `cinsiyeti`, `eposta`, `numarasi`, `parolasi`) 
VALUES 
('Hüseyin', 'Aydın', '2', 'huseyşnaydin99@gmail.com', '1994', '99999999');

INSERT INTO `huseyin_aydin_db`.`personel` 
(`adi`, `soyadi`,  `cinsiyeti`, `eposta`, `numarasi`, `parolasi`) 
VALUES 
('Yasin', 'Aydın', '2', 'ysn5115@gmail.com', '5555',  '33333333');

INSERT INTO `huseyin_aydin_db`.`personel` 
(`adi`, `soyadi`,  `cinsiyeti`, `eposta`, `numarasi`, `parolasi`) 
VALUES 
('Süleyman', 'Çakır', '1', 'laiklikeldengidiyeah99@gmail.com', '1326', '1234TR');

SELECT * FROM `huseyin_aydin_db`.`personel`;