-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 30, 2025 at 04:14 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `technical_assesment`
--

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `id` int(11) NOT NULL,
  `productID` int(11) NOT NULL,
  `productName` varchar(255) NOT NULL,
  `amount` int(11) NOT NULL,
  `customerName` varchar(255) NOT NULL,
  `status` int(1) NOT NULL,
  `transactionDate` date NOT NULL,
  `createBy` varchar(255) NOT NULL,
  `createOn` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`id`, `productID`, `productName`, `amount`, `customerName`, `status`, `transactionDate`, `createBy`, `createOn`) VALUES
(1372, 10001, 'Test 1', 1000, 'abc', 0, '2022-07-10', 'abc', '2022-07-10'),
(1373, 10002, 'Test 2', 2000, 'abc', 0, '2022-07-11', 'abc', '2022-07-10'),
(1374, 10001, 'Test 1', 1000, 'abc', 0, '2022-08-10', 'abc', '2022-07-10'),
(1375, 10002, 'Test 2', 1000, 'abc', 1, '2022-08-10', 'abc', '2022-07-10'),
(1376, 10001, 'Test 1', 1000, 'abc', 0, '2022-08-10', 'abc', '2022-07-10'),
(1377, 10002, 'Test 2', 2000, 'abc', 0, '2022-08-12', 'abc', '2022-07-10'),
(1378, 10001, 'Test 1', 1000, 'abc', 0, '2022-08-12', 'abc', '2022-07-10'),
(1379, 10002, 'Test 2', 1000, 'abc', 1, '2022-09-13', 'abc', '2022-07-10'),
(1380, 10001, 'Test 1', 1000, 'abc', 0, '2022-09-13', 'abc', '2022-07-10'),
(1381, 10002, 'Test 2', 2000, 'abc', 0, '2022-09-14', 'abc', '2022-07-10'),
(1382, 10001, 'Test 1', 1000, 'abc', 0, '2022-09-14', 'abc', '2022-07-10'),
(1383, 10002, 'Test 2', 1000, 'abc', 1, '2022-08-15', 'abc', '2022-07-10');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `transaction`
--
ALTER TABLE `transaction`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1384;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
