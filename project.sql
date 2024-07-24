-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 23, 2024 at 01:47 PM
-- Server version: 8.2.0
-- PHP Version: 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `email` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs NOT NULL,
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`email`, `password`) VALUES
('admin@admin.com', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `class`
--

DROP TABLE IF EXISTS `class`;
CREATE TABLE IF NOT EXISTS `class` (
  `course_code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs NOT NULL,
  `credit_hours` varchar(20) NOT NULL,
  `course` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `department` varchar(50) NOT NULL,
  `program` varchar(50) NOT NULL,
  `instructor` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `academic_year` varchar(10) NOT NULL,
  `academic_session` varchar(10) NOT NULL,
  `seats` varchar(10) NOT NULL,
  PRIMARY KEY (`course_code`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `class`
--

INSERT INTO `class` (`course_code`, `credit_hours`, `course`, `department`, `program`, `instructor`, `academic_year`, `academic_session`, `seats`) VALUES
('CS2104', '4', 'Object Oriented Programming', 'Department of Computer Science', 'BS Software Engineering', 'madeeha.kanwal@riphah.edu.pk', '2024', 'Spring', '100'),
('ICT7451', '3', 'Information and Communication Technology ', 'Department of Computer Science', 'BS Software Engineering', 'anis.qureshi@airlinkcommunication.net', '2024', 'Spring', '100'),
('MT1313', '3', 'Calculus and Analytic Geometry', 'Department of Mathematics', 'BS Software Engineering', 'abbasaslam06@gmail.com', '2024', 'Spring', '100'),
('MT2313', '3', 'Probability and Statistics', 'Department of Computer Science', 'BS Software Engineering', 'abbasaslam06@gmail.com', '2024', 'Spring', '100'),
('PF1489', '4', 'Programming Fundamental', 'Department of Computer Science', 'BS Software Engineering', 'anis.qureshi@airlinkcommunication.net', '2024', 'Spring', '100');

-- --------------------------------------------------------

--
-- Table structure for table `instructor`
--

DROP TABLE IF EXISTS `instructor`;
CREATE TABLE IF NOT EXISTS `instructor` (
  `ID` tinyint NOT NULL AUTO_INCREMENT,
  `fName` varchar(20) NOT NULL,
  `lName` varchar(20) NOT NULL,
  `cnic` varchar(15) NOT NULL,
  `phoneno` varchar(12) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `office` varchar(10) NOT NULL,
  `status` varchar(10) NOT NULL DEFAULT 'Active',
  `department` varchar(50) NOT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs NOT NULL,
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs NOT NULL,
  `course` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `instructor`
--

INSERT INTO `instructor` (`ID`, `fName`, `lName`, `cnic`, `phoneno`, `gender`, `office`, `status`, `department`, `email`, `password`, `course`) VALUES
(1, 'Anis', 'Qureshi', '45623-8745632-1', '0300-8434208', 'Male', 'A1', 'Active', 'Department of Computer Science', 'anis.qureshi@airlinkcommunication.net', 'inst123', ''),
(2, 'Abbas', 'Aslam', '74532-8542366-9', '0323-6000010', 'Male', 'A2', 'Active', 'Department of Mathematics', 'abbasaslam06@gmail.com', 'inst123', ''),
(3, 'Muhammad', 'Saad', '35202-3989540-9', '0334-9788753', 'Male', 'A3', 'Active', 'Department of Computer Science', 'muhammad.saad9788753@gmail.com', 'inst123', ''),
(4, 'Madeeha', 'Kanwal', '45623-8741256-9', '0305-8187764', 'Female', 'A4', 'Active', 'Department of Computer Science', 'madeeha.kanwal@riphah.edu.pk', 'inst123', ''),
(5, 'Talha', 'Tariq', '74235-5416986-5', '0328-4100531', 'Male', 'A5', 'Active', 'Department of Computer Science', 'talha.tariq@riphah.edu.pk', 'inst123', ''),
(6, 'Mehwish', 'Sami', '12567-4236987-5', '0301-4687811', 'Female', 'A6', 'Active', 'Department of Computer Science', 'mehwishsami@riphah.edu.pk', 'inst123', '');

-- --------------------------------------------------------

--
-- Table structure for table `office`
--

DROP TABLE IF EXISTS `office`;
CREATE TABLE IF NOT EXISTS `office` (
  `room` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `office`
--

INSERT INTO `office` (`room`) VALUES
('A1'),
('A2'),
('A3'),
('A4'),
('A5'),
('A6'),
('A7'),
('A8'),
('A9'),
('A10'),
('A11'),
('A12'),
('A13'),
('A14'),
('A15');

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

DROP TABLE IF EXISTS `signup`;
CREATE TABLE IF NOT EXISTS `signup` (
  `Admin_ID` tinyint NOT NULL AUTO_INCREMENT,
  `fName` varchar(20) NOT NULL,
  `lName` varchar(20) NOT NULL,
  `cnic` varchar(15) NOT NULL,
  `phoneno` varchar(12) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `sQuestion` varchar(100) NOT NULL,
  `sAnswer` varchar(100) NOT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs NOT NULL,
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs NOT NULL,
  `status` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT 'Active',
  PRIMARY KEY (`Admin_ID`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`Admin_ID`, `fName`, `lName`, `cnic`, `phoneno`, `gender`, `sQuestion`, `sAnswer`, `email`, `password`, `status`) VALUES
(1, 'Muhammad', 'Saad', '35202-3989540-9', '0334-9788753', 'Male', 'How many girls or boys have you dated?', '1', 'saadmumtaz96@yahoo.com', 'oopproject', 'Active'),
(2, 'Zain', 'Zaheer', '42513-4521245-2', '0334-9788753', 'Male', 'What is your pet name?', 'zzxxzx', 'zain123@gmail.com', 'saad123', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `ID` tinyint NOT NULL AUTO_INCREMENT,
  `fName` varchar(20) NOT NULL,
  `lName` varchar(20) NOT NULL,
  `cnic` varchar(15) NOT NULL,
  `phoneno` varchar(12) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `status` varchar(10) NOT NULL,
  `department` varchar(50) NOT NULL,
  `program` varchar(50) NOT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs NOT NULL,
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs NOT NULL,
  `enroll_courses` varchar(500) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`ID`, `fName`, `lName`, `cnic`, `phoneno`, `gender`, `status`, `department`, `program`, `email`, `password`, `enroll_courses`) VALUES
(1, 'Muhammad', 'Saad', '35202-3989540-9', '0334-9788753', 'Male', 'Active', 'Department of Computer Science', 'BS Software Engineering', '53180@students.riphah.edu.pk', 'stud123', 'Object Oriented Programming\nProbability and Statistics'),
(2, 'Zain', 'Zaheer', '87452-5896456-2', '0309-4388337', 'Male', 'Active', 'Department of Computer Science', 'BS Software Engineering', '53812@students.riphah.edu.pk', 'stud123', '');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
