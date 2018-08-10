package model;

public enum UnitConstants {
	NUL("nul"),
	UND("und"), 
	MTL("mtl"), 
	MT2("mt2"), 
	MT3("mt3"), 
	KGM("kgm"), 
	GRM("grm"), 
	CAJ("caj"), 
	BLD("bld"), 
	BOL("bol"), 
	RLL("rll"),
	VIA("via"),
	DHM("dhm"),
	GLB("glb");

	private String constant;

	private UnitConstants(String constant) {
		this.constant = constant;
	}
	
	public String toString(){
		return constant;
	}

	public static  UnitConstants getConstant(String value){
		for(UnitConstants uc : UnitConstants.values()){
			if(value.equals(uc.toString())){
				return uc;
			}
		}
		return UnitConstants.NUL;
	}
}
