package com.pe.bcp.tech.constant;


public class Constant {

    private Constant() {
        throw new IllegalStateException("Constant class");
    }
    
	public static final Integer COD_OK = 0;
    public static final Integer COD_EMPTY = 1;
	public static final Integer COD_ERR = -1;

	
	public static final String DATA_OK = "OK";
	public static final String DATA_EMPTY = "No hay data para esta consulta";
}
