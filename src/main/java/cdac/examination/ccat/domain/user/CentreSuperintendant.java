package cdac.examination.ccat.domain.user;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cdac.examination.ccat.domain.exam.Centre;

@Entity
@Table(name="CENTRE_SUPER")
@DiscriminatorValue("CENTRE_SUPER")
public class CentreSuperintendant extends User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	Centre centre;
	
	public CentreSuperintendant(){
		
	}

	public CentreSuperintendant(Centre centre) {
		this.centre = centre;
	}

	public Centre getCentre() {
		return centre;
	}

	public void setCentre(Centre centre) {
		this.centre = centre;
	}
	
}
