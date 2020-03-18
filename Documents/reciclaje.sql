-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-03-2020 a las 01:12:07
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `reciclaje`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `desecho`
--

CREATE TABLE `desecho` (
  `ID_DESECHO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `desecho`
--

INSERT INTO `desecho` (`ID_DESECHO`) VALUES
(11),
(12),
(13),
(14),
(15),
(21),
(22),
(31),
(32),
(33),
(34),
(35),
(36),
(41),
(42),
(43),
(44),
(45);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `organico`
--

CREATE TABLE `organico` (
  `ID_DESECHO` int(11) NOT NULL,
  `TIPO_ORGANICO` char(25) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `organico`
--

INSERT INTO `organico` (`ID_DESECHO`, `TIPO_ORGANICO`) VALUES
(31, 'Cascaras Fruta'),
(32, 'Pan'),
(33, 'Restos comida'),
(34, 'Cascaron Huevo'),
(35, 'Verduras Hortalizas'),
(36, 'Otro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `papel`
--

CREATE TABLE `papel` (
  `ID_DESECHO` int(11) NOT NULL,
  `TIPO_PAPEL` char(10) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `papel`
--

INSERT INTO `papel` (`ID_DESECHO`, `TIPO_PAPEL`) VALUES
(11, 'Periodico'),
(12, 'Carton'),
(13, 'Cartulina'),
(14, 'Revista'),
(15, 'Otro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `plastico`
--

CREATE TABLE `plastico` (
  `ID_DESECHO` int(11) NOT NULL,
  `TIPO_PLASTICO` char(10) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `plastico`
--

INSERT INTO `plastico` (`ID_DESECHO`, `TIPO_PLASTICO`) VALUES
(41, 'Botella'),
(42, 'Bolsas'),
(43, 'Pitillo'),
(44, 'Desechable'),
(45, 'Otro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recicla`
--

CREATE TABLE `recicla` (
  `CORREO` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `ID_DESECHO` int(11) NOT NULL,
  `CANTIDAD_DESECHO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `CORREO` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `NOMBRE_USUARIO` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `CONTRASENIA_USUARIO` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `TIPO_USUARIO` char(10) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`CORREO`, `NOMBRE_USUARIO`, `CONTRASENIA_USUARIO`, `TIPO_USUARIO`) VALUES
('antonella@unicauca.edu.co', 'antonella', 'anto123', 'comun'),
('brahianf@unicauca.edu.co', 'brahianf', 'brahian', 'comun');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vidrio`
--

CREATE TABLE `vidrio` (
  `ID_DESECHO` int(11) NOT NULL,
  `TIPO_VIDRIO` char(10) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `vidrio`
--

INSERT INTO `vidrio` (`ID_DESECHO`, `TIPO_VIDRIO`) VALUES
(21, 'Domestico'),
(22, 'Industrial');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `desecho`
--
ALTER TABLE `desecho`
  ADD PRIMARY KEY (`ID_DESECHO`);

--
-- Indices de la tabla `organico`
--
ALTER TABLE `organico`
  ADD PRIMARY KEY (`ID_DESECHO`);

--
-- Indices de la tabla `papel`
--
ALTER TABLE `papel`
  ADD PRIMARY KEY (`ID_DESECHO`);

--
-- Indices de la tabla `plastico`
--
ALTER TABLE `plastico`
  ADD PRIMARY KEY (`ID_DESECHO`);

--
-- Indices de la tabla `recicla`
--
ALTER TABLE `recicla`
  ADD PRIMARY KEY (`CORREO`,`ID_DESECHO`),
  ADD KEY `FK_RECICLA` (`ID_DESECHO`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`CORREO`);

--
-- Indices de la tabla `vidrio`
--
ALTER TABLE `vidrio`
  ADD PRIMARY KEY (`ID_DESECHO`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `organico`
--
ALTER TABLE `organico`
  ADD CONSTRAINT `FK_TIPO3` FOREIGN KEY (`ID_DESECHO`) REFERENCES `desecho` (`ID_DESECHO`);

--
-- Filtros para la tabla `papel`
--
ALTER TABLE `papel`
  ADD CONSTRAINT `FK_TIPO2` FOREIGN KEY (`ID_DESECHO`) REFERENCES `desecho` (`ID_DESECHO`);

--
-- Filtros para la tabla `plastico`
--
ALTER TABLE `plastico`
  ADD CONSTRAINT `FK_TIPO4` FOREIGN KEY (`ID_DESECHO`) REFERENCES `desecho` (`ID_DESECHO`);

--
-- Filtros para la tabla `recicla`
--
ALTER TABLE `recicla`
  ADD CONSTRAINT `FK_RECICLA` FOREIGN KEY (`ID_DESECHO`) REFERENCES `desecho` (`ID_DESECHO`),
  ADD CONSTRAINT `FK_RECICLA2` FOREIGN KEY (`CORREO`) REFERENCES `usuario` (`CORREO`);

--
-- Filtros para la tabla `vidrio`
--
ALTER TABLE `vidrio`
  ADD CONSTRAINT `FK_TIPO` FOREIGN KEY (`ID_DESECHO`) REFERENCES `desecho` (`ID_DESECHO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
