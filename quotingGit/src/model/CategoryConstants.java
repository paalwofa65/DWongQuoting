package model;

public enum CategoryConstants {
	ALL ("Todas las categorias"),
	NOCAT ("Sin categoria"),
	MELAM ("Melamine"),
	DRYWA ("Drywall"),
	ELECT ("Electricidad"),
	ILUMI ("Iluminacion"),
	SANIT ("Sanitarios"),
	GASFI ("Gasfiteria"),
	ALBAN ("Albañileria"),
	PISO ("Piso"),
	CIERA ("CieloRaso"),
	TRANS ("Transporte"),
	PINTU ("Pintura"),
	AIREC ("AireAcondicionado"),
	VIDRI ("Vidrios"),
	REDES ("Redes/TV/CCTV"),
	CARPI ("Carpinteria"),
	HERRA ("Herramientas"),
	SERVI ("Servicios"),
	VARIO ("Varios"),
	MOBIL ("Mobiliario");
	
	private String constant;

	private CategoryConstants(String constant) {	
		this.constant = constant;
	}
	
	public String toString(){
		return constant;
	}
	
	public static  CategoryConstants getConstant(String value){
		for(CategoryConstants cc : CategoryConstants.values()){
			if(value.equals(cc.toString())){
				return cc;
			}
		}
		return CategoryConstants.NOCAT;
	}

}
