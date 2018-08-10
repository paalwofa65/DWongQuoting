package model;

public enum IgvConstants {
	SIN_IGV ("Sin IGV"),
	INC_IGV ("Incluido IGV");
		
	private String constant;

	private IgvConstants(String constant) {	
		this.constant = constant;
	}
	
	public String toString(){
		return constant;
	}
	
	public static  IgvConstants getConstant(String value){
		for(IgvConstants cc : IgvConstants.values()){
			if(value.equals(cc.toString())){
				return cc;
			}
		}
		return IgvConstants.SIN_IGV;
	}

}
