-- --------------------------------------------------------
-- Hôte :                        sql7.freemysqlhosting.net
-- Version du serveur:           5.5.58-0ubuntu0.14.04.1 - (Ubuntu)
-- SE du serveur:                debian-linux-gnu
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Export de la structure de la table sql7268119. formations
CREATE TABLE IF NOT EXISTS `formations` (
  `id` int(11) NOT NULL,
  `titre` varchar(80) DEFAULT NULL,
  `descriptif` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Export de données de la table sql7268119.formations : ~8 rows (environ)
/*!40000 ALTER TABLE `formations` DISABLE KEYS */;
INSERT INTO `formations` (`id`, `titre`, `descriptif`) VALUES
	(1, 'Spring Framework: étape par étape pour devenir professionnel', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin ut eros accumsan, tempus justo id, feugiat felis. Nullam pretium velit urna, dictum aliquam augue mattis sed. Maecenas eu magna volutpat. '),
	(2, 'Hibernate Framework: étape par étape pour devenir professionnel', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin ut eros accumsan, tempus justo id, feugiat felis. Nullam pretium velit urna, dictum aliquam augue mattis sed. Maecenas eu magna volutpat. '),
	(3, 'Maven Framework: étape par étape pour devenir professionnel', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin ut eros accumsan, tempus justo id, feugiat felis. Nullam pretium velit urna, dictum aliquam augue mattis sed. Maecenas eu magna volutpat. ');
/*!40000 ALTER TABLE `formations` ENABLE KEYS */;

-- Export de la structure de la table sql7268119. langues
CREATE TABLE IF NOT EXISTS `langues` (
  `ID_FORMATION` int(11) DEFAULT NULL,
  `LANGUE` varchar(50) DEFAULT NULL,
  KEY `FORMATION_FK` (`ID_FORMATION`),
  CONSTRAINT `FORMATION_FK` FOREIGN KEY (`ID_FORMATION`) REFERENCES `formations` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Export de données de la table sql7268119.langues : ~15 rows (environ)
/*!40000 ALTER TABLE `langues` DISABLE KEYS */;
INSERT INTO `langues` (`ID_FORMATION`, `LANGUE`) VALUES
	(2, 'Français'),
	(1, 'Anglais'),
	(2, 'Anglais'),
	(1, 'Français'),
	(3, 'Français');
/*!40000 ALTER TABLE `langues` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
