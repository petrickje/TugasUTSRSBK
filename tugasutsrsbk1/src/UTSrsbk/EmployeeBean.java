package UTSrsbk;

import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.validator.ValidatorException;
import java.util.Arrays;
@ManagedBean
@SessionScoped
public class EmployeeBean {

	// Member Variables
	private String namaDepan;
	private String namaBelakang;
	private String kota;
	private String negara; 
	private String pos; 
	private String komentar;
	
	private String fasilitas;
	private Date tglsurvey;
	private String address;
	private String emailAddress;
	private String mobileNumber;
	

	private String rekomendasi;

	

	
	 public String[] suka;

	  public String[] getsuka() {
	    return suka;
	  }
	  public void setsuka(String[] suka) {
	    this.suka = suka;
	  }

	  public String getsukaInString() {
	    return Arrays.toString(suka);
	  }
	 
	
	public void setKomentar(String komentar) {
		this.komentar = komentar;
	}
	
	public String getKomentar() {
		return komentar;
	}
	
	public void setNamaDepan(String namaDepan) {
		this.namaDepan = namaDepan;
	}
	
	public String getNamaDepan() {
		return namaDepan;
	}
	
	public void setNamaBelakang(String namaBelakang) {
		this.namaBelakang = namaBelakang;
	}
	
	public String getNamaBelakang() {
		return namaBelakang;
	}

	public void setKota(String kota) {
		this.kota = kota;
	}
	
	public String getKota() {
		return kota;
	}
	
	
	
	public void setnegara(String negara) {
		this.negara = negara;
	}
	
	public String getnegara() {
		return negara;
	}
	

	public void setPos(String pos) {
		this.pos = pos;
	}
	
	public String getPos() {
		return pos;
	}
	

	
	
	public String getfasilitas() {
		return fasilitas;
	}

	public void setfasilitas(String fasilitas) {
		this.fasilitas = fasilitas;
	}

	public Date gettglsurvey() {
		return tglsurvey;
	}

	public void settglsurvey(Date tglsurvey) {
		this.tglsurvey = tglsurvey;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}




	public String getrekomendasi() {
		return rekomendasi;
	}

	public void setrekomendasi(String rekomendasi) {
		this.rekomendasi = rekomendasi;
	}

	// Validate Email
	public void validateEmail(FacesContext context, UIComponent toValidate, Object value) throws ValidatorException {
		String emailStr = (String) value;
		if (-1 == emailStr.indexOf("@")) {
			FacesMessage message = new FacesMessage("Email Address is Valid");
			throw new ValidatorException(message);
		}
	}
}
