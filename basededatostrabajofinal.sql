-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-10-2018 a las 22:13:48
-- Versión del servidor: 10.1.35-MariaDB
-- Versión de PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `basededatostrabajofinal`
--
CREATE DATABASE IF NOT EXISTS `basededatostrabajofinal` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `basededatostrabajofinal`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `Categoria` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `idCategoria` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`Categoria`, `idCategoria`) VALUES
('Videocámaras y Cámaras Fotográficas', 0),
('Telefonía y Accesorios', 1),
('Televisores y Reproductores DVD', 2),
('Tablets, Libros Electrónicos y Accesorios', 3),
('Videojuegos, Consolas y Accesorios', 4),
('Drones', 5),
('Scooters Eléctricos', 6),
('Relojes y Smartwatch', 7),
('Audio y HI-FI', 8),
('Ordenadores y Periféricos', 9),
('Pilas, Cargadores y Adaptadores', 10),
('Accesorios de Electrónica', 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mercadogordo`
--

CREATE TABLE `mercadogordo` (
  `NombreProducto` varchar(1000) COLLATE utf8_spanish_ci NOT NULL,
  `Descripcion` text COLLATE utf8_spanish_ci NOT NULL,
  `Precio` int(111) NOT NULL,
  `idCategoria` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `mercadogordo`
--

INSERT INTO `mercadogordo` (`NombreProducto`, `Descripcion`, `Precio`, `idCategoria`) VALUES
('Auriculares beats', 'Auriculares increiblemente comodos, con bajos reforzados y aisldor de sonido', 700, 9);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
