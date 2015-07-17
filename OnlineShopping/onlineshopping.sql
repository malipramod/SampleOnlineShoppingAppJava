-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 04, 2014 at 10:21 AM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `onlineshopping`
--
CREATE DATABASE IF NOT EXISTS `onlineshopping` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `onlineshopping`;

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE IF NOT EXISTS `books` (
  `BID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(55) NOT NULL,
  `Author` varchar(55) NOT NULL,
  `Publisher` varchar(55) NOT NULL,
  `Price` float NOT NULL,
  `Genre` varchar(55) NOT NULL,
  PRIMARY KEY (`BID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`BID`, `Name`, `Author`, `Publisher`, `Price`, `Genre`) VALUES
(1, 'Head First Servlet and JSP', 'Kathy Sierra and Bert Bates', 'O''Really', 500, 'Academic'),
(3, 'Java Complete Reference', 'Herbbert Schildt', 'Oracal Press', 500, 'Academic'),
(4, 'Professional Java Server Programming', 'John Devies', 'a! Express', 650, 'Academic');

-- --------------------------------------------------------

--
-- Table structure for table `mycart`
--

CREATE TABLE IF NOT EXISTS `mycart` (
  `CID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(55) NOT NULL,
  `Price` double NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Amount` double NOT NULL,
  PRIMARY KEY (`CID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `mycart`
--

INSERT INTO `mycart` (`CID`, `Name`, `Price`, `Quantity`, `Amount`) VALUES
(14, 'Professional Java Server Programming', 650, 4, 2600),
(18, 'Java Complete Reference', 500, 1, 500),
(19, 'Professional Java Server Programming', 650, 1, 650),
(20, 'Java Complete Reference', 500, 1, 500);

-- --------------------------------------------------------

--
-- Table structure for table `usermaster`
--

CREATE TABLE IF NOT EXISTS `usermaster` (
  `RegID` int(11) NOT NULL AUTO_INCREMENT,
  `EmailAdd` varchar(40) NOT NULL,
  `Password` varchar(32) NOT NULL,
  `FirstName` varchar(40) NOT NULL,
  `LastName` varchar(40) NOT NULL,
  `UserName` varchar(40) NOT NULL,
  PRIMARY KEY (`RegID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `usermaster`
--

INSERT INTO `usermaster` (`RegID`, `EmailAdd`, `Password`, `FirstName`, `LastName`, `UserName`) VALUES
(1, 'admin@admin.com', 'admin', 'admin', 'admin', 'admin'),
(2, 'admin@admin.com', 'admin', 'admin', 'admin', 'admin1');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
