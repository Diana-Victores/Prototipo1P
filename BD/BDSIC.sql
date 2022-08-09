CREATE DATABASE SIC;
USE SIC;
-- -----------------------------------------------------
-- Table `SIC`.`tbl_modulo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_modulo` (
  `PK_id_Modulo` INT NOT NULL,
  `nombre_modulo` VARCHAR(45) NULL DEFAULT NULL,
  `descripcion_modulo` VARCHAR(200) NULL DEFAULT NULL,
  `estado_modulo` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`PK_id_Modulo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
INSERT INTO `SIC`.`tbl_modulo` (`PK_id_Modulo`, `nombre_modulo`, `descripcion_modulo`, `estado_modulo`) VALUES ('0000', 'Seguridad', 'Asignación', '1');
INSERT INTO `SIC`.`tbl_modulo` (`PK_id_Modulo`, `nombre_modulo`, `descripcion_modulo`, `estado_modulo`) VALUES ('1000', 'Finanzas', 'Asignación', '1');
INSERT INTO `SIC`.`tbl_modulo` (`PK_id_Modulo`, `nombre_modulo`, `descripcion_modulo`, `estado_modulo`) VALUES ('2000', 'Hotelería', 'Asignación', '1');
INSERT INTO `SIC`.`tbl_modulo` (`PK_id_Modulo`, `nombre_modulo`, `descripcion_modulo`, `estado_modulo`) VALUES ('3000', 'Comercial', 'Asignación', '1');

-- -----------------------------------------------------
-- Table `SIC`.`tbl_aplicacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_aplicacion` (
  `PK_id_aplicacion` INT NOT NULL,
  `nombre_aplicacion` VARCHAR(45) NULL DEFAULT NULL,
  `descripcion_aplicacion` VARCHAR(200) NULL DEFAULT NULL,
  `no_reporteAsociado` INT NULL DEFAULT NULL,
  `estado_aplicacion` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`PK_id_aplicacion`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `SIC`.`tbl_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_usuario` (
  `PK_id_usuario` VARCHAR(25) NOT NULL,
  `nombre_usuario` VARCHAR(45) NULL DEFAULT NULL,
  `apellido_usuario` VARCHAR(45) NULL DEFAULT NULL,
  `username_usuario` VARCHAR(45) NULL DEFAULT NULL,
  `password_usuario` VARCHAR(45) NULL DEFAULT NULL,
  `correo_usuario` VARCHAR(45) NULL DEFAULT NULL,
  `cambio_password` TINYINT NULL DEFAULT NULL,
  `estado_usuario` TINYINT NULL DEFAULT NULL,
  `ultima_conexion` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`PK_id_usuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `SIC`.`tbl_bitacora`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_bitacora` (
  `PK_id_bitacora` INT NOT NULL AUTO_INCREMENT,
  `PK_id_usuario` VARCHAR(25) NOT NULL,
  `fecha` VARCHAR(25)  null DEFAULT NULL,
  `hora` VARCHAR(25) NULL DEFAULT NULL,
  `host1` VARCHAR(45) NULL DEFAULT NULL,
  `ip` VARCHAR(25) NULL DEFAULT NULL,
  `accion` VARCHAR(50) NULL DEFAULT NULL,
  `tabla` VARCHAR(45) NULL DEFAULT NULL,
`PK_id_Modulo` int (25) NULL DEFAULT NULL,
PRIMARY KEY (`PK_id_bitacora`),
 CONSTRAINT `fk_PK_id_Modulo`
 FOREIGN KEY (`PK_id_Modulo`)
REFERENCES `SIC`.`tbl_modulo` (`PK_id_Modulo`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `SIC`.`tbl_perfil_encabezado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_perfil_encabezado` (
  `PK_id_perfil` INT NOT NULL,
  `nombre_perfil` VARCHAR(45) NULL DEFAULT NULL,
  `descripcion_perfil` VARCHAR(200) NULL DEFAULT NULL,
  `estado_perfil` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`PK_id_perfil`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
INSERT INTO `SIC`.`tbl_perfil_encabezado` (`PK_id_perfil`, `nombre_perfil`, `descripcion_perfil`, `estado_perfil`) VALUES ('1', 'perfil1', 'prueba en el perfil 1', '1');

-- -----------------------------------------------------
-- Table `SIC`.`tbl_perfil_detalle`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_perfil_detalle` (
  `PK_id_perfil` INT NOT NULL,
  `PK_id_aplicacion` INT NOT NULL,
  `ingresar` TINYINT NULL DEFAULT NULL,
  `consultar` TINYINT NULL DEFAULT NULL,
  `modificar` TINYINT NULL DEFAULT NULL,
  `eliminar` TINYINT NULL DEFAULT NULL,
  `imprimir` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`PK_id_perfil`, `PK_id_aplicacion`),
    CONSTRAINT `fk_Perfil_detalle_Aplicacion1`
    FOREIGN KEY (`PK_id_aplicacion`)
    REFERENCES `SIC`.`tbl_aplicacion` (`PK_id_aplicacion`),
  CONSTRAINT `fk_Perfil_detalle_Perfil1`
    FOREIGN KEY (`PK_id_perfil`)
    REFERENCES `SIC`.`tbl_perfil_encabezado` (`PK_id_perfil`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
INSERT INTO `SIC`.`tbl_perfil_detalle` (`PK_id_perfil`, `PK_id_aplicacion`, `ingresar`, `consultar`, `modificar`, `eliminar`, `imprimir` ) VALUES ('1', '2004', '1', '1', '1', '1', '1');
INSERT INTO `SIC`.`tbl_perfil_detalle` (`PK_id_perfil`, `PK_id_aplicacion`, `ingresar`, `consultar`, `modificar`, `eliminar`, `imprimir` ) VALUES ('1', '2204', '1', '1', '1', '1', '1');
INSERT INTO `SIC`.`tbl_perfil_detalle` (`PK_id_perfil`, `PK_id_aplicacion`, `ingresar`, `consultar`, `modificar`, `eliminar`, `imprimir` ) VALUES ('1', '2205', '1', '1', '1', '1', '1');
INSERT INTO `SIC`.`tbl_perfil_detalle` (`PK_id_perfil`, `PK_id_aplicacion`, `ingresar`, `consultar`, `modificar`, `eliminar`, `imprimir` ) VALUES ('1', '2001', '1', '1', '1', '1', '1');
INSERT INTO `SIC`.`tbl_perfil_detalle` (`PK_id_perfil`, `PK_id_aplicacion`, `ingresar`, `consultar`, `modificar`, `eliminar`, `imprimir` ) VALUES ('1', '2002', '1', '1', '1', '1', '1');

-- -----------------------------------------------------
-- Table `SIC`.`tbl_usuario_aplicacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_usuario_aplicacion` (
  `PK_id_usuario` VARCHAR(25) NOT NULL,
  `PK_id_aplicacion` INT NOT NULL,
  `ingresar` TINYINT NULL DEFAULT NULL,
  `consulta` TINYINT NULL DEFAULT NULL,
  `modificar` TINYINT NULL DEFAULT NULL,
  `eliminar` TINYINT NULL DEFAULT NULL,
  `imprimir` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`PK_id_usuario`, `PK_id_aplicacion`),
    CONSTRAINT `fk_tbl_usuario_aplicacion_tbl_aplicacion1`
    FOREIGN KEY (`PK_id_aplicacion`)
    REFERENCES `SIC`.`tbl_aplicacion` (`PK_id_aplicacion`),
  CONSTRAINT `fk_Usuario_aplicacion_Usuario1`
    FOREIGN KEY (`PK_id_usuario`)
    REFERENCES `SIC`.`tbl_usuario` (`PK_id_usuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `SIC`.`tbl_usuario_perfil`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_usuario_perfil` (
  `PK_id_usuario` VARCHAR(25) NOT NULL,
  `PK_id_perfil` INT NOT NULL,
  PRIMARY KEY (`PK_id_usuario`, `PK_id_perfil`),
    CONSTRAINT `fk_Usuario_perfil_Perfil1`
    FOREIGN KEY (`PK_id_perfil`)
    REFERENCES `SIC`.`tbl_perfil_encabezado` (`PK_id_perfil`),
  CONSTRAINT `fk_Usuario_perfil_Usuario1`
    FOREIGN KEY (`PK_id_usuario`)
    REFERENCES `SIC`.`tbl_usuario` (`PK_id_usuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `umg`.`tbl_aplicacion_a_modulo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_aplicacion_a_modulos` (
  `PK_id_modulo` INT(25) NOT NULL,
`PK_id_aplicacion` INT NOT NULL,
  PRIMARY KEY (`PK_id_modulo`,`PK_id_aplicacion` ),
    CONSTRAINT `fk_tbl_aplicacion_a_modulos_aplicacion1`
    FOREIGN KEY (`PK_id_aplicacion`)
    REFERENCES `SIC`.`tbl_aplicacion` (`PK_id_aplicacion`),
  CONSTRAINT `fk_tbl_aplicacion_a_modulos_modulo`
    FOREIGN KEY (`PK_id_modulo`)
    REFERENCES `SIC`.`tbl_modulo` (`PK_id_Modulo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------
-- Insert usuarios (Comercial)
-- -----------------------------------------------------
INSERT INTO `tbl_usuario` (`PK_id_usuario`, `nombre_usuario`, `apellido_usuario`, `username_usuario`, `password_usuario`, `correo_usuario`, `cambio_password`, `estado_usuario`, `ultima_conexion`) VALUES ('11', 'carlos', 'carlos', 'carlos', '8cb2237d0679ca88db6464eac60da96345513964', 'cflorezd@gmail.com', '1', '1', '2021-05-02 21:00:48');
INSERT INTO `tbl_usuario` (`PK_id_usuario`, `nombre_usuario`, `apellido_usuario`, `username_usuario`, `password_usuario`, `correo_usuario`, `cambio_password`, `estado_usuario`, `ultima_conexion`) VALUES ('10', 'esduardo', 'esduardo', 'esduardo', '8cb2237d0679ca88db6464eac60da96345513964', 'esduardo@gmail.com', '1', '1', '2021-05-02 21:00:48');
INSERT INTO `tbl_usuario` (`PK_id_usuario`, `nombre_usuario`, `apellido_usuario`, `username_usuario`, `password_usuario`, `correo_usuario`, `cambio_password`, `estado_usuario`, `ultima_conexion`) VALUES ('12', 'diana', 'diana', 'diana', '8cb2237d0679ca88db6464eac60da96345513964', 'diana@gmail.com', '1', '1', '2021-05-02 21:00:48');
INSERT INTO `tbl_usuario` (`PK_id_usuario`, `nombre_usuario`, `apellido_usuario`, `username_usuario`, `password_usuario`, `correo_usuario`, `cambio_password`, `estado_usuario`, `ultima_conexion`) VALUES ('13', 'rita', 'rita  ', 'rita', '8cb2237d0679ca88db6464eac60da96345513964', 'esduardo@gmail.com', '1', '1', '2021-05-02 21:00:48');
-- -----------------------------------------------------
-- Insert aplicacion (Comercial)
-- -----------------------------------------------------
INSERT INTO `tbl_aplicacion` (`PK_id_aplicacion`, `nombre_aplicacion`, `descripcion_aplicacion`, `no_reporteAsociado`, `estado_aplicacion`) VALUES ('3001', 'Mantenimiento productos', 'areacomercial', '4', '1');
INSERT INTO `tbl_aplicacion` (`PK_id_aplicacion`, `nombre_aplicacion`, `descripcion_aplicacion`, `no_reporteAsociado`, `estado_aplicacion`) VALUES ('3002', 'Mantenimiento Deudores', 'areacomercial', '2', '1');
INSERT INTO `tbl_aplicacion` (`PK_id_aplicacion`, `nombre_aplicacion`, `descripcion_aplicacion`, `no_reporteAsociado`, `estado_aplicacion`) VALUES ('3003', 'Mantenimiento Proveedores', 'areacomercial', '3', '1');
INSERT INTO `tbl_aplicacion` (`PK_id_aplicacion`, `nombre_aplicacion`, `descripcion_aplicacion`, `no_reporteAsociado`, `estado_aplicacion`) VALUES ('3004', 'Mantenimiento productos', 'areacomercial', '4', '1');
INSERT INTO `tbl_aplicacion` (`PK_id_aplicacion`, `nombre_aplicacion`, `descripcion_aplicacion`, `no_reporteAsociado`, `estado_aplicacion`) VALUES ('3005', 'Mantenimiento productos', 'areacomercial', '4', '1');
INSERT INTO `tbl_aplicacion` (`PK_id_aplicacion`, `nombre_aplicacion`, `descripcion_aplicacion`, `no_reporteAsociado`, `estado_aplicacion`) VALUES ('3006', 'Mantenimiento productos', 'areacomercial', '4', '1');
INSERT INTO `tbl_aplicacion` (`PK_id_aplicacion`, `nombre_aplicacion`, `descripcion_aplicacion`, `no_reporteAsociado`, `estado_aplicacion`) VALUES ('3007', 'Mantenimiento productos', 'areacomercial', '4', '1');
INSERT INTO `tbl_aplicacion` (`PK_id_aplicacion`, `nombre_aplicacion`, `descripcion_aplicacion`, `no_reporteAsociado`, `estado_aplicacion`) VALUES ('3008', 'Mantenimiento productos', 'areacomercial', '4', '1');
INSERT INTO `tbl_aplicacion` (`PK_id_aplicacion`, `nombre_aplicacion`, `descripcion_aplicacion`, `no_reporteAsociado`, `estado_aplicacion`) VALUES ('3009', 'Mantenimiento productos', 'areacomercial', '4', '1');
-- -----------------------------------------------------
-- Insert usuario_aplicacion (Comercial)
-- -----------------------------------------------------
INSERT INTO `tbl_usuario_aplicacion` (`PK_id_usuario`, `PK_id_aplicacion`, `ingresar`, `consulta`, `modificar`, `eliminar`, `imprimir`) VALUES ('2', '3001', '1', '1', '1', '1', '1');
INSERT INTO `tbl_usuario_aplicacion` (`PK_id_usuario`, `PK_id_aplicacion`, `ingresar`, `consulta`, `modificar`, `eliminar`, `imprimir`) VALUES ('2', '3002', '1', '1', '1', '1', '1');
INSERT INTO `tbl_usuario_aplicacion` (`PK_id_usuario`, `PK_id_aplicacion`, `ingresar`, `consulta`, `modificar`, `eliminar`, `imprimir`) VALUES ('2', '3003', '1', '1', '1', '1', '1');
INSERT INTO `tbl_usuario_aplicacion` (`PK_id_usuario`, `PK_id_aplicacion`, `ingresar`, `consulta`, `modificar`, `eliminar`, `imprimir`) VALUES ('2', '3004', '1', '1', '1', '1', '1');
INSERT INTO `tbl_usuario_aplicacion` (`PK_id_usuario`, `PK_id_aplicacion`, `ingresar`, `consulta`, `modificar`, `eliminar`, `imprimir`) VALUES ('2', '3005', '1', '1', '1', '1', '1');
INSERT INTO `tbl_usuario_aplicacion` (`PK_id_usuario`, `PK_id_aplicacion`, `ingresar`, `consulta`, `modificar`, `eliminar`, `imprimir`) VALUES ('2', '3006', '1', '1', '1', '1', '1');
INSERT INTO `tbl_usuario_aplicacion` (`PK_id_usuario`, `PK_id_aplicacion`, `ingresar`, `consulta`, `modificar`, `eliminar`, `imprimir`) VALUES ('2', '3007', '1', '1', '1', '1', '1');
INSERT INTO `tbl_usuario_aplicacion` (`PK_id_usuario`, `PK_id_aplicacion`, `ingresar`, `consulta`, `modificar`, `eliminar`, `imprimir`) VALUES ('2', '3008', '1', '1', '1', '1', '1');
INSERT INTO `tbl_usuario_aplicacion` (`PK_id_usuario`, `PK_id_aplicacion`, `ingresar`, `consulta`, `modificar`, `eliminar`, `imprimir`) VALUES ('11', '3001', '1', '1', '1', '1', '1');
INSERT INTO `tbl_usuario_aplicacion` (`PK_id_usuario`, `PK_id_aplicacion`, `ingresar`, `consulta`, `modificar`, `eliminar`, `imprimir`) VALUES ('11', '3002', '1', '1', '1', '1', '1');
INSERT INTO `tbl_usuario_aplicacion` (`PK_id_usuario`, `PK_id_aplicacion`, `ingresar`, `consulta`, `modificar`, `eliminar`, `imprimir`) VALUES ('11', '3003', '1', '1', '1', '1', '1');
INSERT INTO `tbl_usuario_aplicacion` (`PK_id_usuario`, `PK_id_aplicacion`, `ingresar`, `consulta`, `modificar`, `eliminar`, `imprimir`) VALUES ('11', '3004', '1', '1', '1', '1', '1');
INSERT INTO `tbl_usuario_aplicacion` (`PK_id_usuario`, `PK_id_aplicacion`, `ingresar`, `consulta`, `modificar`, `eliminar`, `imprimir`) VALUES ('11', '3005', '1', '1', '1', '1', '1');
INSERT INTO `tbl_usuario_aplicacion` (`PK_id_usuario`, `PK_id_aplicacion`, `ingresar`, `consulta`, `modificar`, `eliminar`, `imprimir`) VALUES ('11', '3006', '1', '1', '1', '1', '1');
INSERT INTO `tbl_usuario_aplicacion` (`PK_id_usuario`, `PK_id_aplicacion`, `ingresar`, `consulta`, `modificar`, `eliminar`, `imprimir`) VALUES ('11', '3007', '1', '1', '1', '1', '1');
INSERT INTO `tbl_usuario_aplicacion` (`PK_id_usuario`, `PK_id_aplicacion`, `ingresar`, `consulta`, `modificar`, `eliminar`, `imprimir`) VALUES ('11', '3008', '1', '1', '1', '1', '1');
INSERT INTO `tbl_usuario_aplicacion` (`PK_id_usuario`, `PK_id_aplicacion`, `ingresar`, `consulta`, `modificar`, `eliminar`, `imprimir`) VALUES ('11', '3009', '1', '1', '1', '1', '1');


USE SIC;
-- -----------------------------------------------------
-- Table `SIC`.`linea`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_linea` (
 `PK_codigo_linea` INT NOT NULL,
   `nombre_linea` VARCHAR(35) NOT NULL,
  `estatus_linea` TINYINT(2) NOT NULL,
  PRIMARY KEY (`PK_codigo_linea`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `SIC`.`marca`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_marca` (
 `PK_codigo_marca` INT NOT NULL,
   `nombre_marca` VARCHAR(35) NOT NULL,
  `estatus_marca` TINYINT(2) NOT NULL,
  PRIMARY KEY (`PK_codigo_marca`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `SIC`.`bodega`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_bodega` (
 `PK_codigo_bodega` INT NOT NULL,
   `nombre_bodega` VARCHAR(35) NOT NULL,
  `estatus_bodega` TINYINT(2) NOT NULL,
  PRIMARY KEY (`PK_codigo_bodega`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `SIC`.`unidad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_unidad` (
 `PK_codigo_unidad` INT NOT NULL,
   `unidad_entrada` VARCHAR(35) NOT NULL,
  `unidad_salida` VARCHAR(35) NOT NULL,
  PRIMARY KEY (`PK_codigo_unidad`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `SIC`.`transporte_fecha`
-- -----------------------------------------------------
 CREATE TABLE IF NOT EXISTS `SIC`.`tbl_transportefecha` (
	`PK_codigo_transportefecha` INT NOT NULL,
    `nombre_transportefecha` VARCHAR(35) NOT NULL,
    `fecha_transportefecha` VARCHAR(35) NOT NULL,
    `estatus_transportefecha` TINYINT(2) NOT NULL,
	PRIMARY KEY (`PK_codigo_transportefecha`))
	ENGINE = InnoDB
	DEFAULT CHARACTER SET = utf8;
-- -----------------------------------------------------
-- Table `SIC`.`transporte_tipo`
-- -----------------------------------------------------
 CREATE TABLE IF NOT EXISTS `SIC`.`tbl_transportetipo` (
	`PK_codigo_transporte_tipo` INT NOT NULL,
    `nombre_transportetipo` VARCHAR(35) NOT NULL,
    `tipo_transportetipo` VARCHAR(35)NOT NULL,
    `estatus_transportefecha` TINYINT(2) NOT NULL,
	PRIMARY KEY (`PK_codigo_transporte_tipo`))
	ENGINE = InnoDB
	DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `SIC`.`transporte_ruta`
-- -----------------------------------------------------
 CREATE TABLE IF NOT EXISTS `SIC`.`tbl_transporteruta` (
	`PK_codigo_transporteruta` INT NOT NULL,
    `nombre_transporteruta` VARCHAR(35) NOT NULL,
    `direccion_transporteruta` VARCHAR(35) NOT NULL,
    `costo_transporteruta` TINYINT(2) NOT NULL,
	PRIMARY KEY (`PK_codigo_transporteruta`))
	ENGINE = InnoDB
	DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `SIC`.`transporte`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_transporte` (
 `PK_codigo_transporte` INT NOT NULL,
   `nombre_transporte` VARCHAR(35) NOT NULL,
  `tipo_transporte` VARCHAR(35) NOT NULL,
  `estatus_transporte` TINYINT(2) NOT NULL,
  `PK_codigo_transportefecha` INT NOT NULL,
  `PK_codigo_transporte_tipo` INT NOT NULL,
  `PK_codigo_transporte_ruta` INT NOT NULL,
  PRIMARY KEY (`PK_codigo_transporte`
  ,`PK_codigo_transportefecha`
  , `PK_codigo_transporte_tipo`
  , `PK_codigo_transporte_ruta`
  ),
  CONSTRAINT `PK_codigo_transportefecha`
  FOREIGN KEY (`PK_codigo_transportefecha`)
REFERENCES `SIC`.`tbl_transportefecha` (`PK_codigo_transportefecha`),
    CONSTRAINT `PK_codigo_transporte_tipo`
  FOREIGN KEY (`PK_codigo_transporte_tipo`)
REFERENCES `SIC`.`tbl_transportetipo` (`PK_codigo_transporte_tipo`),
  CONSTRAINT `tbl_transporteruta1`
  FOREIGN KEY (`PK_codigo_transporte_ruta`)
REFERENCES `SIC`.`tbl_transporteruta` (`PK_codigo_transporteruta`)
  )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `SIC`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_producto` (
 `PK_codigo_producto` INT NOT NULL,
   `nombre_producto` VARCHAR(35) NOT NULL,
  `descripcion_producto` VARCHAR(35) NOT NULL,
  `precio_producto` INT(10) NOT NULL,
  `costo_producto` INT (10) NOT NULL,
  `estatus_producto` TINYINT(2) NOT NULL,
  `codigo_linea` INT NOT NULL,
  `codigo_marca` INT NOT NULL,
  `codigo_bodega` INT NOT NULL,
  `codigo_unidad` INT NOT NULL,
  
  PRIMARY KEY (
  `PK_codigo_producto`,
  `codigo_linea`,
  `codigo_marca`,
  `codigo_bodega`,
  `codigo_unidad`
),
  CONSTRAINT `fk_codigo_linea`
  FOREIGN KEY (`codigo_linea`)
REFERENCES `SIC`.`tbl_linea` (`PK_codigo_linea`),

CONSTRAINT `fk_codigo_marca`
FOREIGN KEY (`codigo_marca`)
REFERENCES `SIC`.`tbl_marca` (`PK_codigo_marca`),   
  
CONSTRAINT `fk_codigo_bodega` 
FOREIGN KEY (`codigo_bodega`)
REFERENCES `SIC`.`tbl_bodega` (`PK_codigo_bodega`),
 
 CONSTRAINT `fk_codigo_unidad1` 
 FOREIGN KEY (`codigo_unidad`)
REFERENCES `SIC`.`tbl_unidad` (`PK_codigo_unidad`)
   
  
  )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `SIC`.`existencia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_existencia` (

`Pk_codigo_producto` INT NOT NULL,
`Pk_codigo_bodega` INT NOT NULL,
`existencia_cantidad`INT NOT NULL,
  PRIMARY KEY (
 
  `Pk_codigo_producto` ,
  `Pk_codigo_bodega`

),
CONSTRAINT `fk_PK_codigo_producto1` 
  FOREIGN KEY (`Pk_codigo_producto`)
REFERENCES `SIC`.`tbl_producto` (`PK_codigo_producto`),
CONSTRAINT `fk_PK_codigo_bodega1` 
FOREIGN KEY (`PK_codigo_bodega`)
REFERENCES `SIC`.`tbl_bodega` (`PK_codigo_bodega`)   
  )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `SIC`.`proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_proveedor` (
 `PK_codigo_proveedor` INT NOT NULL,
   `nombre_proveedor` VARCHAR(35) NOT NULL,
   `direccion_proveedor` VARCHAR(35) NOT NULL,
   `telefono_proveedor` VARCHAR(35) NOT NULL,
   `nit_proveedor` INT(10) NOT NULL,
   `email_proveedor` VARCHAR(35) NOT NULL,
   `saldo_proveedor` FLOAT NOT NULL,
   `estatus_proveedor` TINYINT(2) NOT NULL,
  PRIMARY KEY (`PK_codigo_proveedor`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `SIC`.`forma_pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_pago` (
 `PK_codigo_pago` INT NOT NULL,
   `tipo_pago` VARCHAR(35) NOT NULL,
   `descripcion_pago` VARCHAR(35) NOT NULL,
   `fecha_pago` VARCHAR(35) NOT NULL,
   `estatus_pago` TINYINT(2) NOT NULL,
  PRIMARY KEY (`PK_codigo_pago`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `SIC`.`compra_factura_encabezado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`compra_factura_encabezado` (
 `PK_codigo_factura` INT NOT NULL,
  `PK_codigo_bodega` INT NOT NULL,
 `codigo_proveedor` INT NOT NULL,
   `fecha_emision` VARCHAR(35) NOT NULL,
   `fecha_vencimiento` VARCHAR(35)NOT NULL,
   `codigo_pago` INT NOT NULL,
   `subtotal_encabezado` INT NOT NULL,
   `estatus_factura` TINYINT(2) NOT NULL,

  PRIMARY KEY (
  `PK_codigo_factura`,
  `Pk_codigo_bodega`,
   `codigo_pago`,
  `codigo_proveedor`
  ),
  
  CONSTRAINT `fk_codigo_proveedor1llll` 
  FOREIGN KEY (`codigo_proveedor`)
REFERENCES `SIC`.`tbl_proveedor` (`PK_codigo_proveedor`),

CONSTRAINT `fk_codigo_pago0000000` 
  FOREIGN KEY (`codigo_pago`)
REFERENCES `SIC`.`tbl_pago` (`PK_codigo_pago`)

  )
  
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `SIC`.`compra_factura_detalle`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`compra_factura_detalle` (
`correlativo` INT AUTO_INCREMENT,
 `PK_codigo_factura` INT NOT NULL,
 `PK_codigo_producto` INT NOT NULL,
 `PK_codigo_bodega` INT NOT NULL,
 `cantidad_detalle` INT(20) NOT NULL,
`costo_detalle` INT(20) NOT NULL,
	 	
  PRIMARY KEY (
  `correlativo`,
  `PK_codigo_factura`,
 `PK_codigo_producto` ,
 
  `Pk_codigo_bodega`
  ),
  
  CONSTRAINT `fk_PK_codigo_factura10` 
  FOREIGN KEY (`Pk_codigo_factura`)
REFERENCES `SIC`.`compra_factura_encabezado` (`PK_codigo_factura`),

CONSTRAINT `fk_PK_codigo_producto2` 
  FOREIGN KEY (`Pk_codigo_producto`)
REFERENCES `SIC`.`tbl_producto` (`PK_codigo_producto`),

CONSTRAINT `fk_PK_codigo_bodega2` 
FOREIGN KEY (`PK_codigo_bodega`)
REFERENCES `SIC`.`tbl_bodega` (`PK_codigo_bodega`)   
  )
  
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `SIC`.`ordencompra_encabezado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`ordencompra_encabezado` (
 `PK_codigo_ordenCompra` INT NOT NULL,
 `codigo_proveedor` INT NOT NULL,
 `PK_codigo_bodega` INT NOT NULL,
   `fecha_emision` VARCHAR(35) NOT NULL,
   `fecha_entrega` VARCHAR(35) NOT NULL,
   `subtotal_encabezado` INT NOT NULL,
   `estatus_ordecompra` TINYINT(2) NOT NULL,

  PRIMARY KEY (
  `PK_codigo_ordenCompra`,
  `codigo_proveedor`,
  `Pk_codigo_bodega`
  ),
  
  CONSTRAINT `fk_PK_codigo_proveedor2` 
  FOREIGN KEY (`codigo_proveedor`)
REFERENCES `SIC`.`tbl_proveedor` (`PK_codigo_proveedor`)

  )
  
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `SIC`.`ordencompra_detalle`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`ordencompra_detalle` (
`correlativo` INT AUTO_INCREMENT,
`PK_codigo_ordenCompra` INT NOT NULL,
 `PK_codigo_producto` INT NOT NULL,
 `PK_codigo_bodega` INT NOT NULL,
 `cantidad_detalle` INT NOT NULL,
 `costo_detalle` INT NOT NULL,

	 	
  PRIMARY KEY (
 `correlativo` ,
 `PK_codigo_ordenCompra`,
 `PK_codigo_producto` ,
  `Pk_codigo_bodega`
  ),
  
  CONSTRAINT `fk_PK_codigo_ordenCompra1` 
  FOREIGN KEY (`PK_codigo_ordenCompra`)
REFERENCES `SIC`.`ordencompra_encabezado` (`PK_codigo_ordenCompra`),

CONSTRAINT `fk_PK_codigo_producto21` 
  FOREIGN KEY (`Pk_codigo_producto`)
REFERENCES `SIC`.`tbl_producto` (`PK_codigo_producto`),

CONSTRAINT `fk_PK_codigo_bodega12` 
FOREIGN KEY (`PK_codigo_bodega`)
REFERENCES `SIC`.`tbl_bodega` (`PK_codigo_bodega`)   
  )
  
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `SIC`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_cliente` (
 `PK_codigo_cliente` INT NOT NULL,
   `nombre_cliente` VARCHAR(35) NOT NULL,
  `direccion_cliente` VARCHAR(35) NOT NULL,
    `telefono_cliente` VARCHAR(35) NOT NULL,
  `nit_cliente` INT(10) NOT NULL,
    `email_cliente` VARCHAR(35) NOT NULL,
  `saldo_cliente` INT NOT NULL,
  `cuenta_cliente` INT NOT NULL,
  `estatus_cliente` TINYINT(2) NOT NULL,
  PRIMARY KEY (`PK_codigo_cliente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `SIC`.`cobrador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_cobrador` (
 `PK_codigo_cobrador` INT NOT NULL,
   `nombre_cobrador` VARCHAR(35) NOT NULL,
  `estatus_cobrador` TINYINT(2) NOT NULL,
  PRIMARY KEY (`PK_codigo_cobrador`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
-- -----------------------------------------------------
-- Table `SIC`.`vendedores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_vendedor` (
 `PK_codigo_vendedor` INT NOT NULL,
   `nombre_vendedor` VARCHAR(35) NOT NULL,
  `estatus_vendedor` TINYINT(2) NOT NULL,
  PRIMARY KEY (`PK_codigo_vendedor`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
-- -----------------------------------------------------
-- Table `SIC`.`control_precio_detalle`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_control_precio_detalle` (
 `PK_codigo_producto_precio_detalle` INT NOT NULL,
   `PK_codigo_producto`INT NOT NULL,
  PRIMARY KEY (
  `PK_codigo_producto_precio_detalle`,
  `PK_codigo_producto`
),
    CONSTRAINT `fk_PK_codigo_producto_precio` 
  FOREIGN KEY (`PK_codigo_producto`)
REFERENCES `SIC`.`tbl_producto` (`PK_codigo_producto`)
  )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `SIC`.`control_cotizacion_detalle`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_control_cotizacion_encabezado` (
 `PK_codigo_cotizacion_encabezado` INT NOT NULL,
   `PK_codigo_cliente`INT  NOT NULL,
   `PK_codigo_vendedor`INT NOT NULL,
   `fecha_emision` VARCHAR(35) NOT NULL,
  PRIMARY KEY (
 `PK_codigo_cotizacion_encabezado`,
   `PK_codigo_cliente`,
   `PK_codigo_vendedor`
),
    CONSTRAINT `Fk_PK_codigo_clienteq` 
  FOREIGN KEY (`PK_codigo_cliente`)
REFERENCES `SIC`.`tbl_cliente` (`PK_codigo_cliente`),
CONSTRAINT `FK_PK_codigo_vendedorq` 
  FOREIGN KEY ( `PK_codigo_vendedor`)
REFERENCES `SIC`.`tbl_vendedor` (`PK_codigo_vendedor`)
  )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_control_pedido_encabezado` (
 `PK_codigo_cotizacion_encabezado` INT NOT NULL,
   `PK_codigo_cliente`INT NOT NULL,
   `PK_codigo_vendedor`INT NOT NULL,
   `fecha_emision` VARCHAR(35) NOT NULL,
  PRIMARY KEY (
 `PK_codigo_cotizacion_encabezado`,
   `PK_codigo_cliente`,
   `PK_codigo_vendedor`
),
    CONSTRAINT `Fk_PK_codigo_clientew` 
  FOREIGN KEY (`PK_codigo_cliente`)
REFERENCES `SIC`.`tbl_cliente` (`PK_codigo_cliente`),
CONSTRAINT `FK_PK_codigo_vendedorw` 
  FOREIGN KEY ( `PK_codigo_vendedor`)
REFERENCES `SIC`.`tbl_vendedor` (`PK_codigo_vendedor`)

  )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_control_factura_encabezado` (
 `PK_codigo_cotizacion_encabezado` INT NOT NULL,
   `PK_codigo_cliente`INT NOT NULL,
   `PK_codigo_cobrador`INT NOT NULL,
   `PK_codigo_vendedor`INT NOT NULL,
   `fecha_emision` VARCHAR(35) NOT NULL,
  PRIMARY KEY (
 `PK_codigo_cotizacion_encabezado`,
   `PK_codigo_cliente`,
   `PK_codigo_vendedor`,
	
      `PK_codigo_cobrador`
),
    CONSTRAINT `Fk_PK_codigo_clienter` 
  FOREIGN KEY (`PK_codigo_cliente`)
REFERENCES `SIC`.`tbl_cliente` (`PK_codigo_cliente`),
CONSTRAINT `FK_PK_codigo_vendedorr` 
  FOREIGN KEY ( `PK_codigo_vendedor`)
REFERENCES `SIC`.`tbl_vendedor` (`PK_codigo_vendedor`),
CONSTRAINT  `FK_PK_codigo_cobradorr`
 FOREIGN KEY ( `PK_codigo_cobrador`)
REFERENCES `SIC`.`tbl_cobrador` ( `PK_codigo_cobrador`)
  )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_cotizacion_detalle` (
 `PK_codigo_cotizacion_detalle` INT NOT NULL,
   `cantidad_detalle` FLOAT(15)NOT NULL,
    `iva_detalle` FLOAT(15) NOT NULL,
   `subtotal_detalle` FLOAT(15) NOT NULL,
  PRIMARY KEY (
 `PK_codigo_cotizacion_detalle` 
   
)
   
  )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `SIC`.`tbl_pedido_detalle` (
 `PK_codigo_pedido_detalle` INT NOT NULL,
  `PK_codigo_cotizacion_detalle` INT NOT NULL,
   `cantidad_detalle` FLOAT(15) NOT NULL,
    `iva_detalle` FLOAT(15) NOT NULL,
   `subtotal_detalle` FLOAT(15)NOT NULL,
  PRIMARY KEY (
 `PK_codigo_pedido_detalle` ,
 `PK_codigo_cotizacion_detalle` ),
 
CONSTRAINT `FK_PK_codigo_cotizacion_detalleZ` 
  FOREIGN KEY ( `PK_codigo_cotizacion_detalle`)
REFERENCES `SIC`.`tbl_cotizacion_detalle` (`PK_codigo_cotizacion_detalle`) 
  )
  ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `SIC`.`tbl_factura_detalle` (
 `PK_codigo_factura_detalle` INT NOT NULL,
  `PK_codigo_pedido_detalle` INT NOT NULL,
   `cantidad_detalle` FLOAT(15) NOT NULL,
    `iva_detalle` FLOAT(15) NOT NULL,
   `subtotal_detalle` FLOAT(15) NOT NULL,
  PRIMARY KEY (
 `PK_codigo_factura_detalle`,
 `PK_codigo_pedido_detalle` 
   
),
  CONSTRAINT `FK_PK_codigo_pedido_detalleZ` 
  FOREIGN KEY ( `PK_codigo_pedido_detalle`)
REFERENCES `SIC`.`tbl_pedido_detalle` (`PK_codigo_pedido_detalle`) 

  
  )
  ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_pedido_detalle` (
 `PK_codigo_pedido_detalle` INT NOT NULL,
  `PK_codigo_cotizacion_detalle` INT NOT NULL,
   `cantidad_detalle` FLOAT(15) NOT NULL,
    `iva_detalle` FLOAT(15) NOT NULL,
   `subtotal_detalle` FLOAT(15) NOT NULL,
  PRIMARY KEY (
 `PK_codigo_pedido_detalle` ,
 `PK_codigo_cotizacion_detalle` 
),
  
 CONSTRAINT `FK_PK_codigo_cotizacion_detalleo` 
  FOREIGN KEY ( `PK_codigo_cotizacion_detalle`)
REFERENCES `SIC`.`tbl_cotizacion_detalle` (`PK_codigo_cotizacion_detalle`) 
  
  )
  
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
CREATE TABLE IF NOT EXISTS `SIC`.`tbl_factura` (
 `PK_codigo_factura` INT NOT NULL,
  `PK_codigo_existencia` INT NOT NULL,
   `PK_codigo_producto`  INT NOT NULL,
    `PK_codigo_precio`  INT NOT NULL,
   `PK_cantidad` INT NOT NULL,
  PRIMARY KEY (
 `PK_codigo_factura`,
 `PK_codigo_existencia`,
 `PK_codigo_producto`,
 `PK_codigo_precio`
),
  CONSTRAINT `FK_PK_codigo_existenciax` 
  FOREIGN KEY ( `PK_codigo_existencia`)
REFERENCES `SIC`.`tbl_pedido_existencia` (`PK_codigo_existencia`) ,

 CONSTRAINT `FK_PK_codigo_productox`
  FOREIGN KEY ( `PK_codigo_producto`)
REFERENCES `SIC`.`tbl_producto` (`PK_codigo_producto`) 
 
  )
  
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `SIC`.`tbl_pedido` (
 `PK_codigo_pedido` INT NOT NULL,
  `PK_codigo_existencia` INT NOT NULL,
   `PK_codigo_producto`  INT NOT NULL,
    `PK_codigo_precio`  INT NOT NULL,
   `cantidad` INT  NOT NULL,
  PRIMARY KEY (
 `PK_codigo_pedido`,
 `PK_codigo_existencia`,
 `PK_codigo_producto`,
 `PK_codigo_precio`
),
  CONSTRAINT `FK_PK_codigo_existenciax` 
  FOREIGN KEY ( `PK_codigo_existencia`)
REFERENCES `SIC`.`tbl_pedido_existencia` (`PK_codigo_existencia`) ,

 CONSTRAINT `FK_PK_codigo_productox`
  FOREIGN KEY ( `PK_codigo_producto`)
REFERENCES `SIC`.`tbl_producto` (`PK_codigo_producto`) 
 
  )
  
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `SIC`.`tbl_devolucion_venta` (
 `PK_codigo_devolucion` INT NOT NULL,
 `PK_codigo_factura` INT NOT NULL,
  `PK_codigo_existencia` INT NOT NULL,
   `PK_codigo_producto`  INT NOT NULL,
    `PK_codigo_precio`  INT NOT NULL,
   `cantidad` INT NOT NULL,
  PRIMARY KEY (
 `PK_codigo_factura`,
 `PK_codigo_existencia`,
 `PK_codigo_producto`,
 `PK_codigo_precio`
),
  CONSTRAINT `FK_PK_codigo_existenciax` 
  FOREIGN KEY ( `PK_codigo_existencia`)
REFERENCES `SIC`.`tbl_pedido_existencia` (`PK_codigo_existencia`) ,

 CONSTRAINT `FK_PK_codigo_productox`
  FOREIGN KEY ( `PK_codigo_producto`)
REFERENCES `administracion`.`tbl_producto` (`PK_codigo_producto`) 
 
  )
  
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


INSERT INTO `SIC`.`tbl_bodega` (`PK_codigo_bodega`, `nombre_bodega`, `estatus_bodega`) VALUES ('1', 'zona1', '1');
INSERT INTO `SIC`.`tbl_bodega` (`PK_codigo_bodega`, `nombre_bodega`, `estatus_bodega`) VALUES ('2', 'zona3', '1');
INSERT INTO `SIC`.`tbl_bodega` (`PK_codigo_bodega`, `nombre_bodega`, `estatus_bodega`) VALUES ('3', 'zona10', '1');
INSERT INTO `SIC`.`tbl_bodega` (`PK_codigo_bodega`, `nombre_bodega`, `estatus_bodega`) VALUES ('4', 'central', '1');

INSERT INTO `SIC`.`tbl_marca` (`PK_codigo_marca`, `nombre_marca`, `estatus_marca`) VALUES ('1', 'cocacola', '1');
INSERT INTO `SIC`.`tbl_marca` (`PK_codigo_marca`, `nombre_marca`, `estatus_marca`) VALUES ('2', 'señorial', '1');
INSERT INTO `SIC`.`tbl_marca` (`PK_codigo_marca`, `nombre_marca`, `estatus_marca`) VALUES ('3', 'lala', '1');
INSERT INTO `SIC`.`tbl_marca` (`PK_codigo_marca`, `nombre_marca`, `estatus_marca`) VALUES ('4', 'sears', '1');
INSERT INTO `SIC`.`tbl_marca` (`PK_codigo_marca`, `nombre_marca`, `estatus_marca`) VALUES ('5', 'kerns', '1');

INSERT INTO `SIC`.`tbl_linea` (`PK_codigo_linea`, `nombre_linea`, `estatus_linea`) VALUES ('1', 'blanca', '1');
INSERT INTO `SIC`.`tbl_linea` (`PK_codigo_linea`, `nombre_linea`, `estatus_linea`) VALUES ('2', 'electronica', '1');
INSERT INTO `SIC`.`tbl_linea` (`PK_codigo_linea`, `nombre_linea`, `estatus_linea`) VALUES ('3', 'deportiva', '1');
INSERT INTO `SIC`.`tbl_linea` (`PK_codigo_linea`, `nombre_linea`, `estatus_linea`) VALUES ('4', 'cosmeticos', '1');

INSERT INTO `SIC`.`tbl_pago` (`PK_codigo_pago`, `tipo_pago`, `descripcion_pago`, `fecha_pago`, `estatus_pago`) VALUES ('1', 'cheque', 'vence el dia', '12/08/2021', '1');
INSERT INTO `SIC`.`tbl_pago` (`PK_codigo_pago`, `tipo_pago`, `descripcion_pago`, `fecha_pago`, `estatus_pago`) VALUES ('2', 'tarjeta', 'banco banrural', '16/08/2021', '1');
INSERT INTO `SIC`.`tbl_pago` (`PK_codigo_pago`, `tipo_pago`, `descripcion_pago`, `fecha_pago`, `estatus_pago`) VALUES ('3', 'efectivo', 'exactos', '20/09/2021', '1');

INSERT INTO `SIC`.`tbl_unidad` (`PK_codigo_unidad`, `unidad_entrada`, `unidad_salida`) VALUES ('1', 'onz', '12');
INSERT INTO `SIC`.`tbl_unidad` (`PK_codigo_unidad`, `unidad_entrada`, `unidad_salida`) VALUES ('2', 'lt', '10');
INSERT INTO `SIC`.`tbl_unidad` (`PK_codigo_unidad`, `unidad_entrada`, `unidad_salida`) VALUES ('3', 'cm', '5');


INSERT INTO `SIC`.`tbl_producto` (`PK_codigo_producto`, `nombre_producto`, `descripcion_producto`, `precio_producto`, `costo_producto`, `estatus_producto`, `codigo_linea`, `codigo_marca`, `codigo_bodega`, `codigo_unidad`) VALUES ('1', 'planchas', 'ingreso 17/08/2021', '120', '120', '1', '2', '4', '4', '2');
INSERT INTO `SIC`.`tbl_producto` (`PK_codigo_producto`, `nombre_producto`, `descripcion_producto`, `precio_producto`, `costo_producto`, `estatus_producto`, `codigo_linea`, `codigo_marca`, `codigo_bodega`, `codigo_unidad`) VALUES ('2', 'jugos', 'ingreso 12/09/2021', '12', '12', '1', '1', '5', '4', '1');

INSERT INTO `SIC`.`tbl_proveedor` (`PK_codigo_proveedor`, `nombre_proveedor`, `direccion_proveedor`, `telefono_proveedor`, `nit_proveedor`, `email_proveedor`, `saldo_proveedor`, `estatus_proveedor`) VALUES ('1', 'serveceria gallo', 'zona 2 3-00', '51169327', '456789', 'gallo@gmial.com', '0', '1');
INSERT INTO `SIC`.`tbl_proveedor` (`PK_codigo_proveedor`, `nombre_proveedor`, `direccion_proveedor`, `telefono_proveedor`, `nit_proveedor`, `email_proveedor`, `saldo_proveedor`, `estatus_proveedor`) VALUES ('2', 'cañareal', 'zona12 8-00', '2200800', '7890', 'cañareal@gmail.com', '0', '1');