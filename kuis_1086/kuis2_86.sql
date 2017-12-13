-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 13, 2017 at 04:32 PM
-- Server version: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis2_86`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_identitas_1086`
--

CREATE TABLE `tbl_identitas_1086` (
  `id` bigint(20) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `nama` varchar(100) NOT NULL,
  `prodi` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_identitas_1086`
--

INSERT INTO `tbl_identitas_1086` (`id`, `alamat`, `nama`, `prodi`) VALUES
(7, 'Jl. Delima', 'Ade Sukma', 'Akuntansi'),
(8, 'Jl. Umban Saru', 'Dimcuu', 'TI');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_ipk_1086`
--

CREATE TABLE `tbl_ipk_1086` (
  `id` bigint(20) NOT NULL,
  `batas_akhir` varchar(255) DEFAULT NULL,
  `batas_awal` varchar(255) DEFAULT NULL,
  `nilai` varchar(100) NOT NULL,
  `identitas_1086_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_ipk_1086`
--

INSERT INTO `tbl_ipk_1086` (`id`, `batas_akhir`, `batas_awal`, `nilai`, `identitas_1086_id`) VALUES
(7, '3.25', '3.10', '3.10', 7),
(8, '3.30', '3.10', '3.20', 7),
(9, '3.10', '3.20', '3.30', 8);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_identitas_1086`
--
ALTER TABLE `tbl_identitas_1086`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_n6l612uusfwf6lt1cfhy0bqeq` (`nama`);

--
-- Indexes for table `tbl_ipk_1086`
--
ALTER TABLE `tbl_ipk_1086`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_gdk7wlmrjlsyn5svgthk05243` (`nilai`),
  ADD KEY `FKl9kbwfxc061g5kf6yg9v6jm0l` (`identitas_1086_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_identitas_1086`
--
ALTER TABLE `tbl_identitas_1086`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `tbl_ipk_1086`
--
ALTER TABLE `tbl_ipk_1086`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_ipk_1086`
--
ALTER TABLE `tbl_ipk_1086`
  ADD CONSTRAINT `FKl9kbwfxc061g5kf6yg9v6jm0l` FOREIGN KEY (`identitas_1086_id`) REFERENCES `tbl_identitas_1086` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
