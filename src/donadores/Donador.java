package donadores;

public class Donador 
{
	private String 	curp,
					nombres,
					ap1,
					ap2,
					correo,
					tel,
					cel;
	private int tipo_sangre;
	private boolean utd;
	private String resp_nombre, resp_tel, resp_direccion;
	
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getAp1() {
		return ap1;
	}
	public void setAp1(String ap1) {
		this.ap1 = ap1;
	}
	public String getAp2() {
		return ap2;
	}
	public void setAp2(String ap2) {
		this.ap2 = ap2;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCel() {
		return cel;
	}
	public void setCel(String cel) {
		this.cel = cel;
	}
	public int getTipo_sangre() {
		return tipo_sangre;
	}
	public void setTipo_sangre(int tipo_sangre) {
		this.tipo_sangre = tipo_sangre;
	}
	public boolean isUtd() {
		return utd;
	}
	public void setUtd(boolean utd) {
		this.utd = utd;
	}
	public String getResp_nombre() {
		return resp_nombre;
	}
	public void setResp_nombre(String resp_nombre) {
		this.resp_nombre = resp_nombre;
	}
	public String getResp_tel() {
		return resp_tel;
	}
	public void setResp_tel(String resp_tel) {
		this.resp_tel = resp_tel;
	}
	public String getResp_direccion() {
		return resp_direccion;
	}
	public void setResp_direccion(String resp_direccion) {
		this.resp_direccion = resp_direccion;
	}
	
	@Override
	public String toString() {
		return "Donador [curp=" + curp + ", nombres=" + nombres + ", ap1=" + ap1 + ", ap2=" + ap2 + ", correo=" + correo
				+ ", tel=" + tel + ", cel=" + cel + ", tipo_sangre=" + tipo_sangre + ", utd=" + utd + ", resp_nombre="
				+ resp_nombre + ", resp_tel=" + resp_tel + ", resp_direccion=" + resp_direccion + "]";
	}
	

}
